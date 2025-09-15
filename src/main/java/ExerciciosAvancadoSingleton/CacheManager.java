package ExerciciosAvancadoSingleton;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Cache em memória com expiração por item. Singleton thread-safe usando Holder.
 */
public final class CacheManager {
    private final Map<String, Entry> store = new ConcurrentHashMap<>();
    private volatile Duration ttl = Duration.ofSeconds(30); // default

    private CacheManager() {}

    private static class Holder { private static final CacheManager INSTANCE = new CacheManager(); }
    public static CacheManager getInstance() { return Holder.INSTANCE; }

    public void setTtlSeconds(long seconds) {
        if (seconds <= 0) throw new IllegalArgumentException("TTL deve ser > 0");
        this.ttl = Duration.ofSeconds(seconds);
    }

    public void put(String key, Object value) {
        Objects.requireNonNull(key, "key");
        store.put(key, new Entry(value, Instant.now()));
    }

    public Optional<Object> get(String key) {
        Objects.requireNonNull(key, "key");
        Entry e = store.get(key);
        if (e == null) return Optional.empty();
        if (isExpired(e)) {
            store.remove(key);
            return Optional.empty();
        }
        return Optional.ofNullable(e.value);
    }

    public Object getOrCompute(String key, DataSource source) {
        Objects.requireNonNull(source, "source");
        Optional<Object> cached = get(key);
        if (cached.isPresent()) return cached.get();
        Object fresh = source.fetch(key);
        put(key, fresh);
        return fresh;
    }

    public void invalidate(String key) { if (key != null) store.remove(key); }
    public void clear() { store.clear(); }

    private boolean isExpired(Entry e) {
        return Instant.now().isAfter(e.created.plus(ttl));
    }

    private static class Entry {
        final Object value; final Instant created;
        Entry(Object value, Instant created) { this.value = value; this.created = created; }
    }

    public interface DataSource { Object fetch(String key); }
}

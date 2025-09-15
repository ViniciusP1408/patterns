package ExerciciosAvancadoSingleton;

public class AppCache {
    public static void main(String[] args) throws InterruptedException {
        CacheManager cache = CacheManager.getInstance();
        cache.setTtlSeconds(2);

        CacheManager.DataSource baseLenta = key -> {
            try { Thread.sleep(300); } catch (InterruptedException ignored) {}
            return "VALOR-" + key + "-" + System.currentTimeMillis();
        };

        String k = "usuario:42";
        System.out.println("Primeira consulta (deve ir na base)...");
        System.out.println(cache.getOrCompute(k, baseLenta));

        System.out.println("Segunda consulta (deve vir do cache)...");
        System.out.println(cache.getOrCompute(k, baseLenta));

        System.out.println("Aguardando expirar...");
        Thread.sleep(2200);

        System.out.println("Terceira consulta (cache expirado, vai na base de novo)...");
        System.out.println(cache.getOrCompute(k, baseLenta));
    }
}

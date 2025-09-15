package ExerciciosAvancadoFactoryMethod.transporte;

public class TransporteFactory {
    public static Transporte escolher(double distanciaKm, double orcamento, int minutos) {
        // estratégia simples: baixo orçamento -> ônibus; curta distância e tempo -> patinete; caso contrário -> táxi
        Transporte onibus = new Onibus(40, "Centro-Bairro");
        Transporte patinete = new PatineteEletrico(0.50, 80);
        Transporte taxi = new Taxi(2.5);

        double custoOnibus = onibus.estimarCusto(distanciaKm, minutos);
        double custoPatinete = patinete.estimarCusto(distanciaKm, minutos);
        double custoTaxi = taxi.estimarCusto(distanciaKm, minutos);

        // tenta o mais barato que caiba no orçamento
        double menor = Math.min(custoOnibus, Math.min(custoPatinete, custoTaxi));
        if (menor == custoPatinete && custoPatinete <= orcamento) return patinete;
        if (custoOnibus <= orcamento) return onibus;
        if (custoTaxi <= orcamento) return taxi;
        // se nada couber, retorna o mais barato (mesmo ultrapassando)
        if (menor == custoPatinete) return patinete;
        if (menor == custoOnibus) return onibus;
        return taxi;
    }
}

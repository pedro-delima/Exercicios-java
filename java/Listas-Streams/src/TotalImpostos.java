import java.util.List;

public class TotalImpostos {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        double totalSemImpostos = precosProdutos.stream().reduce(0.0, Double::sum);
        System.out.println("Total antes do imposto: " + totalSemImpostos);
        double totalComImposto = totalSemImpostos * 1.08;
        System.out.printf("Total com imposto: %.2f", totalComImposto);

    }
}

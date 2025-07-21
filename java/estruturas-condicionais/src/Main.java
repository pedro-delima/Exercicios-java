
public class Main {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.0;
        int numerosIndependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor de Irrf: " + irrf);
        } else if (isento ) {
            System.out.println("Contribuinte isento de IRRF");
        } else {
            System.out.println("Você é proble");
        }
    }
}

import java.util.Scanner;
public class VerificacaoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        if (valorCompra >= 100) {
            System.out.println("Elegivel para desconto!");
            double calculo = valorCompra * 0.90;
            System.out.println("Valor total: "+ calculo);

        }
        else {
            double calculo = 100 - valorCompra;
            System.out.println("Voce ainda precisa comprar " + calculo + "para receber o desconto");
        }
    }
}

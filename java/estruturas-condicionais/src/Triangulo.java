import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        double lado1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado do triangulo");
        double lado2 = scanner.nextDouble();
        System.out.println("Digite o terceiro lado do triangulo");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
            System.out.println("Triangulo possivel");
        }
        else {
            System.out.println("Impossivel");
        }
    }
}

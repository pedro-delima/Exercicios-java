import java.util.Scanner;
public class Par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        boolean par = false;
        if (numero % 2 == 0) {
            par = true;
        }
        else {
            par = false;
        }

        System.out.println("É par: "+ par);
    }
}

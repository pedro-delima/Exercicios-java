public class SomaNumeros {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
        int soma1 = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];


        }
        for (int i: valores) {
            soma1 += i;
        }
        System.out.println(soma1);
        System.out.println(soma);
    }
}

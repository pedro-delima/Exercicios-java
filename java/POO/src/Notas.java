public class Notas {
    String aluno;
    double nota1;
    double nota2;

    public void Situacao() {
        if ((nota1 + nota2) / 2 >= 7) {
            System.out.printf("Aprovado");

        }
        else {
            System.out.printf("Reprovado");
        }
        System.out.println("Aluno: " + aluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.1f\n", (nota1 + nota2) / 2);
    }

}

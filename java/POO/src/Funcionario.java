public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exiberInformacoes() {
        System.out.printf("Funcionario %s - Cargo %s - Salario %.2f", nome, cargo, salario);
    }
    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salario de %s é %.2f", nome, salario);
    }
}

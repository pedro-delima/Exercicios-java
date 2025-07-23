public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Ana";
        funcionario1.cargo = "Gerente de projetos";
        funcionario1.salario = 9000;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "João";
        funcionario2.cargo = "Desenvolvedor";
        funcionario2.salario = 8500;


        funcionario2.exiberInformacoes();

        funcionario1.reajustarSalario(10);
    }
}
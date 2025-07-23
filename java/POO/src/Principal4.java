public class Principal4 {
    public static void main(String[] args) {
        CorrigindoCadastro pessoa1 = new CorrigindoCadastro();
        pessoa1.nome ="Paulo";
        pessoa1.cargo="Gerente de vendas";
        pessoa1.nivelAcesso =1;

        pessoa1.atualizarDados("Diretor da empresa", 2);
    }
}

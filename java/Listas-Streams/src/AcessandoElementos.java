import java.util.ArrayList;
import java.util.List;

public class AcessandoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");
        System.out.println("Total de funcionarios: " + funcionarios.size());
        String segundaPessoa = funcionarios.get(1);
        System.out.println("Segunda pessoa da lista: "+ segundaPessoa);
    }
}

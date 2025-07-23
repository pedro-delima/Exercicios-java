import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("João");

        System.out.println(funcionarios.get(1));

        Set<String> produtos = new HashSet<>();
        produtos.add("agua");
        produtos.add("refrigerante");
        produtos.add("agua");
        System.out.println(produtos);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        System.out.println(clientes.get(2));

    }
}
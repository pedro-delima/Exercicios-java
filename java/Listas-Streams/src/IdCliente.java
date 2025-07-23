import java.util.HashMap;
import java.util.Map;

public class IdCliente {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Viniccios 13");
        clientes.put(2, "Marcos");
        clientes.put(3, "Steve Jobs");
        clientes.put(4, "Plato");
        clientes.put(5, "Ayrton Senna");
        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));

    }
}

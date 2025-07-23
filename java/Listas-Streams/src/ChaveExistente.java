import java.util.HashMap;
import java.util.Map;

public class ChaveExistente {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Viniccios 13");
        clientes.put(2, "Marcos");
        clientes.put(3, "Steve Jobs");
        clientes.put(4, "Plato");
        clientes.put(5, "Ayrton Senna");

        if (clientes.containsKey(5)) {
            System.out.println("O cliente com ID 5 é: "+ clientes.get(5));
        }
        else {
            System.out.println("Chave vazia");
        }



    }
}
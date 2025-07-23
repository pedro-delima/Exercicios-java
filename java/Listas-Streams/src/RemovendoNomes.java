import java.util.ArrayList;
import java.util.List;

public class RemovendoNomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joana");
        nomes.add("Lucas");
        nomes.add("Pedro");
        nomes.add("Antonio");
        System.out.println("Lista inicial: "+ nomes);
        nomes.remove(2);

        System.out.println("Lista apos a exclusao" + nomes);
    }
}

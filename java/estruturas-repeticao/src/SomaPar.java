public class SomaPar {
    public static void main(String[] args) {
        int somaPares = 0;
        for (int i = 0; i<=100; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
            else {
                continue;
            }
        }
        System.out.println(somaPares);
    }
}

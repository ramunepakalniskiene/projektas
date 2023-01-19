package java3;

public class ForCiklas {
    public static void main(String[] args) {
        int skaicius = 2;
        int laipsnis = 5;
        int rezultatas = skaicius;
        for (int i = 0; i < laipsnis; i++) {
            rezultatas = rezultatas * skaicius;
        }

        System.out.println("Keltas skaicius =" + skaicius);
        System.out.println("Laipsnis = "+ laipsnis);
        System.out.println("Rezultatas "+ rezultatas);
    }
}

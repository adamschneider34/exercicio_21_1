
public class Main {
    public static void main(String[] args) {
        for (int n = 1; n <= 4; n++) {
            System.out.println("Tabuada do " + n);
            for (int i = 1; i <= 10; i++) {
                int mult = i * n;
                System.out.println(n + " x " + i + " = " + mult);
            }
            System.out.println();
        }
    }
}
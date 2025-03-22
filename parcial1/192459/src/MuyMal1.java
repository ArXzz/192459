import java.util.Scanner;

public class MuyMal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número límite:");
        int L = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= L; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma total de múltiplos de 3 o 5: " + suma);
    }
}

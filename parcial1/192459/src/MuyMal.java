import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número límite:");
        int L = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= L; i++) {
            if (i % 3 == 0) {
                suma += i; 
                System.out.println(i + " es múltiplo de 3");
            } else if (i % 5 == 0) {
                suma += i; 
                System.out.println(i + " es múltiplo de 5");
            } else {
                suma += i; 
                System.out.println(i + " no es múltiplo de 3 ni 5");
            }
        }

        System.out.println("Suma total: " + suma);
    }
}

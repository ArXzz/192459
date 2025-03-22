import java.util.Scanner;

public class multometro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int velocidad;
        String conductor;

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese su nombre");
            conductor = scanner.nextLine();
            System.out.println("ingrese a cuantos km/h iba ");
            velocidad = scanner.nextInt();

            scanner.nextLine();
            
            if (velocidad > 60) {
                System.out.println("usted ha recibido una multa por pend*jo");
                double multa = velocidad * 2.5;
                System.out.println("valor de la multa: " + multa);

            } else if (velocidad < 60) {
                System.out.println("felicidades usted es un ciudadano ejemplar");

            }
        }
    }
}

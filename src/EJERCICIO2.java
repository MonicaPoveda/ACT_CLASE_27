import java.util.Random;
import java.util.Scanner;

public class EJERCICIO2 {
        public static void main(String[] args) {

            int max = 50;
            int min = 1;
            int numeroaleatorio;
            int numero1;

            Random ale = new Random();

            Scanner teclado = new Scanner(System.in);
            numeroaleatorio = ale.nextInt((max - min + 1)) + min;
            System.out.println("El numero aleatorio es: " + numeroaleatorio);



            for (int i = 1; i<=3; i++) {
                System.out.println("Ingrese un numero:");
                numero1 = teclado.nextInt();

                if (numero1 > numeroaleatorio) {
                    System.out.println("El numero a adivinar es menor");
                } else if (numero1 < numeroaleatorio) {
                    System.out.println("El numero a adivinar es mayor");
                } else if (numero1 == numeroaleatorio)
                    System.out.println("-*-*-*Adivinaste el numero-*-*-*-");

            }
            System.out.println("¡¡¡¡¡¡¡¡ PERDISTEEEEEE  !!!!!!");
            System.out.println("El numero era: " +numeroaleatorio);
        }

    }

}

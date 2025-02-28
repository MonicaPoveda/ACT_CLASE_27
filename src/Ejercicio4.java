import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double platainicial;
        int numeroaleatorio;
        int max = 3;
        int min = 1;
        double estadodinero;
        int respuesta;
        boolean estado=true;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de dinero para iniciar");
        platainicial = teclado.nextDouble();

        Random ale = new Random();
        numeroaleatorio = ale.nextInt((max - min + 1)) + min;
        System.out.println("El numero aleatorio es:" + numeroaleatorio);

        do {
            if (numeroaleatorio == 1) {
                platainicial = platainicial * 2;
                System.out.println("A duplicado su dinero, Saldo= " + platainicial);
                System.out.println("Quiere seguir jugando; RESPONDA   1:SI    2: NO ");
                respuesta= teclado.nextInt();
                if(respuesta==1){
                    numeroaleatorio = ale.nextInt((max - min + 1)) + min;
                    System.out.println("NUEVO NUMERO ALEATORIO: "+numeroaleatorio);
                    continue;
                } else if (respuesta==2) {
                    System.out.println("se retiro con: "+platainicial);
                    estado=false;
                }


            } else if (numeroaleatorio == 2) {
                platainicial = platainicial / 2;
                System.out.println("A perdido la mitad de su dinero, Saldo=" + platainicial);
                System.out.println("Quiere seguir jugando; RESPONDA   1:SI    2: NO");
                respuesta= teclado.nextInt();
                if (respuesta==1){
                    numeroaleatorio = ale.nextInt((max - min + 1)) + min;
                    System.out.println("NUEVO Numero aleatorio: "+numeroaleatorio);
                    continue;
                } else if (respuesta==2) {
                 estado=false;
                }


            } else if (numeroaleatorio == 3) {
                platainicial = platainicial * 0;
                System.out.println("A perdido todo su dinero, saldo= " + platainicial);
            }
            break;
        }while(estado);



    }
}
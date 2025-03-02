import java.util.Random;
import java.util.Scanner;

public class TAREA_02 {
    public static void main(String[] args) {
        System.out.println("*-*-BIENVENIDO A TU CALCULADORA*-*-");
        double numero1,numero2;
        String signo;
        double resultado;
        boolean estado=true;
        int respuesta;

        Scanner teclado = new Scanner(System.in);


            do {
                System.out.println("Por favor ingrese el primer numero 1-100");
                numero1 = teclado.nextDouble();

                System.out.println("Por favor ingrese el segundo numero 1-100");
                numero2 = teclado.nextDouble();

                System.out.println("Ingrese el signo aritmetico de la operacion a realizar: +  -  *  /  ^  %");
                signo= teclado.next();

        if (signo.equals("+")) {
            resultado = numero1+numero2;
            System.out.println("=" + resultado);
            System.out.println("Quiere seguir operando  1:SI    2:NO");
            respuesta=teclado.nextInt();
                    if(respuesta==1){
                        continue;
                    }else if (respuesta==2){
                        estado=false;
                    }

        } else if (signo.equals("-")) {
            resultado = numero1-numero2;
            System.out.println("=" + resultado);
            System.out.println("Quiere seguir operando  1:SI    2:NO");
            respuesta=teclado.nextInt();
            if(respuesta==1){
                continue;
            }else if (respuesta==2){
                estado=false;
            }

        } else if (signo.equals("*")) {
            resultado = numero1*numero2;
            System.out.println("=" + resultado);
            System.out.println("Quiere seguir operando  1:SI    2:NO");
            respuesta=teclado.nextInt();
            if(respuesta==1){
                continue;
            }else if (respuesta==2){
                estado=false;
            }

        } else if (signo.equals("/")) {
            resultado = numero1/numero2;
            System.out.println("=" + resultado);
            System.out.println("Quiere seguir operando  1:SI    2:NO");
            respuesta=teclado.nextInt();
            if(respuesta==1){
                continue;
            }else if (respuesta==2){
                estado=false;
            }

        } else if (signo.equals("^")) {
            resultado = Math.pow(numero1, numero2);
            System.out.println("=" + resultado);
            System.out.println("Quiere seguir operando  1:SI    2:NO");
            respuesta=teclado.nextInt();
            if(respuesta==1){
                continue;
            }else if (respuesta==2){
                estado=false;
            }

        } else if (signo.equals("%")) {
            resultado = numero1%numero2;
            System.out.println("=" + resultado);
            System.out.println("Quiere seguir operando  1:SI    2:NO");
            respuesta=teclado.nextInt();
            if(respuesta==1){
                continue;
            }else if (respuesta==2){
                estado=false;
            }

        } else {
            System.out.println("SIGNO ARITMETICO NO VALIDO");

        }
        break;
    }while(estado);
    }
}

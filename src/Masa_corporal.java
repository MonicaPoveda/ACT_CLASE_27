import java.util.Random;
import java.util.Scanner;

public class Masa_corporal {
    public static void main(String[] args) {
        double peso;
        double estatura;
        double IMC;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese su peso (Kg): ");
        peso = teclado.nextDouble();
        System.out.println("Por favor ingrese su estatura: ");
        estatura = teclado.nextDouble();

        IMC = (peso / Math.pow(estatura, 2));
        System.out.println("Su IMC es de : " + IMC);

        if (IMC < 18.5) {
            System.out.println("*-*-Usted esta bajo peso-*-*");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("*-*-*Usted tiene un peso normal*-*-");
        } else if (IMC >= 25 && IMC <= 26.9) {
            System.out.println("*-*-*Usted tiene sobrepeso grado 1*-*-");
        } else if (IMC >= 27 && IMC <= 29.9) {
            System.out.println("*-**-Usted tiene sobrepeso grado 2");
        } else if (IMC >= 30 && IMC <= 34.9){
            System.out.println("*-*Usted tiene obesisda de tipo 1");
        } else if (IMC >=35 && IMC <=39.9) {
            System.out.println("*-*-*Usted tiene obesidad de tipo 2");
        }else if (IMC >=40 && IMC <=49.9) {
            System.out.println("*-*-Usted tiene obesidad de tipo 3 (morbida)");
        }else if (IMC >=50){
            System.out.println("Usted tiene obesidad de tipo 4(extrema)");
    }
}






}

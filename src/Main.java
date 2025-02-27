import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int rondas, dado1, dado2;
        int contD1=0; int contD2=0;
        Random Ale = new Random();

        rondas = Ale.nextInt((10 - 1 + 1)) + 1;
        System.out.println("CANTIDAD DE RONDAS: "+rondas);
        for (int i=1; i <= rondas; i++) {
            dado1 = Ale.nextInt((6 - 1 + 1)) + 1;
            System.out.print("DADO1:" + dado1);

            contD1+=dado1;
            dado2 = Ale.nextInt((6 - 1 + 1));
            System.out.print("DADO2:" + dado2);

            contD2+=dado2;
            System.out.println("");
            if (contD1>contD2){
                System.out.println("*-*-GANA EL DADO 1*-*- " );

            }else
                System.out.println("*-*-GANA DADO 2 *-*-");


        }
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, random, contadorPar, contadorImpar;
        int check;


        contadorPar = 0;
        contadorImpar = 0;

        System.out.println("Digite un numero");

        num = entrada.nextInt();

        for (int i = 0; i < num; i++) {

            random = ((int)Math.floor(Math.random()*100 - 0 +1) + 0);
            System.out.println("El numero random generado es");
            System.out.println(random);
            System.out.println("");

            check = random % 2;

            if (check == 0){
                contadorImpar = contadorPar + 1;
                System.out.println("Hay " + contadorPar + " pares");
            } else{
                contadorImpar = contadorImpar + 1;
                System.out.println("Hay " + contadorImpar + " impares");
            }

        }

        System.out.println("Hay " + contadorImpar + " impares y " + contadorPar + "pares");

    }
}
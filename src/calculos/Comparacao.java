package calculos;

import java.util.Scanner;

public class Comparacao {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //cria a scanner

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = input.nextInt();

            if(numero1 == numero2){
                System.out.printf("%d == %d%n", numero1, numero2);
            }
            if (numero1 != numero2){
                System.out.printf("%d != %d%n", numero1, numero2);
            }
            if (numero1 < numero2){
                System.out.printf("%d < %d%n", numero1, numero2);
            }
            if (numero1 > numero2){
                System.out.printf("%d > %d%n", numero1, numero2);
            }
            if (numero1 <= numero2){
                System.out.printf("%d <= %d%n", numero1, numero2);
            }
            if (numero1 => numero2){
                System.out.printf("%d => %d%n", numero1, numero2);
            }

            //chatinho escrever esses if hahaha


    }//fim main
}//fim classe Comparacao

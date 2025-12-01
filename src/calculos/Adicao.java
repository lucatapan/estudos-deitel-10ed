package calculos;

import java.util.Scanner;//import da classe Scanner

public class Adicao {

    public static void main(String[] args){

        //cria um scanner para obter numeros a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int numero1; //primeiro numero a somar
        int numero2; //segundo numero a somar
        int soma; //soma do numero1 e numero2

        System.out.print("Entre com o primeiro número inteiro: ");//prompt
        numero1 = input.nextInt(); //lê o número fornecdo pelo usuario

        System.out.print("Entre com o segundo número inteiro: ");//prompt
        numero2 = input.nextInt();  //lê o número fornecido pelo usuario

        soma = numero1 + numero2; //Soma os dois inteiros e armazena na variavel inteira soma

        System.out.printf("A soma é %d%n", soma); //exibe a soma


    }

}

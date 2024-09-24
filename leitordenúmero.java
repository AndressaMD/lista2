/* Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números
ímpares e a soma dos números pares. Observação: O programa será encerrado quando um
valor negativo for inserido*/

import java.util.Scanner;
class l4 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        
      int produtoimpares = 1; 
      int somapares = 0;      
      boolean encontrouimpar = false; 

       while (true) {
            System.out.print("Digite um número inteiro positivo (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            }

            if (numero % 2 == 0) {
               somapares += numero;
            } else {
              produtoimpares *= numero;
                encontrouimpar = true; 
            }

        if (encontrouimpar) {
            System.out.println("Produto dos números ímpares: " + produtoimpares);
        } else {
            System.out.println("Nenhum número ímpar foi inserido.");
        }
        System.out.println("Soma dos números pares: " + somapares);

    
}}}

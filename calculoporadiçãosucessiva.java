/* Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro),
ou seja, A*B, por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos
pela pessoa utilizadora do programa. */

import java.util.Scanner;
class l2 {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    Double numberreal;
    Integer numberint;

   System.out.println("Digite o número real: ");
    numberreal = entry.nextDouble();

   System.out.println("Digite o número inteiro: ");
    numberint = entry.nextInt();

        int resultado = 0;
       
    
    while ( numberint < numberreal){     
    resultado += numberreal; 
    numberint++;


   System.out.println("Resultado da multiplicação: " + resultado);


  }
}}

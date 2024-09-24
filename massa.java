/* Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo.
Sabendo-se que este perde 25% de sua massa a cada 30 segundos. Criar um programa que
calcule iterativamente e imprima o tempo necessário para que a massa deste material se torne
menor que 0, 10 grama. O programa pode calcular o tempo para várias massas.  */

import java.util.Scanner;
class l3 {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    double massainicial;
    double massafinal = 0.10;
    int tempoTotal = 0;

     System.out.print("Digite a massa inicial do material (em gramas): ");
        massainicial = entry.nextDouble();
    while (massainicial >= massafinal) {
            massainicial *= 0.75;
            tempoTotal += 30;}
  
     System.out.println("Tempo necessário para a massa se tornar menor que 0,10 g: " + tempoTotal + " segundos.");
}
}

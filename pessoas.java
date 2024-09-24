
import java.util.Scanner;

public class l5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeacima50 = 0; 
        double somaalturas = 0; 
        int quantidades10a20 = 0; 
        int compesoinferior40 = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (em quilos): ");
            double peso = scanner.nextDouble();

         if (idade > 50) {
                quantidadeacima50++;
            }
         if (idade >= 10 && idade <= 20) {
                somaalturas += altura;
                quantidades10a20++;
            }
         if (peso < 40) {
                compesoinferior40++;
        }}

         double mediaalturas = quantidades10a20 > 0 ? somaalturas / quantidades10a20 : 0;
         double porcentagempesoinferior40 = (compesoinferior40 / 10.0) * 100;

        
        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + quantidadeacima50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaalturas);
        System.out.printf("Porcentagem de pessoas com peso inferior a 40 quilos: %.2f%%\n", porcentagempesoinferior40);

    }
}

import java.util.Scanner;
public class l7 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma forma geométrica:");
            System.out.println("1. Retângulo");
            System.out.println("2. Diagonal Superior Esquerda");
            System.out.println("3. Diagonal Superior Direita");
            System.out.println("4. Diagonal Inferior Esquerda");
            System.out.println("5. Diagonal Inferior Direita");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Informe a quantidade de colunas: ");
                int colunas = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        desenharRetangulo(colunas);
                        break;
                    case 2:
                        desenharDiagonalSuperiorEsquerda(colunas);
                        break;
                    case 3:
                        desenharDiagonalSuperiorDireita(colunas);
                        break;
                    case 4:
                        desenharDiagonalInferiorEsquerda(colunas);
                        break;
                    case 5:
                        desenharDiagonalInferiorDireita(colunas);
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
        
        System.out.println("Saindo...");
        scanner.close();
    }
    public static void desenharRetangulo(int colunas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void desenharDiagonalSuperiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
 } }
   public static void desenharDiagonalSuperiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= colunas - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
} }
     public static void desenharDiagonalInferiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
}}
     public static void desenharDiagonalInferiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j < colunas - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
                 System.out.println();
}}}

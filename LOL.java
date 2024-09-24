import java.util.Scanner;

public class l6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalKills = 0;
        int totalDeaths = 0;
        int totalAssists = 0;

        while (true) {
          System.out.print("Há um vencedor? (s/n): ");
            String vencedor = scanner.next();

            if (vencedor.equalsIgnoreCase("s")) {
                System.out.println("Fim do jogo!");
                break;
            }

       System.out.print("Digite o número de kills: ");
        int kills = scanner.nextInt();
       System.out.print("Digite o número de deaths: ");
        int deaths = scanner.nextInt();
       System.out.print("Digite o número de assists: ");
        int assists = scanner.nextInt();

         totalKills += kills;
         totalDeaths += deaths;
         totalAssists += assists;

            if (totalKills <= 5) {
                System.out.println("Status: noob...");
            } else if (totalKills >= 20) {
                System.out.println("Status: master!!");
            }
            if (totalDeaths >= 20) {
                System.out.println("Houston, we have a problem.");
            }
            if (totalAssists >= 20) {
                System.out.println("Team Work!!");
            }

            System.out.println("Total de Kills: " + totalKills);
            System.out.println("Total de Deaths: " + totalDeaths);
            System.out.println("Total de Assists: " + totalAssists);
            System.out.println("-------------------------------");
}
}
}

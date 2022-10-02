import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Player player1 = new Player("Mike", 5, 3, 5.5, 10);

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Player's name: ");
        String name = input.nextLine();

        System.out.print("Please Enter Number of Matches: ");
        int numOfMatches = input.nextInt();

        System.out.print("Please Enter Number of International Caps: ");
        int numOfInternationalCaps = input.nextInt();

        System.out.print("Please Enter Height: ");
        double height = input.nextDouble();

        System.out.print("Please Enter Number of Scored Goals and Assists Given: ");
        int numOfGoalsAssists = input.nextInt();

        Player player2 = new Player(name, numOfMatches, numOfInternationalCaps, height, numOfGoalsAssists);

        Player player3 = new Player();
        player3.setAll("Robert", 3, 2, 6, 8);

        System.out.println("");
        System.out.println("player1's Data");
        player1.getPlayerData();
        player1.getGoalsAssistsPerMatch();

        System.out.println("");
        System.out.println("player2's Data");
        player2.getPlayerData();
        player2.getGoalsAssistsPerMatch();

        System.out.println("");
        System.out.println("player3's Data");
        player3.getPlayerData();
        player3.getGoalsAssistsPerMatch();
    }
}

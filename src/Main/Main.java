package Main;
import Manager.Manager;

import java.util.Scanner;


public class Main
{
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        String input ;
        do {
            System.out.println("Welcome to our Game!\n\n");
            System.out.println("1: Start Game\n");
            System.out.println("2: Continue Game\n");
            System.out.println("3: Achievements\n ");
            System.out.println("4: Exit\n");
            input = scanner.nextLine();

            switch (input)
            {
                case "1":
                    manager.startNewGame();
                    break;
                case "2":
                    continueOldGame();
                    break;
                case "3":
                    openAchievementsFile();
                    break;
                case "4" :
                    break;
                default:
                    System.out.println("Command not recognized, please try again");
            }
        }
        while(!input.equals("4"));


    }
}


package Main;
import Manager.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;


public class Main
{
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        //HashMap<String,Function> map = new HashMap<String,Function>();
        //map.put("Start_Game",manager.startNewGame());


        String input ;
        do {
            manager.WriteMainMenu();
            input = scanner.nextLine();

            switch (input)
            {
                case "1":
                    manager.startNewGame();

                    break;

                case "2":
                    manager.continueOldGame();

                    break;

                case "3":
                    manager.openAchievementsFile();
                    break;

                case "4" :
                    manager.saveFile();
                    break;

                default:
                    System.out.println("Command not recognized, please try again");
            }
        }
        while(!input.equals("4"));



    }
}


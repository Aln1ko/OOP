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

        System.out.println("Do you want to play in window or in console(1-window,2-console)");
        String input ;
        input = scanner.nextLine();
        int vivod = 0;

        if(input.equals("1"))
        {
            vivod = 1;
        }
        else
        //{}все что снизу по идеи в єти скобки или как-то инпут приравнивать к графике
            vivod = 2;

        do {
            manager.WriteMainMenu();
            input = scanner.nextLine();


            switch (input)
            {
                case "1":
                    manager.startNewGame(vivod);
                    manager.game_process();
                    break;

                case "2":
                    manager.continueOldGame();
                    manager.game_process();
                    break;


                case "3" :
                    manager.saveFile();
                    break;

                default:
                    System.out.println("Command not recognized, please try again");
            }
        }
        while(!input.equals("3"));





    }
}


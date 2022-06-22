package Main;
import GUI.*;
import Game.MyCharacter;
import Manager.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Function;

import static GUI.GUI.gui;


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
            MyCharacter hero = new MyCharacter();
            gui(manager,hero);

        }
        else{
            vivod = 2;
            do {
                manager.WriteMainMenu();
                input = scanner.nextLine();


                switch (input)
                {
                    case "1":
                        manager.startNewGame(2);
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

    public static void consoleStart(String input){

        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();


    }
     public static void guiStart(){

    }

}


package Manager;

import MyFilesWorker.MyFilesWorker;

import Game.*;
import Menu.*;

import java.util.Scanner;


public class Manager
{
    MyCharacter hero = new MyCharacter();
    Difficult_Game diff_game = new Difficult_Game();
    Rest rest = new Rest();
    Work work = new Work();
    Study study = new Study();
    Scanner scanner = new Scanner(System.in);
    MyFilesWorker myFilesWorker = new MyFilesWorker();

    public void WriteMainMenu()
    {
        MainMenu.create_menu();
    }
    public void WriteGameMenu(){GameMenu.create_menu();}
    public void WriteWorkMenu(){WorkMenu.create_menu();}
    public void WriteStudyMenu(){StudyMenu.create_menu();}
    public void WriteRestMenu(){RestMenu.create_menu();}

    public void startNewGame()
    {
        String name;
        String sex;
        String difficult;
        System.out.println("Choose your name: ");
        name = scanner.nextLine();
        System.out.println("Choose your sex: ");
        sex  = scanner.nextLine();
        System.out.println("Choose difficult of the game 1, 2 or 3 : ");
        difficult = scanner.nextLine();
        create_hero(name,sex,difficult);

    }

    public void create_hero(String name , String sex, String difficult )
    {
        hero.set_Name(name);
        hero.set_sex(sex);
        int number = Integer.parseInt(difficult);
        diff_game.fill_difficult(hero,number);
    }

    public void game_process()
    {
       Scanner scanner = new Scanner(System.in);
       String input;
       int number_of_step =0;

       do {
           WriteGameMenu();
           input = scanner.nextLine();

           switch (input)
           {
               case "1":
                   WriteRestMenu();

                   break;
               case "2":
                   WriteStudyMenu();

                   break;
               case "3":
                   WriteWorkMenu();

                   break;
               case"0":

                   break;

               default:
                   System.out.println("Command not recognized, please try again");

                number_of_step++;
           }

       }while(!input.equals("0"));


    }


    public void continueOldGame()
    {
        ;
    }

    public void openAchievementsFile()
    {
        ;
    }

    public void saveFile()
    {
        ;
    }

    public void rest_polyana(){rest.go_to_polyana(hero);}

    public void rest_cart(){rest.make_cart_be_on_tree(hero);}

    public void rest_alchogol(){rest.drink_alchogol(hero);}

    public void rest_gachimuchi(){rest.make_gachimuchi(hero);}

    public void study_lab(){study.make_lab(hero);}

    public void study_homework(){study.make_homework(hero);}

    public void study_university(){study.go_to_university(hero);}

    public void study_kursovaya(){study.napisat_kursovu(hero);}

    public void work_dance(){work.go_to_dance(hero);}

    public void work_coder(){work.coder_work(hero);}

    public void work_listovki(){work.rozdavat_listovki(hero);}

    public void work_senior(){work.senior_work(hero);}


    





}

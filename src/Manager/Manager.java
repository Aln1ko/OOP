package Manager;

//import MyFilesWorker.MyFilesWorker;

import Game.*;
import Menu.*;
import MyFLWorker.*;

import java.util.Scanner;


public class Manager
{
    MyCharacter hero = new MyCharacter();
    Difficult_Game diff_game = new Difficult_Game();
    Rest rest = new Rest();
    Work work = new Work();
    Study study = new Study();
    Shop shop = new Shop();
    Scanner scanner = new Scanner(System.in);
    MyFLWorker myFilesWorker = new MyFLWorker();

    public void WriteMainMenu()
    {
        MainMenu.create_menu();
    }
    public void WriteGameMenu(){GameMenu.create_menu();}
    public void WriteWorkMenu(){WorkMenu.create_menu();}
    public void WriteStudyMenu(){StudyMenu.create_menu();}
    public void WriteRestMenu(){RestMenu.create_menu();}
    public void WriteShopMenu(){ShopMenu.create_menu();}

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

    public void proverka(MyCharacter hero)
    {
        if (hero.get_marks() < 0 || hero.get_money() < 0 || hero.get_moral_points() < 0);
        {
            System.out.println("Game over");
        }
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
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   WriteRestMenu();
                   input = scanner.nextLine();
                   Rest_choose(input);
                   WindowCharacter.Window(hero);
                   System.out.println("");

                   break;
               case "2":
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   WriteStudyMenu();
                   input = scanner.nextLine();
                   Study_choose(input);
                   WindowCharacter.Window(hero);
                   System.out.println("");

                   break;
               case "3":
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   WriteWorkMenu();
                   input =scanner.nextLine();
                   Work_choose(input);
                   WindowCharacter.Window(hero);
                   System.out.println("");

                   break;

               case"4":
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   WriteShopMenu();
                   input = scanner.nextLine();
                   Shop_choose(input);
                   WindowCharacter.Window(hero);
                   System.out.println("");

                   break;
               case"0":

                   break;

               default:
                   System.out.println("Command not recognized, please try again");

                number_of_step++;
           }

       }while(!input.equals("0"));


    }

    public void Rest_choose(String input)
    {
        if(input.equals("1"))
            rest_polyana();
        if(input.equals("2"))
            rest_cart();
        if(input.equals("3"))
            rest_alchogol();
        if(input.equals("4"))
            rest_gachimuchi();
    }

    public void Study_choose(String input)
    {
        if(input.equals("1"))
            study_lab();
        if(input.equals("2"))
            study_homework();
        if(input.equals("3"))
            study_university();
        if(input.equals("4"))
            study_kursovaya();
    }

    public void Work_choose(String input)
    {
        if(input.equals("1"))
            work_dance();
        if(input.equals("2"))
            work_coder();
        if(input.equals("3"))
            work_listovki();
        if(input.equals("4"))
            work_senior();
    }

    public void Shop_choose(String input)
    {
        if(input.equals("1"))
            shop_coursework();
        if(input.equals("2"))
            shop_diploma();
        if(input.equals("3"))
            shop_girl();
        if(input.equals("4"))
            shop_drink();
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

    public  void shop_coursework(){shop.buy_coursework(hero);}

    public  void shop_diploma(){shop.buy_diploma(hero);}

    public  void shop_girl(){shop.buy_girl(hero);}

    public  void shop_drink(){shop.buy_drink(hero);}


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

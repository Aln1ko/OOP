package Manager;

//import MyFilesWorker.MyFilesWorker;

import GUI.GUI;
import Game.*;
import Menu.*;
import MyFLWorker.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
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
    EndGame endGame = new EndGame();
    Ivents ivents = new Ivents();

    int vivod =2;
    public void WriteMainMenu()
    {
        MainMenu.create_menu(vivod);
    }
    public void WriteGameMenu(){GameMenu.create_menu(vivod);}
    public void WriteWorkMenu(){WorkMenu.create_menu(vivod);}
    public void WriteStudyMenu(){StudyMenu.create_menu(vivod);}
    public void WriteRestMenu(){RestMenu.create_menu(vivod);}
    public void WriteShopMenu(){ShopMenu.create_menu(vivod);}

    public void ivent_on_step(MyCharacter hero)
    {
        ivents.Boxonov(hero,hero.get_number_of_step());
        ivents.Kipusha(hero, hero.get_number_of_step());
        ivents.Petrenko(hero,hero.get_number_of_step());
        ivents.IventOnStep(hero,hero.get_number_of_step());

    }

    public void startNewGame(int vivod)
    {
        String name;
        String sex;
        String difficult;
        ArrayList <String> temp = new ArrayList<String>();
        temp.add("Choose your name: ");
        temp.add("Choose your sex: ");
        temp.add("Choose difficult of the game 1, 2 or 3 (1-All stats-50,2-All stats-30,3-All stats-10)");
        if (vivod == 1) {

        }
        if (vivod == 2) {
            System.out.println(temp.get(0));
            name = scanner.nextLine();
            System.out.println(temp.get(1));
            sex = scanner.nextLine();
            System.out.println(temp.get(2));
            difficult = scanner.nextLine();
            create_hero(name, sex, difficult);
        }
    }

    public void proverka(MyCharacter hero)
    {
        if (hero.get_marks() < 0 || hero.get_money() < 0
                || hero.get_moral_points() < 0)
        {
           endGame.EndGameBeforeLoss(hero);
        }
    }

    public boolean proverkaGUI(MyCharacter hero){
        if (hero.get_marks() < 0 || hero.get_money() < 0
                || hero.get_moral_points() < 0)
        {
            return true;
        }
        else
            return false;
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


       do {
           ivent_on_step(hero);
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

                   proverka(hero);

                   WindowCharacter.Window(hero);
                   System.out.println("");
                   hero.set_number_of_step(hero.get_number_of_step()+1);


                   break;

               case "2":
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   WriteStudyMenu();
                   input = scanner.nextLine();
                   Study_choose(input);
                   proverka(hero);
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   hero.set_number_of_step(hero.get_number_of_step()+1);

                   break;

               case "3":
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   WriteWorkMenu();
                   input =scanner.nextLine();
                   Work_choose(input);
                   proverka(hero);
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   hero.set_number_of_step(hero.get_number_of_step()+1);


                   break;

               case"4":
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   WriteShopMenu();
                   input = scanner.nextLine();
                   Shop_choose(input);
                   proverka(hero);
                   WindowCharacter.Window(hero);
                   System.out.println("");
                   hero.set_number_of_step(hero.get_number_of_step()+1);


                   break;

               case"0":

                   break;

               default:
                   System.out.println("Command not recognized, please try again");

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

        myFilesWorker.inputInformationOnFile(hero);

    }


    public void saveFile()
    {
        myFilesWorker.inputInformationOnFile(hero);
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

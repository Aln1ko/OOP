package Game;

import java.util.Scanner;


public class EndGame {

    public void EndGameBeforeLoss(MyCharacter hero){

        System.out.println("      Your skill in study is very low, try next time");
        System.out.println("Name: " + hero.get_Name());
        System.out.println("Sex: " + hero.get_sex());
        System.out.println("Money: " + hero.get_money());
        System.out.println("Marks: " + hero.get_marks());
        System.out.println("Moral points: " + hero.get_moral_points());
        System.out.println("Number of step: " + hero.get_number_of_step());
        if(hero.get_money()<0)
            System.out.println("Lost because you are BOMJ");
        if(hero.get_marks()<0)
            System.out.println("Lost because you are STUPID");
        if(hero.get_moral_points()<0)
            System.out.println("Lost because you are DEAD INSADE");

        System.exit(0) ;
    }

    public void EndGameBeforeWin(MyCharacter hero){
        System.out.println("      Your skill is very high, you are a God for study ");
        System.out.println(hero.get_Name());
        System.out.println(hero.get_sex());
        System.out.println(hero.get_money());
        System.out.println(hero.get_marks());
        System.out.println(hero.get_moral_points());
        System.out.println(hero.get_number_of_step());
        System.out.println("");
        System.out.println("");
        System.out.println("You have two ways of Power. First way: run away. Second way: fight to the end");

        String input;
        Scanner scanner= new Scanner(System.in);
        input = scanner.nextLine();

        switch (input)
        {
            case "1":
                System.out.println("See you next time, goodbye");
                System.exit(0) ;
                break;

            case "2":

                System.out.println("Okay, lets continue");
                break;


            default:
                System.out.println("Command not recognized, please try again");
        }
    }
}
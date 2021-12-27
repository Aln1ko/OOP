package Game;

import java.sql.SQLOutput;

public class WindowCharacter {

    public static void WindowDifficult (MyCharacter hero, int diff )
    {
        if(diff==1)
        {
            System.out.println("Marks: " + hero.get_marks());
            System.out.println("MoralPoint:" + hero.get_moral_points());
            System.out.println("Money: " + hero.get_money());
        }
        if(diff==2)
        {
            System.out.println("Marks: " + hero.get_marks());
            System.out.println("MoralPoint:" + hero.get_moral_points());
            System.out.println("Money: " + hero.get_money());
        }
        if(diff==3)
        {
            System.out.println("Marks: " + hero.get_marks());
            System.out.println("MoralPoint:" + hero.get_moral_points());
            System.out.println("Money: " + hero.get_money());
        }
    }

    //кожного разу коли відбувається зміна даних - заносити і обновлювати їх

    public static void Window (MyCharacter hero)
    {

        System.out.println ("\nName: " + hero.get_Name()+" "+
                "Sex: "+ hero.get_sex()+ " "+
                "Marks: " + hero.get_marks()+ " " +
                "MoralPoints:" + hero.get_moral_points()+ " "+
                "Money: " + hero.get_money());


    }
}
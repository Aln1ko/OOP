package Game;

import java.sql.SQLOutput;

public class WindowCharacter {

    public static void WindowDifficult (MyCharacter hero, int diff )
    {
        if(diff==1)
        {
            System.out.println("Кількість балів: " + hero.get_marks());
            System.out.println("Моральна витримка:" + hero.get_moral_points());
            System.out.println("Кєшь на кармані: " + hero.get_money());
        }
        if(diff==2)
        {
            System.out.println("Кількість балів: " + hero.get_marks());
            System.out.println("Моральна витримка:" + hero.get_moral_points());
            System.out.println("Кєшь на кармані: " + hero.get_money());
        }
        if(diff==3)
        {
            System.out.println("Кількість балів: " + hero.get_marks());
            System.out.println("Моральна витримка:" + hero.get_moral_points());
            System.out.println("Кєшь на кармані: " + hero.get_money());
        }
    }

    //кожного разу коли відбувається зміна даних - заносити і обновлювати їх

    public static void Window (MyCharacter hero)
    {

        System.out.println ("Name" + hero.get_Name());
        System.out.println ("sex"+ hero.get_sex());
        System.out.println("Кількість балів: " + hero.get_marks());
        System.out.println("Моральна витримка:" + hero.get_moral_points());
        System.out.println("Кєшь на кармані: " + hero.get_money());


    }
}
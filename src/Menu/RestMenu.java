package Menu;

import java.util.ArrayList;

public class RestMenu implements Menu{
    public static void create_menu(int i)
    {
        ArrayList<String> menu_points = new ArrayList<String>();
        menu_points.add("1: Go on polyana (Money:-3 Makrs:-5 MoralPoint:+7)");
        menu_points.add("2: Something with cart (Money:-2 Makrs:0 MoralPoint:+9)");
        menu_points.add("3: Drink alchogol (Money:-7 Makrs:-1 MoralPoint:+17)");
        menu_points.add("4: Make gachimuchi (Money:-10 Makrs:+7 MoralPoint:+69)");

        if(i==1)
        {
            //vivod graficoi(peredelat vse funkzii)
        }
        else
            for(int m = 0; m< menu_points.size();m++)
            {
                System.out.println(menu_points.get(m));
            }
       /* System.out.println("1: Go on polyana (Money:-3 Makrs:-5 MoralPoint:+7)");
        System.out.println("2: Something with cart (Money:-2 Makrs:0 MoralPoint:+9)");
        System.out.println("3: Drink alchogol (Money:-7 Makrs:-1 MoralPoint:+17)");
        System.out.println("4: Make gachimuchi (Money:-10 Makrs:+7 MoralPoint:+69)");*/
    }
}
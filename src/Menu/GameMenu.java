package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu implements  Menu
{
    public static void create_menu(int i)
    {
        ArrayList<String> menu_points = new ArrayList<String>();
        menu_points.add("1: Rest options ");
        menu_points.add("2: Study options  ");
        menu_points.add("3: Work options  ");
        menu_points.add("4: Shop options ");
        menu_points.add("0: Exit game ");

        if(i==1)
        {
            //vivod graficoi(peredelat vse funkzii)
        }
        else
            for(int m = 0; m< menu_points.size();m++)
            {
                System.out.println(menu_points.get(m));
            }

             /*       System.out.println("1: Rest options ");
            System.out.println("2: Study options  ");
            System.out.println("3: Work options  ");
            System.out.println("4: Shop options ");
            System.out.println("0: Exit game ");*/
    }
}

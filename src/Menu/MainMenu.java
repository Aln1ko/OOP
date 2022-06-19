package Menu;

import java.util.ArrayList;

public class MainMenu implements  Menu
{
    public static void create_menu(int i)
    {
        ArrayList<String> menu_points = new ArrayList<String>();
        menu_points.add("Welcome to our Game!");
        menu_points.add("1: Start Game");
        menu_points.add("2: Continue Game");
        menu_points.add("3: Exit");
        if(i==1)
        {
            //vivod graficoi(peredelat vse funkzii)
        }
        else
            for(int m = 0; m< menu_points.size();m++)
            {
                if(m==0)
                System.out.println("\n"+menu_points.get(m)+"\n");
                else
                    System.out.println(menu_points.get(m));
            }
        //System.out.println("\nWelcome to our Game!\n");
        //System.out.println("1: Start Game");
        //System.out.println("2: Continue Game");
        //System.out.println("3: Exit");
    }
}

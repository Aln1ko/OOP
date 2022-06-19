package Menu;

import java.util.ArrayList;

public class StudyMenu implements Menu
{
    public static void create_menu(int i)
    {
        ArrayList<String> menu_points = new ArrayList<String>();
        menu_points.add("1: Make lab (Money:0 Makrs:+15 MoralPoint:-15)");
        menu_points.add("2: Make homework (Money:0 Makrs:+5 MoralPoint:-4)");
        menu_points.add("3: Go to university (Money:-2 Makrs:+2 MoralPoint:-4)");
        menu_points.add("4: Make kurs work (Money:0 Makrs:+40 MoralPoint:-80)");
        if(i==1)
        {
            //vivod graficoi(peredelat vse funkzii)
        }
        else
            for(int m = 0; m< menu_points.size();m++)
            {
                    System.out.println(menu_points.get(m));
            }
        /*System.out.println("1: Make lab (Money:0 Makrs:+15 MoralPoint:-15)");
        System.out.println("2: Make homework (Money:0 Makrs:+5 MoralPoint:-4)");
        System.out.println("3: Go to university (Money:-2 Makrs:+2 MoralPoint:-4)");
        System.out.println("4: Make kurs work (Money:0 Makrs:+40 MoralPoint:-80)");*/
    }
}
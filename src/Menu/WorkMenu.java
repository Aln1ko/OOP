package Menu;

import java.util.ArrayList;

public class WorkMenu implements Menu{
    public static void create_menu(int i)
    {
        ArrayList<String> menu_points = new ArrayList<String>();
        menu_points.add("1: Go to dance (Money:+50 Makrs:0 MoralPoint:-30)");
        menu_points.add("2: Do junior work (Money:+70 Makrs:+10 MoralPoint:-50)");
        menu_points.add("3: Rozdavat listovki (Money:+30 Makrs:0 MoralPoint:-15)");
        menu_points.add("4: Do senior work (Money:+100 Makrs:+15 MoralPoint:-40)");
        if(i==1)
        {
            //vivod graficoi(peredelat vse funkzii)
        }
        else
            for(int m = 0; m< menu_points.size();m++)
            {
                    System.out.println(menu_points.get(m));
            }
       /* System.out.println("1: Go to dance (Money:+50 Makrs:0 MoralPoint:-30)");
        System.out.println("2: Do junior work (Money:+70 Makrs:+10 MoralPoint:-50)");
        System.out.println("3: Rozdavat listovki (Money:+30 Makrs:0 MoralPoint:-15)");
        System.out.println("4: Do senior work (Money:+100 Makrs:+15 MoralPoint:-40)");*/
    }
}
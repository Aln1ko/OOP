package Menu;

import java.util.ArrayList;

public class ShopMenu  implements  Menu{
    public  static void create_menu(int i)
    {
        ArrayList<String> menu_points = new ArrayList<String>();
        menu_points.add("1: Buy coursework (Money:-300 Makrs:+500 MoralPoint:+100)");
        menu_points.add("2: Buy diploma (Money:-3000 Makrs:-5000 MoralPoint:+1000)");
        menu_points.add("3: Buy girl (Money:-150 Makrs:-25 MoralPoint:+500)");
        menu_points.add("4: Buy drink (Money:-50 Makrs:-100 MoralPoint:+300)");
        if(i==1)
        {
            //vivod graficoi(peredelat vse funkzii)
        }
        else
            for(int m = 0; m< menu_points.size();m++)
            {
                    System.out.println(menu_points.get(m));
            }
        /*System.out.println("1: Buy coursework (Money:-300 Makrs:+500 MoralPoint:+100)");
        System.out.println("2: Buy diploma (Money:-3000 Makrs:-5000 MoralPoint:+1000)");
        System.out.println("3: Buy girl (Money:-150 Makrs:-25 MoralPoint:+500)");
        System.out.println("4: Buy drink (Money:-50 Makrs:-100 MoralPoint:+300)");*/
    }
}

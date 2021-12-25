package Game;

public class Difficult_Game
{
    public void fill_difficult(Character hero, int diff)
    {
        if (diff == 1)
        {
            final int mark_limit = 300;
            hero.set_marks(50);
            hero.set_money(50);
            hero.set_moral_points(50);
        }
        if(diff == 2 )
        {
            final int mark_limit = 500;
            hero.set_marks(30);
            hero.set_money(30);
            hero.set_moral_points(30);
        }
        if(diff == 3)
        {
            final int mark_limit = 1000;
            hero.set_marks(10);
            hero.set_money(10);
            hero.set_moral_points(10);
        }
    }
}

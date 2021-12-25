package Manager;
//import Game.

import Game.Character;
import Game.Difficult_Game;
import Game.Rest;
import Game.Work;
import Game.Study;

public class Manager
{
    Character hero = new Character();
    Difficult_Game diff_game = new Difficult_Game();
    Rest rest = new Rest();
    Work work = new Work();
    Study study = new Study();

    public void create_hero(String name , String sex, int difficult )
    {
        hero.set_Name(name);
        hero.set_sex(sex);
        diff_game.fill_difficult(hero,difficult);
    }
    





}

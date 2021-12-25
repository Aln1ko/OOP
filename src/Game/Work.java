package Game;

public class Work
{
    ChangeAtributs changeAtributs = new ChangeAtributs();

    public void go_to_dance(Character hero)//
    {
        changeAtributs.change_money(hero, 50);
        changeAtributs.change_marks(hero, 0);
        changeAtributs.change_moral_points(hero, -30);
    }

    public void coder_work(Character hero) {
        changeAtributs.change_money(hero, 70);
        changeAtributs.change_marks(hero, 10);
        changeAtributs.change_moral_points(hero, -50);
    }

    public void rozdavat_listovki(Character hero)
    {
        changeAtributs.change_money(hero, 30);
        changeAtributs.change_marks(hero, 0);
        changeAtributs.change_moral_points(hero, -15);
    }

    public int  senior_work(Character hero)
    {
        if(hero.get_marks() < 150)
        {
            System.out.println("Недомтаточно очков , иди танцевать, тут все жлобы не для кого танцевать");
            return 0;
        }
        changeAtributs.change_money(hero, 100);
        changeAtributs.change_marks(hero, 15);
        changeAtributs.change_moral_points(hero, -40);
        return 1;
    }

}

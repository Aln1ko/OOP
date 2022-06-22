package Game;

public class Work
{
    ChangeAtributs changeAtributs = new ChangeAtributs();

    public void go_to_dance(MyCharacter hero)//
    {
        changeAtributs.change_money(hero, 50);
        changeAtributs.change_marks(hero, 0);
        changeAtributs.change_moral_points(hero, -30);
        changeAtributs.change_number_of_steps(hero,+1);
    }

    public void coder_work(MyCharacter hero) {
        changeAtributs.change_money(hero, 70);
        changeAtributs.change_marks(hero, 10);
        changeAtributs.change_moral_points(hero, -50);
        changeAtributs.change_number_of_steps(hero,+1);
    }

    public void rozdavat_listovki(MyCharacter hero)
    {
        changeAtributs.change_money(hero, 30);
        changeAtributs.change_marks(hero, 0);
        changeAtributs.change_moral_points(hero, -15);
        changeAtributs.change_number_of_steps(hero,+1);
    }

    public int  senior_work(MyCharacter hero)
    {
        if(hero.get_marks() < 150)
        {
            System.out.println("You marks is bad,go study before doing this work\n");
            return 0;
        }
        changeAtributs.change_money(hero, 100);
        changeAtributs.change_marks(hero, 15);
        changeAtributs.change_moral_points(hero, -40);
        changeAtributs.change_number_of_steps(hero,+1);
        return 1;
    }

}

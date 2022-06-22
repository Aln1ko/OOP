package Game;

public class Rest
{
    ChangeAtributs changeAtributs = new ChangeAtributs();

    public void go_to_polyana(MyCharacter hero)//пойти на поляну
    {
        changeAtributs.change_money(hero,-3);
        changeAtributs.change_marks(hero,-5);
        changeAtributs.change_moral_points(hero,7);
        changeAtributs.change_number_of_steps(hero,+1);
    }

    public void make_cart_be_on_tree(MyCharacter hero)//закинуть тележку на дерево
    {
        changeAtributs.change_money(hero,-2);
        changeAtributs.change_marks(hero,0);
        changeAtributs.change_moral_points(hero,9);
        changeAtributs.change_number_of_steps(hero,+1);
    }

    public void drink_alchogol(MyCharacter hero)//выпить у какого-то чела желтую бодягу
    {
        changeAtributs.change_money(hero,-7);
        changeAtributs.change_marks(hero,-1);
        changeAtributs.change_moral_points(hero,17);
        changeAtributs.change_number_of_steps(hero,+1);
    }

    public void make_gachimuchi(MyCharacter hero)//без обьяснений
    {
        changeAtributs.change_money(hero,-10);
        changeAtributs.change_marks(hero,7);
        changeAtributs.change_moral_points(hero,69);
        changeAtributs.change_number_of_steps(hero,+1);

    }



}

package Game;

        import Manager.Manager;

public class ArbitraryIvent extends  Ivents
{
    ChangeAtributs changeAtributs = new ChangeAtributs();

    public void Halloween (MyCharacter hero)
    {
        changeAtributs.change_money(hero,-50 );
        changeAtributs.change_marks(hero,-25 );
        changeAtributs.change_moral_points(hero,+50 );
    }
    public void Dicko (MyCharacter hero)
    {
        changeAtributs.change_money(hero,-30 );
        changeAtributs.change_marks(hero,-15 );
        changeAtributs.change_moral_points(hero,+30 );
    }
    public void DopkaMatan (MyCharacter hero)
    {
        changeAtributs.change_money(hero,0 );
        changeAtributs.change_marks(hero,-10 );
        changeAtributs.change_moral_points(hero,-20 );
    }





}
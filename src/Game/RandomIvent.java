package Game;

public class RandomIvent extends Ivents {
    // рандомні івенти

    ChangeAtributs changeAtributs = new ChangeAtributs();

    // оцінки від 0 до 20
    // гроші від -100 до 0
    // моральний стан від -20 до 0
    int a=0;
    int b=20;
    int c=100;

    public void make_KP (MyCharacter hero)
    {
        changeAtributs.change_marks(hero, a + (int) (Math.random() * b));
        changeAtributs.change_moral_points(hero, -(a + (int) (Math.random() * b)));
    }
    public void buy_KP (MyCharacter hero)
    {
        changeAtributs.change_money(hero, -(a + (int) (Math.random() * c)));
        changeAtributs.change_marks(hero, a + (int) (Math.random() * b));
        changeAtributs.change_moral_points(hero, -(a + (int) (Math.random() * b)));
    }
    //Kipusha

    public void  do_your_own_lab( MyCharacter hero)
    {
        changeAtributs.change_marks(hero,a+(int)(Math.random()*b));
        changeAtributs.change_moral_points(hero,-(a+(int)(Math.random()*b)));
    }

    public void write_off_the_lab ( MyCharacter hero)
    {
        changeAtributs.change_marks(hero,a+(int)(Math.random()*b));
        changeAtributs.change_moral_points(hero,-(a+(int)(Math.random()*b)));
    }

    // Petrenko
    public void  write_KP  ( MyCharacter hero)
    {
        changeAtributs.change_marks(hero,a+(int)(Math.random()*b));
        changeAtributs.change_moral_points(hero,-(a+(int)(Math.random()*b)));
    }






}
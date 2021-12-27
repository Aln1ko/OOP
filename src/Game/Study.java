package Game;

public class Study {
    ChangeAtributs changeAtributs = new ChangeAtributs();

    public void make_lab(MyCharacter hero) {
        changeAtributs.change_money(hero, 0);
        changeAtributs.change_marks(hero, 15);
        changeAtributs.change_moral_points(hero, -15);
    }

    public void make_homework(MyCharacter hero) {
        changeAtributs.change_money(hero, 0);
        changeAtributs.change_marks(hero, 5);
        changeAtributs.change_moral_points(hero, -4);
    }

    public void go_to_university(MyCharacter hero) {
        changeAtributs.change_money(hero, -2);
        changeAtributs.change_marks(hero, 2);
        changeAtributs.change_moral_points(hero, -4);
    }

    public int napisat_kursovu(MyCharacter hero) {
        if (hero.get_marks() < 120) {
            System.out.println("Go study!");
            return 0;
        }
        changeAtributs.change_money(hero, 0);
        changeAtributs.change_marks(hero, 40);
        changeAtributs.change_moral_points(hero, -80);
        return 1;

    }
}



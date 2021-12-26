package Game;

import java.sql.SQLOutput;

public class Shop {

        ChangeAtributs changeAtributs = new ChangeAtributs();

        public void buy_coursework (Сharacter hero)// купити курсову
        {
            changeAtributs.change_money(hero,-300);
            changeAtributs.change_marks(hero,+500);
            changeAtributs.change_moral_points(hero,+100);
        }

        public void buy_diploma (Сharacter hero)// купити диплом
        {
            changeAtributs.change_money(hero,-3000);
            changeAtributs.change_marks(hero,+5000);
            changeAtributs.change_moral_points(hero,+1000);
        }

        public void buy_girl  (Сharacter hero)// купити дівчину на годину
        {
            changeAtributs.change_money(hero,-150);
            changeAtributs.change_marks(hero,-25);
            changeAtributs.change_moral_points(hero,+500);
        }

        public void buy_drink (Сharacter hero) // купити алкоголь
        {
            changeAtributs.change_money(hero,-50);
            changeAtributs.change_marks(hero,-100);
            changeAtributs.change_moral_points(hero,+300);
        }
       System.out.println ();



}

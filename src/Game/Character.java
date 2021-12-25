package Game;

public class Character
{
    private String Name;
    private int money;
    private int marks;
    private int moral_points;
    private String sex;

    public Character(String name,String sex)
    {
        this.sex = sex;
        this.Name = name;
    }

    public Character()
    {}

    public void set_Name(String name){this.Name = name;}

    public void set_sex(String sex){this.sex =sex;}

    public void set_money(int money)
    {
        this.money = money;
    }

    public void set_marks(int marks)
    {
        this.marks = marks;
    }

    public void set_moral_points(int moral_points)
    {
        this.moral_points = moral_points;
    }

    public int get_money(){
        return money;
    }

    public int get_marks(){
        return marks;
    }

    public int get_moral_points(){
        return moral_points;
    }
}

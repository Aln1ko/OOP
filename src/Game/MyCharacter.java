package Game;

public class MyCharacter
{
    private String Name;
    private int money;
    private int marks;
    private int moral_points;
    private String sex;
    private int number_of_step = 0;

    public MyCharacter(String name, String sex)
    {
        this.sex = sex;
        this.Name = name;
    }

    public MyCharacter()
    {}

    public int get_number_of_step(){return number_of_step;}

    public void set_number_of_step(int number_of_step){this.number_of_step = number_of_step;}

    public String get_Name(){return Name;}

    public String get_sex(){return sex;}

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

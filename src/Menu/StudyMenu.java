package Menu;

public class StudyMenu implements Menu
{
    public static void create_menu()
    {
        System.out.println("1: Make lab (Money:0 Makrs:+15 MoralPoint:-15)");
        System.out.println("2: Make homework (Money:0 Makrs:+5 MoralPoint:-4)");
        System.out.println("3: Go to university (Money:-2 Makrs:+2 MoralPoint:-4)");
        System.out.println("4: Make kurs work (Money:0 Makrs:+40 MoralPoint:-80)");
    }
}
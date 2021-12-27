package MyFLWorker;

import Game.MyCharacter;

import java.io.*;

public class MyFLWorker
{
    public void inputInformationOnFile(MyCharacter hero) {

        String textName = (hero.get_Name()); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("D:\\java_files\\laba-1\\Name.txt"))
        {
            // перевод строки в байты
            byte[] buffer = textName.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        int money = hero.get_money();
        String textMoney = Integer.toString(money); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("D:\\java_files\\laba-1\\Money.txt"))
        {
            // перевод строки в байты
            byte[] buffer = textMoney.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        int marks = hero.get_marks();

        String textMarks = Integer.toString(marks); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("D:\\java_files\\laba-1\\Marks.txt"))
        {
            // перевод строки в байты
            byte[] buffer = textMarks.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        int moral_points = hero.get_moral_points();
        String textMoralPoints = Integer.toString(moral_points); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("D:\\java_files\\laba-1\\MoralPoints.txt"))
        {
            // перевод строки в байты
            byte[] buffer = textMoralPoints.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        String textSex = hero.get_sex(); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("D:\\java_files\\laba-1\\Sex.txt"))
        {
            // перевод строки в байты
            byte[] buffer = textSex.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    public static void outputInformationOnFile(MyCharacter hero) {

        try(FileInputStream fin = new FileInputStream("D:\\java_files\\laba-1\\Name.txt"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr =  String.valueOf(templ);
            hero.set_Name(myStr);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin = new FileInputStream("D:\\java_files\\laba-1\\Money.txt"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr =  String.valueOf(templ);
            int money = Integer.parseInt(myStr);
            hero.set_money(money);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("D:\\java_files\\laba-1\\Marks.txt"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr =  String.valueOf(templ);
            int marks = Integer.parseInt(myStr);
            hero.set_marks(marks);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("D:\\java_files\\laba-1\\MoralPoints.txt"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){
                templ[count]=(char)i;
                count++;
            }

            String myStr =  String.valueOf(templ);
            int moral_points = Integer.parseInt(myStr);
            hero.set_moral_points(moral_points);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("D:\\java_files\\laba-1\\Sex.txt"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr =  String.valueOf(templ);
            hero.set_sex(myStr);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


}

import Game.MyCharacter;

import java.io.*;

public class MyFilesWorker
{
    public void inputInformationOnFile(MyCharacter hero) {

        String textName = (MyCharacter.get_Name(hero)); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("путь к файлу который мы хотим 1"))
        {
            // перевод строки в байты
            byte[] buffer = textName.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        String textMoney = (MyCharacter.get_money(hero)); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("путь к файлу который мы хотим 2"))
        {
            // перевод строки в байты
            byte[] buffer = textMoney.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        String textMarks = (MyCharacter.get_marks(hero)); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("путь к файлу который мы хотим 3"))
        {
            // перевод строки в байты
            byte[] buffer = textMarks.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        String textMoralPoints = (MyCharacter.get_moral_points(hero)); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("путь к файлу который мы хотим 4"))
        {
            // перевод строки в байты
            byte[] buffer = textMoralPoints.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        String textSex = (MyCharacter.get_sex(hero)); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("путь к файлу который мы хотим 5"))
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

        try(FileInputStream fin=new FileInputStream("путь к файлу который мы хотим1"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr = new String.valueOf(templ);
            hero.set_Name=myStr;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("путь к файлу который мы хотим2"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr = new String.valueOf(templ);
            hero.set_money=myStr;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("путь к файлу который мы хотим3"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr = new String.valueOf(templ);
            hero.set_marks=myStr;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("путь к файлу который мы хотим4"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){
                templ[count]=(char)i;
                count++;
            }
            String myStr = new String.valueOf(templ);
            hero.set_moral_points=myStr;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("путь к файлу который мы хотим5"))
        {

            int i=-1;
            Character[] templ = new Character[20];
            int count = 0;
            while((i=fin.read())!=-1){

                templ[count]=(char)i;
                count++;
            }
            String myStr = new String.valueOf(templ);
            hero.set_sex=myStr;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


}

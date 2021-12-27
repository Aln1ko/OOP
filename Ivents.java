package Game;

import Manager.Manager;

import java.sql.SQLOutput;

public class Ivents
{
   //rand invent
   public void Boxonov (MyCharacter hero)
   {
      if (hero.get_marks() >= 50)
      {
         System.out.println("RandIvent: Make KP Boxonov");
         RandomIvent  make_KP ;
      }
      else
      {
         System.out.println("RandIvent: Buy KP Boxonov");
         RandomIvent  buy_KP;
      }
   }

   public void Kipusha (MyCharacter hero)
   {
      if (hero.get_marks() >= 40)
      {
         System.out.println("RandIvent: Do your own lab Kipusha ");
         RandomIvent do_your_own_lab;
      }
      else
      {
         System.out.println("RandIvent: write off the lab Kipusha ");
         RandomIvent  write_off_the_lab;
      }
   }

   public void Petrenko ( MyCharacter hero)
   {
      System.out.println("RandIvent: wrote KP Petrenko");
      RandomIvent  write_KP;
   }


   //arbitrary ivent

   public void IventOnStep (Character hero, int number_of_step)
   {
      int a = 7;
      int b = 19;
      int c = 26;

      if( number_of_step==a)
      {
         System.out.println("Ivent: Halloween ");
         ArbitraryIvent Halloween;

         a+=15;
      }
      if( number_of_step==b)
      {
         System.out.println("Ivent: Dicko ");
         ArbitraryIvent Dicko;
         b+=12;
      }
      if ( number_of_step==c)
      {
         System.out.println("Ivent: DopkaMatan ");
         ArbitraryIvent DopkaMatan;
         c+=14;
      }

   }

}
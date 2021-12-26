package Game;

import Manager.Manager;

public class Ivents
{
   //rand invent
   public void Boxonov (MyCharacter hero)
   {
      if (hero.get_marks() >= 50)
      {
         RandomIvent  make_KP ;
      }
      else
      {
         RandomIvent  buy_KP;
      }
   }

   public void Kipusha (MyCharacter hero)
   {
      if (hero.get_marks() >= 40)
      {
         RandomIvent do_your_own_lab;
      }
      else
      {
         RandomIvent  write_off_the_lab;
      }
   }

   public void Petrenko ( MyCharacter hero)
   {
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
         ArbitraryIvent Halloween;

         a+=15;
      }
      if( number_of_step==b)
      {
         ArbitraryIvent Dicko;
         b+=12;
      }
      if ( number_of_step==c)
      {
         ArbitraryIvent DopkaMatan;
         c+=14;
      }

   }

}
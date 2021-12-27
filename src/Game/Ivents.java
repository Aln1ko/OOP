package Game;


public class Ivents
{
   //rand invent
   public void Boxonov (MyCharacter hero,int number_of_step)
   {
      if(number_of_step == (int)(Math.random()*300))
      {
         if (hero.get_marks() >= 50)
         {
            System.out.println("RandIvent: Make KP Boxonov");
            RandomIvent  make_KP ;
            hero.set_number_of_step(hero.get_number_of_step()+1);
         }
         else
         {
            System.out.println("RandIvent: Buy KP Boxonov");
            RandomIvent  buy_KP;
            hero.set_number_of_step(hero.get_number_of_step()+1);
         }
      }

   }

   public void Kipusha (MyCharacter hero,int number_of_step)
   {
      if(number_of_step == (int)(Math.random()*300))
      {

         if (hero.get_marks() >= 40)
         {
            System.out.println("RandIvent: Do your own lab Kipusha ");
            RandomIvent do_your_own_lab;
            hero.set_number_of_step(hero.get_number_of_step()+1);
         }
         else
         {
            System.out.println("RandIvent: write off the lab Kipusha ");
            RandomIvent write_off_the_lab;
            hero.set_number_of_step(hero.get_number_of_step()+1);
         }
      }
   }

   public void Petrenko ( MyCharacter hero, int number_of_step)
   {
      if(number_of_step == (int)(Math.random()*300))
      {
         System.out.println("RandIvent: wrote KP Petrenko");
         RandomIvent write_KP;
         hero.set_number_of_step(hero.get_number_of_step()+1);
      }
   }


   //arbitrary ivent

   public void IventOnStep (MyCharacter hero, int number_of_step)
   {
      int a = 7;
      int b = 19;
      int c = 26;

      if( number_of_step==a)
      {
         System.out.println("Ivent: Halloween ");
         ArbitraryIvent Halloween;
         hero.set_number_of_step(hero.get_number_of_step()+1);

         a+=15;
      }
      if( number_of_step==b)
      {
         System.out.println("Ivent: Dicko ");
         ArbitraryIvent Dicko;
         hero.set_number_of_step(hero.get_number_of_step()+1);
         b+=12;
      }
      if ( number_of_step==c)
      {
         System.out.println("Ivent: DopkaMatan ");
         ArbitraryIvent DopkaMatan;
         hero.set_number_of_step(hero.get_number_of_step()+1);
         c+=14;
      }

   }

}
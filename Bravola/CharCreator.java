import java.util.Scanner;
import java.io.Console;
import java.io.IOException;


class PChar
{

  int str = 10; int vit = 10; int kno = 10;
  int dex = 10; int cha = 10; int per = 10;

  int age, height, weight;
  String name; String hair; String eyes; String race;
  String job; String affil;
  String[] inventory;

  int[] skillval;
  String[] skillname;

  public void editStats(int statPoints)
  {
    Scanner in = new Scanner(System.in);

    Boolean running = true;

    while (running == true)
    {

      if (statPoints == 0)
      {
        running = false;
      }

      System.out.println("STAT MENU");
      System.out.println("1. STRENGTH: " + str);
      System.out.println("2. VITALITY: " + vit);
      System.out.println("3. KNOWLEDGE: " + kno);
      System.out.println("4. DEXTERITY: " + dex);
      System.out.println("5. CHARISMA: " + cha);
      System.out.println("6. PERCEPTION: " + per);
      System.out.println();
      System.out.println("You currently have " + statPoints + " available.");

      System.out.println("Which stat would you like to increment?");
      System.out.println("Please enter the corresponding number.");
      System.out.print("> ");

      int choice = in.nextInt();

      if (choice == 1)
      {
        this.str += 1;
        statPoints -= 1;
      }
      else if (choice == 2)
      {
        this.vit += 1;
        statPoints -= 1;
      }
      else if (choice == 3)
      {
        this.kno += 1;
        statPoints -= 1;
      }
      else if (choice == 4)
      {
        this.dex += 1;
        statPoints -= 1;
      }
      else if (choice == 5)
      {
        this.cha += 1;
        statPoints -= 1;
      }
      else if (choice == 6)
      {
        this.per += 1;
        statPoints -= 1;
      }
      else
      {
        System.out.println("That is an invalid value.");
      }
      //also write something that clears the screen after u increment a stat
    }

  }
}


public class CharCreator
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    PChar Player = new PChar();

    System.out.println("Welcome to the BRAVOLA ODYSSEY");
    System.out.println();

    System.out.println("What is your name?");
    System.out.print("> ");
    String pname = in.next();
    Player.name = pname;
    System.out.println("Welcome, " + Player.name + ".");

    System.out.println();

    System.out.println("What is your race?");
    System.out.println("1. Human");
    System.out.println("2. Smith");
    System.out.println("3. Space Elves");
    System.out.println("4. Gnarp'i");
    System.out.println("5. Android");
    System.out.println("6. Butlar");
    System.out.print("> ");

    choice = in.nextInt();

    if (choice == 1)
    {
      System.out.println("You have chosen HUMAN.");
      System.out.println("HUMANS are the natives of planet Earth. They are\n
                          versatile, and have no stat bonuses or penalties.");
    }
    else if (choice == 2)
    {
      System.out.println("You have chosen SMITH.");
      System.out.println("Members of the SMITH race have been given a bad\n
                          lot in life. They have a penalty to all stats.");
    }
    else if (choice == 3)
    {
      System.out.println("You have chosen SPACE ELVES.");
      System.out.println("SPACE ELVES are native to the planet of North Poal,\n
                          a world near the galactic boundary. They have a bonus\n
                          to CHARISMA. Being naturally thin, they have a penalty\n
                          to STRENGTH.");
    }
    else if (choice == 4)
    {
      System.out.println("You have chosen GNARP'I");
      System.out.println("The GNARP'I are insectoid entities from the planet of\n
                          Slimia. They have an appearance resembling a giant\n
                          snail. They have a bonus to PERCEPTION. Lacking any\n
                          skeleton, they have a penalty to VITALITY.");
    }
    else if (choice == 5)
    {
      System.out.println("You have chosen ANDROID.");
      System.out.println("The ANDROIDS are synthetic men and women created long\n
                          ago by the HUMANS. Being made of plastics and metals,\n
                          they have a bonus to VITALITY. With a human veneer\n
                          not quite convincing, they have a penalty to CHARISMA.")
    }
    else if (choice == 6)
    {
      System.out.println("You have chosen BUTLAR.");
      System.out.println("The BUTLAR are a race native to the ocean world of\n
                          PROTEEN. Known for creating stones out of sand with\n
                          only the strength of their physique, the BUTLAR have\n
                          a bonus to STRENGTH. Being naturally unwieldy, they\n
                          have a penalty to DEXTERITY.")
    }



    System.out.println("You will now choose your stats.");

    Player.editStats(6);

    System.out.println("How old are you, " + Player.name + "?");
    System.out.print("> ");

    Player.age = in.nextInt();

    System.out.println("What color is your hair?");
    System.out.print("> ");

    Player.hair = in.next();





/*    while choosing == true
    {
      int points = 5;


    } */

  }

}

import java.util.Scanner;


import java.util.Random;



class Fighter
{
    Items item= new Items();
    Random rand = new Random(); 
    int hp = 50; int spd = 5; int spdcountdown = 0; String name = "Blooper";
    
    //offensive categories
    int strength = 10;int damage =rand.nextInt(1+(strength/2))+1;
    
    //defensive categories
    int def = 5; int dodge=0;int block = 0;
    int dodge_(int def , int spd){
        dodge =rand.nextInt(1+(def/2) + (dexterity/4 +spd/4));
        return dodge;
    }
    int block_(int defcalc , int strengthcalc)
    {
        dodge =rand.nextInt(1+(defcalc/2) + (strengthcalc/4));
        return dodge;
    }
    Weapons singlehandedSlot= null;
    
    

    //"support" categories
    int dexterity = 10; int accuracy = 0; //Also weapon skill maybe?
    int accuracy_(int dexterity){
        accuracy =rand.nextInt(1+(dexterity/2))+1;
        return dodge;
    }
    
    
}

class Items
{
    int dmgbonus; int strbonus; int dexbonus; int accbonus; int defbonus; int spdbonus; int blockbonus; int hpbonus;
    int dogbonus;String type = "";
}

class Weapons extends Items{

}

class Armors extends Items{

}

class combat
{
    Scanner s = new Scanner(System.in);
    boolean inCombat = true;
    Random rand = new Random();
    int attack (Fighter blooper, Fighter blooper2)
    {
        blooper.dodge = blooper.dodge_(blooper.def, blooper.spd);
        blooper2.dodge = blooper2.dodge_(blooper2.def, blooper2.spd);
        
        if (blooper.accuracy > blooper2.dodge)
        {
            blooper.damage =rand.nextInt(1 +(blooper.strength/4))+1;
            blooper2.block = blooper2.block_(blooper2.def, blooper2.strength);
            int truedamage = (blooper.damage - blooper2.block);
            if (truedamage <= 0)
                truedamage = 0;
            blooper2.hp -= truedamage;
            System.out.println(blooper.name+" did"+ truedamage +" damage!");
            System.out.println(blooper2.name+"Blocked"+ blooper2.block +" damage!");
        }
        else
        
        {
            System.out.println("damage was NOT done!");
        }
        
        return 0;
    }
    void taketurn(Fighter blooper, Fighter blooper2)
    {
        while (inCombat){
            blooper.spdcountdown += blooper.spd;
            blooper2.spdcountdown += blooper2.spd;
            if (blooper.spdcountdown >= 20 && blooper.spdcountdown> blooper2.spdcountdown)
            {
                System.out.println(blooper.name +" attacked!");
                attack(blooper, blooper2);
                blooper.spdcountdown = 0;
                s.nextLine();
                
            }
            else if (blooper2.spdcountdown >= 20 && blooper2.spdcountdown> blooper.spdcountdown)
            {
                System.out.println(blooper2.name +"attacked!");
                attack(blooper2, blooper);
                blooper2.spdcountdown = 0;
                s.nextLine();
            }
            else
            {
                System.out.println("did not attack");
            
            }
            if (blooper2.hp <= 0)
            {
                System.out.print(blooper.name +"Wins");
                inCombat = false;
            }
            else if (blooper.hp <= 0)
            {
                System.out.println(blooper2.name +" WONMS");   
                inCombat = false;
            }
            System.out.println(blooper.name + "has" + blooper.hp+ "left");
            System.out.println(blooper2.name + "has" + blooper2.hp+ "left");
            }
            }
        }
    
    
    





class Fightgame{

    Scanner s = new Scanner(System.in);

    public static void main(String[] args)
{
    //#polymorphism in java
    Fighter Optimus = new Fighter();
    Fighter Ebolber = new Fighter();
    Items Sword = new Weapons();
    Sword.type = "Sword"; //#polymorphism in java
    System.out.println(Sword.type);
    Ebolber.spd = 10;
    Ebolber.accuracy = 10;
    Ebolber.strength = 10;
    Ebolber.name = "EVO-LUTION";
    Optimus.name = "PrimmCess";
    Optimus.accuracy = 5;
    Optimus.strength = 20;
    Optimus.def = 5;
    Optimus.singlehandedSlot = new Weapons();
    Optimus.singlehandedSlot.type = Sword.type;
    System.out.println(Optimus.singlehandedSlot.type);
    combat combat= new combat();
    combat.taketurn(Optimus, Ebolber);
    
    System.out.println(combat);
}
    
}

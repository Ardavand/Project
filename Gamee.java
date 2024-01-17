
package gamee;
import java.util.Scanner;
public class Gamee {
    public static void main(String[] args) {
       //Buat Objek
       Scanner input = new Scanner (System.in); 
       Player Hero = new Player();
       
        System.out.println("Hero vs Villain");
       
       
       System.out.print("Hero name = ");
       String hero = input.next();
       Hero.name = hero;
       System.out.println("Input Hero Stat");
        System.out.print("Speed = ");
       int Speed = input.nextInt();
       Hero.speed = Speed;
        System.out.print("Healtpoint = ");
       int hp = input.nextInt();
       Hero.healthpoint = hp;
        System.out.print("Attack = ");
       int attck = input.nextInt();
       Hero.attack = attck;
        System.out.print("Defend = ");
       int def = input.nextInt();
       Hero.defend = 80;
       Hero.Ult = 10000;
       
       
       
//       if(Hero.isDead()){
//           System.out.println("Game Over");
//       }
       
        System.out.println("---------------------------");
        Player Villain = new Player();
        
        System.out.print("Villain name = ");
        String villain = input.next();
        Villain.name = villain;
        Villain.speed = 20;
        Villain.healthpoint = 80;
        Villain.attack = 50;
        Villain.defend = 90;
        
        
        
//        if(Villain.isDead()){
//            System.out.println("Hero win !!!");
//        }
       
       Hero.run();
       Hero.attack();
       Villain.run();
       Villain.defend();
       Villain.attack();
       Hero.defend();
       
//       if(Hero.isDead()){
//           System.out.println("Villain Win");
//       }
//       if(Villain.isDead()){
//           System.out.println("Hero Win");
//       }
       
    System.out.println("After a Long Battle");    
    System.out.print("Hero launching his Final Power");
        System.out.println("The Hero damaged The Villain "+ Hero.Ult);
        int afterwar= Hero.Ult - Villain.healthpoint;
        if (Villain.healthpoint <= 10000 ){
            System.out.println("and the winner is The HERO !!!!!");
        }
        
        
       
       
    }
    
}

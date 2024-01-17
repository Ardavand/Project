package gamee;
public class Player {
    
    //Attribut
    String name;
    int speed, healthpoint, attack, defend, Role, Ult;
    
    //method
    void run(){
        System.out.println(name+ " is Running ...");
        System.out.println("Speed "+ speed);
    }
    
    void attack(){
        System.out.println(name+ " is Attacking ...");
        System.out.println("Damage "+ attack);
    }
    
    void defend(){
        System.out.println(name+ " is Defending ...");
        System.out.println("Armor "+ defend);
    }
    boolean isDead(){
        if (healthpoint <= 0)return true;
            return false;
        }
    
    void Ult(){
        System.out.println(name+ " Ultimate");
        System.out.println("Ultimate"+ Ult);
    } 
    
    
    
}
        
    


package demo4;

class Plane 
{
    void fly() 
    {
        System.out.println("The plane is flying");
    }
}

class cargoPlane extends Plane
{
    void fly() 
    {
        System.out.println("The Cargo Plane is flying at lower heights");
    }
}

class passengerPlane extends Plane 
{
    void fly() 
    {
        System.out.println("The Passanger Plane is flying at medium heights");
    }
}

class fighterPlane extends Plane 
{
    void fly() 
    {
        System.out.println("The Fighter Plane is flying at great heights");
    }
}
        

public class Demo4 {
    
    public static void main(String[] args) {
        
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterPlane fp = new fighterPlane();
        
        Plane ref;
        ref = cp;
        ref.fly();
        
        ref = pp;
        ref.fly();
        
        ref = fp;
        ref.fly();
               
        /*cp.fly();
        pp.fly();
        fp.fly();*/
    }
    
}

interface Name{
    String name = "Giorno Giovanna";
}

interface Dream{
    void dream();
}

abstract class Jojo implements Dream, Name{
// Abstract class can implement templates but not vice versa

    private String just; //note the access modifier

    Jojo(String string){
        this.just = string; // note that I have a constructor that can modify the string
    }

    public void dream(){// the implementation of the method defined in the interface
        System.out.print("\n I, " + name + " have a dream " + just);
    }
}

class Giorno extends Jojo{

   public Giorno(){
     super("that I know is just!"); // invokes the abstract constructor 
    }
}

class Jojodream{

    public static void main(String args[]) {
        
        Giorno Giovanna = new Giorno();

        Giovanna.dream();

    }
}
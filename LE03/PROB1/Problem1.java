/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


abstract class Bharatvanshi {
    String name;

    
    public Bharatvanshi(String name) {
        this.name = name;
    }

    
    public abstract void fight();
}


class Pandav extends Bharatvanshi {
    boolean isKind;

    
    public Pandav(String name, boolean isKind) {
        super(name);
        this.isKind = isKind;
    }

    
    public void fight() {
        System.out.println(name + " is fighting!");
    }

    
    public void obey() {
        System.out.println(name + " is obeying!");
    }

    
    public void kind() {
        if (isKind) {
            System.out.println(name + " is kind!");
        } else {
            System.out.println(name + " is not very kind!");
        }
    }
}


class Kaurav extends Bharatvanshi {

    
    public Kaurav(String name) {
        super(name);
    }

    
    public void fight() {
        System.out.println(name + " is fighting!");
    }

    
    public void disobey() {
        System.out.println(name + " is disobeying!");
    }
}


class Vikarn extends Kaurav {

    
    public Vikarn(String name) {
        super(name);
    }

    
    public void fight() {
        System.out.println(name + " is fighting like a noble warrior!");
    }

    
    public void obey() {
        System.out.println(name + " is obeying like a true Bharatvanshi!");
    }

    
    public void kind() {
        System.out.println(name + " is kind like a Pandav!");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Pandav arjun = new Pandav("Arjun", true);
        Pandav bheem = new Pandav("Bheem", false);

        
        Kaurav duryodhan = new Kaurav("Duryodhan");
        Vikarn vikarn = new Vikarn("Vikarn");

        
        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        
        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        
        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.disobey();

        
        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}

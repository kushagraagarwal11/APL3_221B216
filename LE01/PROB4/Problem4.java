/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


class One {
    int x;
    One(int x) {
        this.x = x;
        System.out.println("One's constructor called with x = " + x);
    }
}


class Two extends One {
    
    Two(int x) {
        super(x);  
        System.out.println("Two's constructor called with x = " + x);
    }
}


class Application {
    public static void main(String args[]) {
        Two t = new Two(10);
    }
}







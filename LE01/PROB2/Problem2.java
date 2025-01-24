/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


class Mother {
    void show() {
        System.out.println("Hello World");
    }
}


class Child extends Mother {
    void show() {
        System.out.println("Hello JUET");
    }
}


public class Application {
    public static void main(String[] args) {
        
        Mother m = new Mother();
        m.show();  
        
        Child c = new Child();
        c.show();  
       
        Mother m1 = new Child();
        m1.show();  
    }
}












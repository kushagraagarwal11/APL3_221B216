/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


class Mother {
    int x = 10;
    static void show() {
        System.out.println("Hello World");
    }
}


class Child extends Mother {
    static void show() {
        System.out.println("Hello JUET");
    }
}


class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();  
        Mother m1 = new Child();  
        m1.show();  
    }
}

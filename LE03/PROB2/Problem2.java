/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

interface Testable {
    void display(); 
}


class Test implements Testable {
    
    public void display() {
        System.out.println("Displaying from Test class.");
    }
}


abstract class AbsTest implements Testable {

}


class ConcreteTest extends AbsTest {
    
    public void display() {
        System.out.println("Displaying from ConcreteTest class.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Test test = new Test();
        test.display(); 
        
        
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display(); 
    }
}

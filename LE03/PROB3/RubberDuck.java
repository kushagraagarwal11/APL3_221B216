class RubberDuck extends Duck {
    public RubberDuck() {
        swimBehavior = new SwimWithStyle(); 
        flyBehavior = new NoFly();          
        quackBehavior = new Squeak();       
    }
    
    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}

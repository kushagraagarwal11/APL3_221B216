class WoodenDuck extends Duck {
    public WoodenDuck() {
        swimBehavior = new SwimWithStyle(); 
        flyBehavior = new NoFly();          
        quackBehavior = new Mute();         
    }

    public void display() {
        System.out.println("I am a Wooden Duck.");
    }
}

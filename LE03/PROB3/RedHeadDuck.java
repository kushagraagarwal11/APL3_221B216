class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        swimBehavior = new SwimWithStyle(); 
        flyBehavior = new FlyWithWings();   
        quackBehavior = new Quack();        
    }

    public void display() {
        System.out.println("I am a RedHead Duck.");
    }
}

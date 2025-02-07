class LakeDuck extends Duck {
    public LakeDuck() {
        swimBehavior = new SwimWithStyle(); 
        flyBehavior = new FlyWithWings();   
        quackBehavior = new Quack();        
    }

    public void display() {
        System.out.println("I am a Lake Duck.");
    }
}
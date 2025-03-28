class Rum{
    
    private void pour(){
        System.out.println("Pour 30 ml of beverage in a glass.");
    }
    
    private void addCondiment(){
        System.out.println("Add Water.");
    }
    
    private void stir(){
        System.out.println("Stir for 33 seconds.");
    }
    
    private void serve(){
        System.out.println("Serve through waiter.");
    }
    
    public final void templateMethod(){
        pour();
        addCondiment();
        stir();
        serve();
    }
    
}
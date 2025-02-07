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
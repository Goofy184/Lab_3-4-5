class Submarine extends Vessel {
    public boolean isSubmerged;
    public Submarine(String name, int maxSpeed, boolean isSubmerged) {
        super(name, maxSpeed);
        this.isSubmerged = isSubmerged;
    }
    public void PrepareToMovement() {
        System.out.println("Preparing submarine for movement...");
    }

    public void Move() {
        System.out.println("Submarine is moving...");
    }

}

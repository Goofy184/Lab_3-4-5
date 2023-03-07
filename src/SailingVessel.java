class SailingVessel extends Vessel {
    private int numberOfSails;
    public SailingVessel(String name, int maxSpeed, int numberOfSails) {
        super(name, maxSpeed);
        this.numberOfSails = numberOfSails;
    }

    public void PrepareToMovement() {
        System.out.println("Підготовка вітрильника до руху...");
    }

    public void Move() {
        System.out.println("Вітрильник рухається...");
    }
    public int getNumberOfSails() {
        return numberOfSails;
    }
    public void setNumberOfSails(int numberOfSails) {
        this.numberOfSails = numberOfSails;
    }
}

import java.util.Objects;
abstract class Vessel {
    private static int counter = 0;
    protected String name;
    protected int maxSpeed;
    public Vessel (String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
        counter++;
    }

    public abstract void PrepareToMovement();
    public abstract void Move();

    // метод доступу до поля name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    protected int getMaxSpeed() {
        return maxSpeed;
    }
    protected void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public static int getCounter() {
        return counter;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vessel other = (Vessel) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.maxSpeed != other.maxSpeed) {
            return false;
        }
        return true;
    }
}

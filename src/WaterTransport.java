public interface WaterTransport {
    void PrepareToMovement();
    void Move();
    String getName();
    void setName(String name);
    int getMaxSpeed();
    void setMaxSpeed(int maxSpeed);
}
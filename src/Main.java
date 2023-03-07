public class Main {
    public static void main(String[] args) {
        WaterTransport[] vessel = {new SailingVessel("Sailboat1",20, 5), new Submarine("Submarine1",10, true)};
        for (var v : vessel){
            v.PrepareToMovement();
            v.Move();
            System.out.println("Vessel name: " + v.getName());
            System.out.println("Vessel max speed: " + v.getMaxSpeed());
            v.setName("NewName");
            v.setMaxSpeed(50);
            System.out.println("Vessel new name: " + v.getName());
            System.out.println("Vessel new max speed: " + v.getMaxSpeed());
            System.out.println("Кількість створених об'єктів: " + Vessel.getCounter());
        }
        WaterTransport v1 = new SailingVessel("Sailboat1",20, 5);
        WaterTransport v2 = new SailingVessel("Sailboat1",20, 5);
        if (v1.equals(v2)) {
            System.out.println("Об'єкти однакові");
        } else {
            System.out.println("Об'єкти різні");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vessel[] vessel = {new SailingVessel("Sailboat1",20, 5), new Submarine("Submarine1",10, true)};
        for (Vessel v : vessel){
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
        Vessel v1 = new SailingVessel("Sailboat1",20, 5);
        Vessel v2 = new SailingVessel("Sailboat1",20, 5);
        if (v1.equals(v2)) {
            System.out.println("Об'єкти однакові");
        } else {
            System.out.println("Об'єкти різні");
        }
    }
}
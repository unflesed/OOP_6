package OOP_6.task_2;

public class Vehicle {
    void print(){
        System.out.println("This is car.");
    }
    class Wheel{
        void print(){
            System.out.println("This is wheel.");
        }
    }
    class Door{
        void print(){
            System.out.println("This is door.");
        }
    }
}
class Main{
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();
        wheel.print();
        door.print();
    }
}

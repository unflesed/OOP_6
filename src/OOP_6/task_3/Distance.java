package OOP_6.task_3;

public class Distance {
    static double  distance;
    void print(){
        System.out.println("Расстояние " + distance + " метров");
    }
    static class Converter{
        static double convToKM(){
            return distance / 1000;
        }
        static double convToMiles(){
            return distance / 1609.34;
        }
        static double convToFt(){
            return distance / 0.3048;
        }
    }
}
class Main{
    public static void main(String[] args) {
        Distance distance = new Distance();
        Distance.distance = 1000;
        distance.print();
        System.out.println("Километров: " + Distance.Converter.convToKM());
        System.out.println("Миль: " + Distance.Converter.convToMiles());
        System.out.println("Футов: " + Distance.Converter.convToFt());
    }
}

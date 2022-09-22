public class TestSpeedCar {
    public static void main(String[] args) {
        // Create instance
        SpeedCar sbCar = new SpeedCar("Mario",10,15);
        SpeedCar sbCar2 = new SpeedCar("Peach",11,14);
        SpeedCar sbCar3 = new SpeedCar("Carrito",9,16);

        // Print
        System.out.println("The number of car is: " + sbCar3.getNumCar());
        System.out.println("The avarage maximum distance is: " + (sbCar.maxDistance() + sbCar2.maxDistance() + sbCar3.maxDistance()) / sbCar3.getNumCar());
    }
}

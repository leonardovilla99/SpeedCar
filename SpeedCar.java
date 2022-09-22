/**
 * SpeedCara
 */
public class SpeedCar {

    private String name;
    private double gasCapacity;
    private double gasEfficiency;
    private static int numCars;

    // Constructors
    public SpeedCar(String n,double c, double e){
        name = n;
        gasCapacity = c;
        gasEfficiency = e;
        numCars++;
    }
    public SpeedCar(){
        name = "";
        gasCapacity = 0;
        gasEfficiency = 0;
        numCars++;
    }
    public SpeedCar(SpeedCar obj){
        name = obj.name;
        gasCapacity = obj.gasCapacity;
        gasEfficiency = obj.gasEfficiency;
        numCars++;
    }

    // Method
    public double maxDistance(){
        return gasEfficiency * gasCapacity;
    }

    // Accessors
    public int getNumCar(){
        return numCars;
    }

}
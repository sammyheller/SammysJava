/**
 * Created by h205p5 on 2/27/19.
 */
public class Car {

    private int year;
    private String make;
    private int miles;
    private String model;

    public Car(String make, int miles, int year, String model) {
        this.make = make;
        this.miles = 0;
        this.year = year;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public int getMiles() {
        return miles;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", miles=" + miles +
                ", model='" + model + '\'' +
                '}';
    }
}

/**
 * Created by h205p5 on 2/27/19.
 */
public class Runner {
    public static void main(String[] args) {

        Car myCar = new Car ("Toyota", 100000, 2020, "4runner");
        System.out.println(myCar.getMiles());
        System.out.println(myCar.getMiles());
        myCar.setMiles(100000000);

        Rectangle myRectangle = new Rectangle(10, 10);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDiagonal());
        System.out.println(myRectangle.isSquare());

    }
}

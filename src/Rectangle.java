/**
 * Created by h205p5 on 2/27/19.
 */

public class Rectangle {


    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getDiagonal(){
        return Math.sqrt(length*length + width*width);
    }

    public boolean isSquare(){
        if(length==width){
            return true;
        }
        return false;
    }

}


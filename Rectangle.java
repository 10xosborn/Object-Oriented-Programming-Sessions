public class Rectangle{
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Rectangle rectangleObject = new Rectangle(2.0, 3.0);
        System.out.println("Area: " + rectangleObject.getArea());
        System.out.println("Perimeter: " + rectangleObject.getPerimeter());
    }
}
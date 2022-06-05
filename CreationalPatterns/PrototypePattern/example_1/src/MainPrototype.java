public class MainPrototype {

    public static void main(String [] args){

        Circle circle = new Circle(10,10,12);
        Circle circle1 = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(circle1);


        Rectangle rectangle = new Rectangle(10,12);
        Rectangle rectangle1 = (Rectangle) rectangle.clone();

        System.out.println(rectangle);
        System.out.println(rectangle1);

    }
}
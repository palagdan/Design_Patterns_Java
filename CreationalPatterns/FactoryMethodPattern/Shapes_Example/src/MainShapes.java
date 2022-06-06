public class MainShapes {

    public static void main(String [] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        ShapeFactoryMethod shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        ShapeFactoryMethod shape2 = shapeFactory.getShape("triangle");
        shape2.draw();
    }
}

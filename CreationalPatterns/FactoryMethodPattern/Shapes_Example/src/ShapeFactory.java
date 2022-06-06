public class ShapeFactory {

    public ShapeFactoryMethod getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new CircleFactoryMethod();

        } else if(shapeType.equalsIgnoreCase("TRIANGLE"))
            return new TriangleFactoryMethod();

        return null;

    }
}

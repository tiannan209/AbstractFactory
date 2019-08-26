public class TwoDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(ShapeType typeName) {
        if(typeName == ShapeType.LINE){
            return new Line();
        }else if(typeName == ShapeType.CIRCLE){
            return new Circle();
        }
        return null;
    }
}

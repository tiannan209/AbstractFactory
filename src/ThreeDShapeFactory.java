public class ThreeDShapeFactory extends AbstractFactory {
    @Override
    GeometricShape getShape(ShapeType typeName) {
        if(typeName == ShapeType.SPHERE){
            return new Sphere();
        }
        return null;
    }
}

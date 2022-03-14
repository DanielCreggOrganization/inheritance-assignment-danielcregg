import ie.gmit.animal.*;
import ie.gmit.twodshapes.*;

public class Main {

    // Add main method here
    public static void main(String[] args) {
        
        Triangle triangleObject1 = new Triangle(10.0f, 5.0f, "Scalene");
        ColouredTriangle colouredTriangleObject1 = new ColouredTriangle(12.1f, 3.4f, "Isosceles", "Red");
        Circle circleObject1 = new Circle(3.3f, 4.4f, 5.7f);

        // triangleObject1.setWidthCm(10.5f);
        // colouredTriangleObject1.setHeightCm(27.8f);
        // circleObject1.setWidthCm(11.1f);

        System.out.println( "Triangle width in cm = " + triangleObject1.getWidthCm()    );
        System.out.println(colouredTriangleObject1.getHeightCm() );
        System.out.println( "Radius = " + circleObject1.findRadius()  );
    }

} // End class

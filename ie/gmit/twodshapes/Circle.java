package ie.gmit.twodshapes;

public class Circle extends TwoDShape {
    
    // Instance Variables
    private float circumferenceCm; // C=2*Pi*radius, Note 2*radius = width

    public Circle(float widthCm, float heightCm, float circumferenceCm) {
        super(widthCm, heightCm);
        this.circumferenceCm = circumferenceCm;
    }

    public float getCircumferenceCm() {
        return circumferenceCm;
    }

    public void setCircumferenceCm(float circumferenceCm) {
        this.circumferenceCm = circumferenceCm;
    }

    public float findRadius() {
        return getWidthCm() / 2;
    }

}// End class

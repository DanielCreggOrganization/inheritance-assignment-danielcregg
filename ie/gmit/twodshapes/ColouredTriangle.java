package ie.gmit.twodshapes;

public class ColouredTriangle extends Triangle {

    // Instance Variable
    private String colour;

    public ColouredTriangle(float widthCm, float heightCm, String sideType, String colour) {
        super(widthCm, heightCm, sideType);
        this.colour = colour;
    }

    // Getter
    public String getColour() {
        return colour;
    }

    // Setter
    public void setColour(String colour) {
        this.colour = colour;
    }

}

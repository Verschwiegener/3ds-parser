package no.myke.parser;

/**
 *
 */
public class ModelObject {
    private String name;
    public float[] vertices;
    public int[] polygons;
    public float[] textureCoordinates;

    public ModelObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

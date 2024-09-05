package refactored;

public enum BodyMassIndex {

    DEFICIT(18.5f, 25f, "Deficit"),
    NORM(25f, 30f, "Norm"),
    WARNING(30f, Float.MAX_VALUE, "Warning"),
    FAT(Float.MIN_VALUE, 18.5f, "Fat");

    private final float lowerBound;
    private final float upperBound;
    private final String name;

    BodyMassIndex(float lowerBound, float upperBound, String name) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.name = name;
    }

    public float getLowerBound() {
        return lowerBound;
    }

    public float getUpperBound() {
        return upperBound;
    }

    public String getName() {
        return name;
    }
}

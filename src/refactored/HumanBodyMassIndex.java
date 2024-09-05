package refactored;

public class HumanBodyMassIndex {

    private final float weight;
    private final float height;

    public HumanBodyMassIndex(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    private float calculateBodyMassIndex() {
        return weight / (height * height);
    }

    public String getBodyMassIndexStatus() {
        float bmi = calculateBodyMassIndex();
        if (bmi < BodyMassIndex.DEFICIT.getLowerBound()) {
            return BodyMassIndex.DEFICIT.getName();
        } else if (bmi >= BodyMassIndex.NORM.getLowerBound() && bmi < BodyMassIndex.NORM.getUpperBound()) {
            return BodyMassIndex.NORM.getName();
        } else if (bmi >= BodyMassIndex.WARNING.getLowerBound() && bmi < BodyMassIndex.WARNING.getLowerBound()) {
            return BodyMassIndex.WARNING.getName();
        } else {
            return BodyMassIndex.FAT.getName();
        }
    }
}

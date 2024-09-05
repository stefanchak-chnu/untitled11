package refactored;

public class Main {

    public static void main(String[] args) {
        float weight = 80f;
        float height = 1.52f;

        HumanBodyMassIndex humanBodyMassIndex = new HumanBodyMassIndex(weight, height);
        System.out.println(humanBodyMassIndex.getBodyMassIndexStatus());
    }
}

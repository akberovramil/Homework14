public class Predators extends  Mammals{
    private String typeFoodPredators;

    public Predators(String namePet, int agePet, String livingEnvironment, double speedGo, String typeFoodPredators) {
        super(namePet, agePet, livingEnvironment, speedGo);
        if (typeFoodPredators == null || typeFoodPredators.isEmpty() || typeFoodPredators.isBlank()) {
            this.typeFoodPredators = "������� ���������� ��������";
        } else {
            this.typeFoodPredators = typeFoodPredators;
        }
    }

    public void hunt() {
        System.out.println("������ ��������");
    }
    @Override
    public void eat() {
        System.out.println("������ ���");
    }

    @Override
    public void go() {
        System.out.println("������ �������������");
    }

    public String getTypeFoodPredators() {
        return typeFoodPredators;
    }

    @Override
    public String toString() {
        return "������ - " + getNamePet() + " ,������� - " + getAgePet() +
                " ,����� �������� - " + getLivingEnvironment() +
                " , �������� ������������ - " + getSpeedGo() + " , ��� ���� - " + typeFoodPredators + " .";
    }
}

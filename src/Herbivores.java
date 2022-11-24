public class Herbivores extends Mammals{
    private String typeOfFood;

    public Herbivores(String namePet, int agePet, String livingEnvironment, double speedGo, String typeOfFood) {
        super(namePet, agePet, livingEnvironment, speedGo);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "������� ���������� ��������";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public void eat() {
        System.out.println("���������� ���");
    }

    @Override
    public void go() {
        System.out.println("���������� �������������");
    }

    public void pasture() {
        System.out.println("���������� �������");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }


    @Override
    public String toString() {
        return "���������� - " + getNamePet() + " ,������� - " + getAgePet() +
                " ,����� �������� - " + getLivingEnvironment() +
                " , �������� ������������ - " + getSpeedGo() + " , ��� ���� - " + typeOfFood + " .";
    }
}

public class Amphibians extends Pets{
    private String livingEnvironment;

    public Amphibians(String namePet, int agePet, String livingEnvironment) {
        super(namePet, agePet);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "������� ���������� ��������";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void hunt() {
        System.out.println("����������� ��������");
    }

    @Override
    public void eat() {
        System.out.println("����������� ���");
    }

    @Override
    public void go() {
        System.out.println("����������� �������������");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
       return  "����������� - " + getNamePet() + " ,������� - " + getAgePet() +
                " ,����� �������� - " + livingEnvironment+
                 " .";
    }
}

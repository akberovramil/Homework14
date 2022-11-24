public class Flying extends Birds {
    private String typeOfGo;

    public Flying(String namePet, int agePet, String livingEnvironment, String typeOfGo) {
        super(namePet, agePet, livingEnvironment);
        if (typeOfGo == null || typeOfGo.isEmpty() || typeOfGo.isBlank()) {
            this.typeOfGo = "������� ���������� ��������";
        } else {
            this.typeOfGo = typeOfGo;
        }
    }

    public void walk() {
        System.out.println("���������� ����� ������");
    }

    @Override
    public void eat() {
        System.out.println("���������� ����� ���");
    }

    @Override
    public void go() {
        System.out.println("���������� ����� �������������");
    }

    public String getTypeOfGo() {
        return typeOfGo;
    }

    @Override
    public String toString() {
        return  " ���������� ����� - " + getNamePet() + " ,������� - " + getAgePet() +
                " ,����� �������� - " + getLivingEnvironment() + " , ��� ������������ - " + typeOfGo +
                " .";
    }
}

import java.util.Objects;

public class Mammals extends Pets{

    private String livingEnvironment;
    private double speedGo;

    public Mammals(String namePet, int agePet, String livingEnvironment, double speedGo) {
        super(namePet, agePet);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "������� ���������� ��������";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (speedGo == 0 || speedGo > 250) {
            this.speedGo = 00000;
        } else {
            this.speedGo = speedGo;
        }
    }

    @Override
    public void eat() {
        System.out.println("������������� ���");
    }

    @Override
    public void go() {
        System.out.println("������������� �������������");
    }

    public void walk() {
        System.out.println("������������� ������");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }


    @Override
    public String toString() {
        return "������������� - " + getNamePet() + " ,������� - " + getAgePet() +
                " ,����� �������� - " + livingEnvironment +
                " , �������� ������������ - " + speedGo + " .";
    }

    public double getSpeedGo() {
        return speedGo;
    }

}

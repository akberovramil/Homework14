import java.util.Objects;

public class Pets {
    private String namePet;
    private int agePet;

    public String getNamePet() {
        return namePet;
    }

    public Pets(String namePet, int agePet) {
        if (namePet == null || namePet.isEmpty() || namePet.isBlank()) {
            this.namePet = "������� ���������� ��� ���������";
        } else {
            this.namePet = namePet;
        }
        if (agePet == 0 || agePet > 100) {
            System.out.println("������� ���������� �������");
        } else {
            this.agePet = agePet;
        }

    }

    public void eat() {
        System.out.println("�������� ���");
    }

    public void sleep() {
        System.out.println("�������� ����");
    }
    public void go () {
        System.out.println("�������� ���������");
    }

    public int getAgePet() {
        return agePet;
    }

    public void setAgePet(int agePet) {
        this.agePet = agePet;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "namePet='" + namePet + '\'' +
                ", agePet=" + agePet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return agePet == pets.agePet && Objects.equals(namePet, pets.namePet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePet, agePet);
    }


}

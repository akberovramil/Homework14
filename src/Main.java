public class Main {
    public static void main(String[] args) {
        System.out.println("�������� ������� 1");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "���������", 2016, "����� �����", "������");
        System.out.println(hyundai);
        hyundai.refill();
        Train last = new Train("��������", "B-901", 2011, "������", null, 301, 3500, "����������� ������", "�����-������������", 11, "������");
        Train lenin = new Train("���������", " D-125", 2019, "������", null, 270, 1700, "������������� ������", "���������-������������", 8, "�");
       last.showTrains();
       lenin.showTrains();
       last.refill();
        Bus bus1 = new Bus("���", "�-1", 2015, "������", "�����", 100, "�");
        Bus bus2 = new Bus("������", "�-1", 1995, "�������", "�����", 100, "������");
        Bus bus3 = new Bus("������", "�-1", 2005, "�����", "�������", 100, "������");
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus2);
        System.out.println("�������� ������� 2");
        bus1.refill();
        bus2.refill();
        bus3.refill();
        System.out.println("�������� ������� 3");
        Herbivores gazelle = new Herbivores("����", 12, "�����", 12.0, "�����");
        Herbivores giraffe = new Herbivores("������", 23, "�������", 2.9, "������");
        Herbivores horse = new Herbivores("������", 4, "�����", 17.0, "�����");
        Predators hyena = new Predators("������", 2, "�������", 9.0, "����");
        Predators tiger = new Predators("��������", 8, "�������", 8.0, "����");
        Predators bear = new Predators("�����", 9, "���", 2.0, "����, ���");
        Amphibians frog = new Amphibians("�������", 2, "������");
        Amphibians grass = new Amphibians("��������", 1, "������");
        NotFlying peacock = new NotFlying("������", 4, "�������", "������");
        NotFlying penguin = new NotFlying("������", 7, "������", "������");
        NotFlying dodo = new NotFlying("�����", 5, "�������", "������");
        Flying gull = new Flying("����", 1, "�������", "�����");
        Flying albatross = new Flying("�����", 1, "�������", "�����");
        Flying falcon = new Flying("����", 8, "�����", "�����");
        System.out.println(gazelle.toString());
        System.out.println(gazelle.equals(giraffe));


    }
}

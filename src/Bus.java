public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String colourBody, int maxSpeed, String fuel) {
        super(brand, model, year, country, colourBody, maxSpeed, fuel);
    }

    @Override
    public void refill() {
        if (getFuel().equalsIgnoreCase("������")) {
            System.out.println("���������� ������� " + getBrand() + " " + getModel() + " ��������� ��������");
        } else if (getFuel().equalsIgnoreCase("������")) {
            System.out.println("���������� ������� " + getBrand() + " " + getModel() + " ��������");
        } else {
            System.out.println("������� ���������� ��� �������");
        }

    }

}

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String colourBody, int maxSpeed, String fuel) {
        super(brand, model, year, country, colourBody, maxSpeed, fuel);
    }

    @Override
    public void refill() {
        if (getFuel().equalsIgnoreCase("Дизель")) {
            System.out.println("Заправляем автобус " + getBrand() + " " + getModel() + " дизельным топливом");
        } else if (getFuel().equalsIgnoreCase("Бензин")) {
            System.out.println("Заправляем автобус " + getBrand() + " " + getModel() + " бензином");
        } else {
            System.out.println("Введите правильный вид топлива");
        }

    }

}

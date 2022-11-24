import java.time.LocalDate;

public class Car extends Transport {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean noKeyAccess;

        public Key(boolean remoteEngineStart, boolean noKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.noKeyAccess = noKeyAccess;
        }

        public Key() {
            this(false, false);
        }
    }

    public class Insurance {
        private LocalDate validatePeriod;
        private final double costInsurance;
        private final String numberOfInsurance;

        public Insurance(LocalDate validatePeriod, double costInsurance, String numberOfInsurance) {
            if (validatePeriod == null) {
                validatePeriod = LocalDate.now().plusDays(365);
            } else {
                this.validatePeriod = validatePeriod;
            }

            this.costInsurance = costInsurance;
            if (numberOfInsurance == null) {
                this.numberOfInsurance = "123456789";
            } else {
                this.numberOfInsurance = numberOfInsurance;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getValidatePeriod() {
            return validatePeriod;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }

        public void  checkPeriodInsurance() {
            if (validatePeriod.isBefore(LocalDate.now()) || validatePeriod.isEqual(LocalDate.now())) {
                System.out.println("Срок действия Вашей страховки, срочно продлите страховку!");
            }

        }

        public String checkNumberOfInsurance(String numberOfInsurance) {
            if (numberOfInsurance.matches("[1-9][1-9][1-9][1-9][1-9][1-9][1-9][1-9][1-9]")) {
            } else {
                System.out.println("Номер страховки некорректный!");
            }
            return null;
        }

    }

    public double engineVolume;


    public String transmission;
    private String bodyType = "default";
    public String regNumber;
    private int seatsNumber = 5;
    public String tiresSeason;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String colourBody, int year, String country, String fuel) {
        super(brand, model, year, country, colourBody, fuel);

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public Car(String brand, String model, double engineVolume, String colourBody, int year, String country, String transmission, String bodyType, String regNumber, int seatsNumber, String tiresSeason, Key key, Insurance insurance, String fuel) {
        super(brand, model, colourBody, fuel);

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        this.regNumber = regNumber;

        if (seatsNumber <= 0) {
            this.seatsNumber = 22222;
        } else {
            this.seatsNumber = seatsNumber;
        }

        if (tiresSeason == null || tiresSeason.isEmpty() || tiresSeason.isEmpty()) {
            this.tiresSeason = "default";
        } else {
            this.tiresSeason = tiresSeason;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

    }


    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }





    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }


    public String getTiresSeason() {
        return tiresSeason;
    }

    public void setTiresSeason(String tiresSeason) {
        if (tiresSeason == null || tiresSeason.isEmpty() || tiresSeason.isEmpty()) {
            this.tiresSeason = "default";
        } else {
            this.tiresSeason = tiresSeason;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", модель - " + getModel() + ", объем двигателя в литрах - " + getEngineVolume() + ", цвет кузова - " + getColourBody() + ", год производства - " + getYear() + ", страна производства - " + getCountry() + " топливо - " + getFuel() + ".";
    }

    @Override
    public void refill() {
        if (getFuel().equalsIgnoreCase("Дизель")) {
            System.out.println("Заправляем машину " + getBrand() + " " + getModel() + " дизельным топливом");
        } else if (getFuel().equalsIgnoreCase("Бензин")) {
            System.out.println("Заправляем машину " + getBrand() + " " + getModel() + " бензином");
        } else if (getFuel().equalsIgnoreCase("Зарядка аккумулятора")) {
            System.out.println("Заряжаем электрокар " + getBrand() + " " + getModel() + " на специльных электропарковках");
        } else {
            System.out.println("Введите правильный вид топлива");
        }
    }


    public String toString1() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getBrand() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", color='" + getColourBody() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", transmission='" + getTransmission() + '\'' +
                ", bodyType='" + getBodyType() + '\'' +
                ", regNumber=" + getRegNumber() +
                ", seatsNumber=" + getSeatsNumber()+
                ", tiresSeason='" + getTiresSeason() + '\'' +
                '}';
    }

    public String changeTires() {
        if (tiresSeason.equalsIgnoreCase("летняя")) {
            tiresSeason = "Зимняя";
        } else if (tiresSeason.equalsIgnoreCase("зимняя")) {
            tiresSeason = "Летняя";
        } else {
            System.out.println("Ошибка, не указан тип шин");
        }
        return null;
    }

    public String checkNumber(String regNumber) {
        String n = "";
        if (regNumber.matches("\\w\\d\\d\\d\\w\\w\\d\\d\\d")) {
            System.out.println("Номер введен верно");
        } else {
            System.out.println("Номер введен неверно");
        }
        return null;
    }
}

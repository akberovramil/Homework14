public class Train extends Transport {
    private int priceOfTheTrip;
    private int timeOfTheTrip;
    private String startStation;
    private String finishStation;
    private int numberOfWagons;

    public int getPriceOfTheTrip() {
        return priceOfTheTrip;
    }



    public Train(String brand, String model, int year, String country, String colourBody, int maxSpeed, int priceOfTheTrip, String startStation, String finishStation, int numberOfWagons, String fuel) {
        super(brand, model, year, country, null, maxSpeed, fuel);

        colourBody = null;

        if (Double.compare(priceOfTheTrip, 0) == 0) {
            this.priceOfTheTrip = 100;
        } else {
            this.priceOfTheTrip = priceOfTheTrip;
        }
        if (Double.compare(timeOfTheTrip, 0) == 0) {
            this.timeOfTheTrip = 1;
        } else {
            this.timeOfTheTrip = timeOfTheTrip;
        }
        if (startStation == null || startStation.isEmpty() || startStation.isEmpty()) {
            this.startStation = "дефолтный";
        } else {
            this.startStation = startStation;
        }
        if (finishStation == null || finishStation.isEmpty() || finishStation.isEmpty()) {
            this.finishStation = "дефолтный";
        } else {
            this.finishStation = finishStation;
        }
        if (Double.compare(numberOfWagons, 0) == 0) {
            this.numberOfWagons = 3;
        } else {
            this.numberOfWagons = numberOfWagons;
        }

    }




    public void setPriceOfTheTrip(int priceOfTheTrip) {
        if (Double.compare(priceOfTheTrip, 0) == 0) {
            this.priceOfTheTrip = 100;
        } else {
            this.priceOfTheTrip = priceOfTheTrip;
        }
    }

    public int getTimeOfTheTrip() {
        return timeOfTheTrip;
    }

    public void setTimeOfTheTrip(int timeOfTheTrip) {
        if (startStation == null || startStation.isEmpty() || startStation.isEmpty()) {
            this.startStation = "дефолтный";
        } else {
            this.startStation = startStation;
        }

    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        if (startStation == null || startStation.isEmpty() || startStation.isEmpty()) {
            this.startStation = "дефолтный";
        } else {
            this.startStation = startStation;
        }
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        if (finishStation == null || finishStation.isEmpty() || finishStation.isEmpty()) {
            this.finishStation = "дефолтный";
        } else {
            this.finishStation = finishStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (Double.compare(numberOfWagons, 0) == 0) {
            this.numberOfWagons = 3;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public void showTrains() {
        System.out.println("Название поезда  - " + getBrand() + " , модель поезда - " + getModel() + " , год производства - " + getYear() + " , страна производства " + getCountry() + ", максминальная скорость " + getMaxSpeed() + ", станция отправки " + getStartStation() + ", станция прибытия " + getFinishStation() + "количество вагонов " + getNumberOfWagons() + " тип топлива " + getFuel());
    }

    @Override
    public String toString() {
        return "Train{" +
                "priceOfTheTrip=" + priceOfTheTrip +
                ", timeOfTheTrip=" + timeOfTheTrip +
                ", startStation='" + startStation + '\'' +
                ", finishStation='" + finishStation + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}';
    }

    @Override
    public void refill() {
        if (getFuel().equalsIgnoreCase("Дизель")) {
            System.out.println("Заправляем поезд " + getBrand() + " " + getModel() + " дизельным топливом");
        } else {
            System.out.println("Введите правильный вид топлива");
        }
    }
}

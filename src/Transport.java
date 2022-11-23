public abstract class Transport {
    private  String brand;
    private String model;
    private final int year;
    private final String country ;
    private String colourBody;
    private int maxSpeed;
    private String fuel;


    public Transport(String brand, String model, int year, String country, String colourBody, int maxSpeed, String fuel) {

        if (brand == null || brand.isEmpty() || brand.isEmpty()) {
            this.brand = "дефолтный";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isEmpty()) {
            this.model = "дефолтный";
        } else {
            this.model = model;
        }

        if (Double.compare(year, 0) == 0) {
            this.year = 5;
        }else{
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isEmpty()) {
            this.country = "дефолтный";
        } else {
            this.country = country;
        }

        if (colourBody == null || colourBody.isEmpty() || colourBody.isEmpty()) {
            this.colourBody = "белый";
        } else {
            this.colourBody = colourBody;
        }

        if (Double.compare(maxSpeed, 0) == 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.fuel = fuel;

    }

    public Transport(String brand, String model, String colourBody, String fuel) {
        this.brand = brand;
        this.model = model;
        if (colourBody == null || colourBody.isEmpty() || colourBody.isEmpty()) {
            this.colourBody = "белый";
        } else {
            this.colourBody = colourBody;
        }

        this.fuel = fuel;

        this.country = getCountry();
        this.year = getYear();
    }

    public Transport(String brand, String model, int year, String country, String colourBody, String fuel) {
        this.brand = brand;
        this.model = model;
        if (Double.compare(year, 0) == 0) {
            this.year = 5;
        }else{
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isEmpty()) {
            this.country = "дефолтный";
        } else {
            this.country = country;
        }
        if (colourBody == null || colourBody.isEmpty() || colourBody.isEmpty()) {
            this.colourBody = "белый";
        } else {
            this.colourBody = colourBody;
        }

        this.fuel = fuel;
    }



    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColourBody() {
        return colourBody;
    }

    public void setColourBody(String colourBody) {
        if (colourBody == null || colourBody.isEmpty() || colourBody.isEmpty()) {
            this.colourBody = "белый";
        } else {
            this.colourBody = colourBody;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (Double.compare(maxSpeed, 0) == 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", colourBody='" + colourBody + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public abstract void refill();
}

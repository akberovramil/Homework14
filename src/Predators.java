public class Predators extends  Mammals{
    private String typeFoodPredators;

    public Predators(String namePet, int agePet, String livingEnvironment, double speedGo, String typeFoodPredators) {
        super(namePet, agePet, livingEnvironment, speedGo);
        if (typeFoodPredators == null || typeFoodPredators.isEmpty() || typeFoodPredators.isBlank()) {
            this.typeFoodPredators = "Введите коккретное значение";
        } else {
            this.typeFoodPredators = typeFoodPredators;
        }
    }

    public void hunt() {
        System.out.println("Хищник охотится");
    }
    @Override
    public void eat() {
        System.out.println("Хищник ест");
    }

    @Override
    public void go() {
        System.out.println("Хищник передвигается");
    }

    public String getTypeFoodPredators() {
        return typeFoodPredators;
    }

    @Override
    public String toString() {
        return "Хищник - " + getNamePet() + " ,возраст - " + getAgePet() +
                " ,среда обитания - " + getLivingEnvironment() +
                " , скорость передвижения - " + getSpeedGo() + " , тип пищи - " + typeFoodPredators + " .";
    }
}

public class Herbivores extends Mammals{
    private String typeOfFood;

    public Herbivores(String namePet, int agePet, String livingEnvironment, double speedGo, String typeOfFood) {
        super(namePet, agePet, livingEnvironment, speedGo);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Введите правильное значение";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public void eat() {
        System.out.println("Травоядное ест");
    }

    @Override
    public void go() {
        System.out.println("Травоядное передвигается");
    }

    public void pasture() {
        System.out.println("Травоядное пасется");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }


    @Override
    public String toString() {
        return "Травоядное - " + getNamePet() + " ,возраст - " + getAgePet() +
                " ,среда обитания - " + getLivingEnvironment() +
                " , скорость передвижения - " + getSpeedGo() + " , тип пищи - " + typeOfFood + " .";
    }
}

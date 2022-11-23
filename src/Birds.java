public class Birds extends Pets{
    private String livingEnvironment;

    public Birds(String namePet, int agePet, String livingEnvironment) {
        super(namePet, agePet);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "¬ведите корректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }
public void hunt() {
    System.out.println("ѕтица охотитс€");
}
    @Override
    public void eat() {
        System.out.println("ѕтица ест");
    }

    @Override
    public void go() {
        System.out.println("ѕтица летает");
    }


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
        return  "ѕтица - " + getNamePet() + " ,возраст - " + getAgePet() +
                " ,среда обитани€ - " + livingEnvironment+
                " .";
    }
}

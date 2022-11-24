public class Amphibians extends Pets{
    private String livingEnvironment;

    public Amphibians(String namePet, int agePet, String livingEnvironment) {
        super(namePet, agePet);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Введите корректное значение";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void hunt() {
        System.out.println("Земноводное охотится");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное ест");
    }

    @Override
    public void go() {
        System.out.println("Земноводное передвигается");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
       return  "Земноводное - " + getNamePet() + " ,возраст - " + getAgePet() +
                " ,среда обитания - " + livingEnvironment+
                 " .";
    }
}

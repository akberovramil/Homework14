public class NotFlying  extends Birds{
    private String typeOfGo;

    public NotFlying(String namePet, int agePet, String livingEnvironment, String typeOfGo) {
        super(namePet, agePet, livingEnvironment);
        if (typeOfGo == null || typeOfGo.isEmpty() || typeOfGo.isBlank()) {
            this.typeOfGo = "Введите правильное значение";
        } else {
            this.typeOfGo = typeOfGo;
        }
    }

    public void fly() {
        System.out.println("Летающая птица в полете");
    }
    @Override
    public void eat() {
        System.out.println("Летающая птица ест");
    }

    @Override
    public void go() {
        System.out.println("Летающая птица передвигается");
    }

    public String getTypeOfGo() {
        return typeOfGo;
    }

    @Override
    public String toString() {
        return  "Летающая птица - " + getNamePet() + " ,возраст - " + getAgePet() +
                " ,среда обитания - " + getLivingEnvironment() + " , тип передвижения - " + typeOfGo +
                " .";
    }
}

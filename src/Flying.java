public class Flying extends Birds {
    private String typeOfGo;

    public Flying(String namePet, int agePet, String livingEnvironment, String typeOfGo) {
        super(namePet, agePet, livingEnvironment);
        if (typeOfGo == null || typeOfGo.isEmpty() || typeOfGo.isBlank()) {
            this.typeOfGo = "Введите правильное значение";
        } else {
            this.typeOfGo = typeOfGo;
        }
    }

    public void walk() {
        System.out.println("Нелетающая птица гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица ест");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица передвигается");
    }

    public String getTypeOfGo() {
        return typeOfGo;
    }

    @Override
    public String toString() {
        return  " Нелетающая птица - " + getNamePet() + " ,возраст - " + getAgePet() +
                " ,среда обитания - " + getLivingEnvironment() + " , тип передвижения - " + typeOfGo +
                " .";
    }
}

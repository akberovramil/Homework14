public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "дизель");
        System.out.println(hyundai);
        hyundai.refill();
        Train last = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500, "Белорусский вокзал", "Минск-Пассажирский", 11, "дизель");
        Train lenin = new Train("Ленинград", " D-125", 2019, "Россия", null, 270, 1700, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, "к");
       last.showTrains();
       lenin.showTrains();
       last.refill();
        Bus bus1 = new Bus("ПАЗ", "П-1", 2015, "Россия", "белый", 100, "к");
        Bus bus2 = new Bus("Икарус", "И-1", 1995, "Румыния", "белый", 100, "дизель");
        Bus bus3 = new Bus("Дракон", "Д-1", 2005, "Китай", "красный", 100, "бензин");
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus2);
        System.out.println("Домашнее задание 2");
        bus1.refill();
        bus2.refill();
        bus3.refill();
        System.out.println("Домашнее задание 3");
        Herbivores gazelle = new Herbivores("Маша", 12, "степь", 12.0, "трава");
        Herbivores giraffe = new Herbivores("Карлик", 23, "тропики", 2.9, "листья");
        Herbivores horse = new Herbivores("Медляк", 4, "степь", 17.0, "трава");
        Predators hyena = new Predators("Добряк", 2, "пустыня", 9.0, "мясо");
        Predators tiger = new Predators("Волжский", 8, "джунгли", 8.0, "мясо");
        Predators bear = new Predators("Малыш", 9, "лес", 2.0, "мясо, мед");
        Amphibians frog = new Amphibians("Царевна", 2, "болото");
        Amphibians grass = new Amphibians("Короткий", 1, "болото");
        NotFlying peacock = new NotFlying("Ловкач", 4, "джунгли", "ходьба");
        NotFlying penguin = new NotFlying("Пальма", 7, "тундра", "ходьба");
        NotFlying dodo = new NotFlying("Пицца", 5, "джунгли", "ходьба");
        Flying gull = new Flying("Морж", 1, "водоемы", "полет");
        Flying albatross = new Flying("Насос", 1, "пустыня", "полет");
        Flying falcon = new Flying("Илон", 8, "степь", "полет");
        System.out.println(gazelle.toString());
        System.out.println(gazelle.equals(giraffe));


    }
}

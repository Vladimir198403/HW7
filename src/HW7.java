public class HW7 {
    public static void main(String[] args) {
        Cat [] cats = {
                new Cat("Белка", 5),
                new Cat("Стрелка", 4),
                new Cat("Кузя", 7),
        };

        Plate plate = new Plate(15);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);

        plate.AddFood(7);
        System.out.println("Добавлено еды в количестве " + plate);
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);

    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("   Информация   ");
        System.out.println(plate);
        printInfo(cats);
        System.out.println("-----");
        System.out.println();
    }

    public static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Кот '%s' поел? Ответ: %s%n", cat.getName(), cat.eat(plate));
        }
        System.out.println();
    }

    private static void printInfo(Cat... cats) {
        for (Cat cat : cats) {
            System.out.printf("Кот '%s(appetite: %d)' голоден? Ответ: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isSatiety());
        }
    }
}

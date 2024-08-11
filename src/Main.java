public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собак " + dog);
        System.out.println("Кошек " + cat);
        System.out.println("Бумаги " + paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println("Собак " + dog);
        System.out.println("Кошек " + cat);
        System.out.println("Бумаги " + paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Собак " + dog);
        System.out.println("Кошек " + cat);
        System.out.println("Бумаги " + paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров равен " + totalWeight +" кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров равна " + weightDifference +" кг");

        System.out.println("Задание 7");
        var applesWeight = 9;
        var pearsWeight = 14;
        var fruitWeightDifference = pearsWeight % applesWeight;
        System.out.println("Разница в весе фруктов " + fruitWeightDifference +" кг");

        System.out.println("Задание 8");
        var totalWorkingtime = 640;
        var personWorkingtime = 8;
        var totalPersons = totalWorkingtime/personWorkingtime;
        System.out.println("Всего работников в компании — " + totalPersons + " человек.");

        totalPersons = totalPersons + 94;
        personWorkingtime = totalWorkingtime/totalPersons;
        System.out.println("Если в компании работает " + totalPersons + " человек, то всего " + personWorkingtime + " часов работы может быть поделено между сотрудниками.");

    }
}
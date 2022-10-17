public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3

        System.out.println("Задача 3");
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var allWeightboxer = firstBoxer + secondBoxer;
        System.out.println( "общий вес " + allWeightboxer + " кг");

        //Задача 7
        System.out.println("Задача 7");
        var differenceBoxer = secondBoxer - firstBoxer;
        System.out.println("разница в весе " + differenceBoxer + " кг" );
        var differenceBoxers = secondBoxer % firstBoxer;
        System.out.println("разница в весе " + differenceBoxers + " кг");

        //Задача 8
        System.out.println("Задача 8");
        var allHours = 640;
        var employeeWorking = 8;
        var employees = allHours / employeeWorking;
        System.out.println("сотрудников в компании " + employees + " человек");
        var allWorkers = employees + 94;
        var allTime = allWorkers * employeeWorking;
        System.out.println("Всего работников " + allWorkers);
        System.out.println("Если в компании работает " + allWorkers + " человек, то всего " + allTime + " часа работы может быть поделено");
    }
}
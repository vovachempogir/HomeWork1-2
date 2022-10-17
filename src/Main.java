public class Main {
    public static void main(String[] args) {
        System.out.println();
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);

        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);

        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println(dog);
        dog = dog - 3;
        System.out.println(dog);

        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);


        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var allWeightboxer = firstBoxer + secondBoxer;
        System.out.println( "общий вес " + allWeightboxer + " кг");


        var differenceBoxer = secondBoxer - firstBoxer;
        System.out.println("разница в весе " + differenceBoxer + " кг" );

        var differenceBoxers = secondBoxer % firstBoxer;
        System.out.println("разница в весе " + differenceBoxers + " кг");

        var allHours = 640;
        var employeeWorking = 8;
        var employees = allHours / employeeWorking;
        System.out.println("сотрудников в компании " + employees + " человек");

        var allWorkers = employees + 94;
        System.out.println("Всего работников " + allWorkers);

        var allTime = allHours / allWorkers;
        System.out.println(allTime);
        System.out.println("Если в компании работает " + allWorkers + " человек, то всего " + allTime + " часов работы может быть поделено");
    }
}
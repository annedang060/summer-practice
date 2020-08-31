

public class Main {
    public static void main(String[] args){

        //practice problems


        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );



        //problem #1

        int bees = 113;
        double favNum = 2.71828;
        String futureCareer = "computer science";

        System.out.println("the number of bees at this bee farm is " + bees);
        System.out.println("my favourite number is " + favNum);
        System.out.println("my dream career is in the field of " + futureCareer);


        //problem #2

        System.out.println("+--------------------------------------------------+");
        String course1 = "Math";
        String course2 = "physics";
        String course3 = "pe";
        String course4 = "programming";

        String teacher1 = "Mr. Tam";
        String teacher2 = "Mr. Jung";
        String teacher3 = "Mrs. Waller";
        String teacher4 = "Mr. Zaremba";

        System.out.println("|                      " + course1 + "        |" + "    " + teacher1 + "    |");
        System.out.println("|                      " + course2 + "     |" + "    " + teacher2 + "   |");
        System.out.println("|                      " + course3 + "          |" + "    " + teacher3 + "|");
        System.out.println("|                      " + course4 + " |" + "    " + teacher4 + "|");

        System.out.println("+--------------------------------------------------+");

    }
}

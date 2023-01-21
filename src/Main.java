import dao.TransportDao;
import dao.TransportDaoImpl;
import enitity.Car;
import enitity.Train;
import enitity.Transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximumNumberOfPassengers;
        TransportDao transportDao = new TransportDaoImpl();
        String ride;
        String carBrand;

        System.out.println("Hello! \n Let's create a train \n What is maximum number of passengers in train?");
        maximumNumberOfPassengers = scanner.nextInt();
        Transport train  = new Train(maximumNumberOfPassengers);
        //here adding to db
        transportDao.addTransport(train);
        System.out.println("Train was successfully created! \n Do you want to ride train?(Yes/No)");
        ride = scanner.next();
        if (ride.equals("Yes")) {
            train.doRide();
        }
        System.out.println("Let's create a car \n What is maximum number of passengers in car?");
        maximumNumberOfPassengers = scanner.nextInt();
        System.out.println("What is brand of car?");
        carBrand = scanner.nextLine();
        Transport car = new Car(maximumNumberOfPassengers, carBrand);
        transportDao.addTransport(car);
        System.out.println("Car was successfully created! \n Do you want to ride car?(Yes/No)");
        ride = scanner.next();
        if (ride.equals("Yes")) {
            car.doRide();
        }

        System.out.println("Thank you for your participation!");
    }
}
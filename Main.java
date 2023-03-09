import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Bicycle bike = new Bicycle();
            Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to drive a car or bike?");
        String whichVehicle = scanner.next();

        if (whichVehicle.equals("car"))
            do{
        System.out.println("Do you wanna brake or speed on your car?");
        String input = scanner.next();
        if (input.equals("brake")){
            car.brake();
        } else {
            car.accelerate(5);
        }} while (car.velocity < 350 && car.velocity > 0);
        else  do{
            System.out.println("Do you wanna brake or speed on your bike?");
            String input = scanner.next();
            if (input.equals("brake")){
                bike.brake();
            } else {
                bike.accelerate(5);
            }} while (bike.velocity < 35 && bike.velocity > 0);










    }
}

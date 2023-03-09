import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Bicycle bike = new Bicycle();
            Car car = new Car();
        Scanner scanner = new Scanner(System.in);


        do{
        System.out.println("Do you wanna brake or speed?");
        String input = scanner.next();
        if (input.equals("brake")){
            bike.brake();
        } else {
            bike.accelerate(5);
        }} while (bike.velocity < 35 && bike.velocity > 0);










    }
}

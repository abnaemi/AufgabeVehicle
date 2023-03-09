public class Car extends Vehicle {
    @Override
    public int accelerate(int kmh) {
        velocity += kmh;
        System.out.println("Speed is" + velocity);
        return  velocity;
    }



}

public class Bicycle extends Vehicle {


    @Override
    public int accelerate(int kmh) {
        if (velocity+kmh > 35) throw new IllegalStateException("Limit reached");
        else
        velocity += kmh;
        System.out.println("Speed is" + velocity);
        return  velocity;
    } }




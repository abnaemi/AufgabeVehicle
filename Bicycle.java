public class Bicycle extends Vehicle {


    public void brake(){
        this.velocity = 0;
        System.out.println("Car stopped");
    }
    @Override
    public int accelerate(int kmh) {
        if (velocity+kmh > 35) throw new IllegalStateException("Limit reached");
        else
        velocity += kmh;
        System.out.println("Speed is" + velocity);
        return  velocity;
    } }




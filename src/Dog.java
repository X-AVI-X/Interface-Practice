public class Dog extends Animal implements IFoodConsumptionProcess{

    private byte tailLength;
    public Dog(short age, String name, byte tailLength) {
        super("Dog", age, name);
        this.tailLength=tailLength;
    }

    @Override
    public void run() {
        System.out.println("Dog is running with 4 legs...");
    }

    @Override
    public void eat() {
        System.out.println("Dog: "+ name +" is eating...");
    }

    @Override
    public void drink() {
        System.out.println("Dog: "+ name +" is consuming liquid...");
    }

    @Override
    public String toString() {
        return "Dog {" +
                "TailLength= " + tailLength + "cm"+
                 super.toString();
    }
}

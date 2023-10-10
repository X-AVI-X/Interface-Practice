public abstract class Animal extends Life{
    private short age;
    String name;

    public Animal(String className, short age, String name){
        super(className);
        this.age=age;
        this.name=name;
    }

    public void walk (){
        System.out.println("An animal is walking...");
    }

    public abstract void run ();

    @Override
    public String toString() {
        return " Category: Animal{" +
                "Age=" + age + " years"+
                ", Name='" + name + '\'' +
                '}';
    }
}

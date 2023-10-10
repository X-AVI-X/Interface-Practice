public class LifeApplication {
    public static void main (String[] args){

        Human human1 = new Human((short) 18, "Senorita", "French");
        Dog dog1 = new Dog((short)2, "Max", (byte) 4);
        human1.setPet(dog1);

        IFoodConsumptionProcess food = human1;
        System.out.println(food);
        food.eat();
        food.drink();
        food.digest();

        ICareer humanCareer = human1;

        humanCareer.educate("Math", "CS", "Quantum Theory", "AI", "Space-Time", "English");
        humanCareer.getRetiredWithPension(500000);

        human1.walk();
        human1.endLife();
        dog1.run();
        dog1.endLife();
    }
}

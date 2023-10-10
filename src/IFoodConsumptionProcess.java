public interface IFoodConsumptionProcess {
    default void digest (){
        System.out.println("Food is digesting by biological system...");
    }
    void eat();
    void drink();
}

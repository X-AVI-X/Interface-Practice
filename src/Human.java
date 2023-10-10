import java.util.Arrays;
import java.util.List;

public class Human extends Animal implements IFoodConsumptionProcess, ICareer{

    private String language;
    private Animal pet;
    public Human(short age, String name, String language){
        super("Human", age, name);
        this.language=language;
    }
    @Override
    public void run() {
        System.out.println("Human is running with 2 legs...");
    }

    @Override
    public void eat() {
        System.out.println("Human: "+ name +" is eating...");
    }

    @Override
    public void drink() {
        System.out.println("Human: "+ name +" is drinking...");
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Human = {" +
                "Language= '" + language + '\'' +
                super.toString()+
                ", Pet= " + pet+
                '}';
    }

    @Override
    public void educate(String... subjects) {
        System.out.println(name+ " got educated with subjects: "+ Arrays.toString(subjects));
    }

    @Override
    public void doJob(String jobName) {
        System.out.println(name + "doing job: "+jobName);
    }

    @Override
    public void getRetiredWithPension(int pensionSalary) {
        System.out.println(name + " got retired with "+ pensionSalary+" EUROs");
    }
}

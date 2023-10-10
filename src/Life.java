public abstract class Life {

    private String lifeType;
    public Life(String className){
        activateLife(className);
        lifeType=className;
    }

    public void activateLife(String className){
        System.out.println(className+" life activated...");
    }

    public void endLife(){
        System.out.println(lifeType+ " life ended...");
    }
}

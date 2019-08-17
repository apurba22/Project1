package day5abstractionFahim;

public interface Phone {
    public void call();
    public void text(String message);

    default void doesSomething(){
        System.out.println("Hellow World");
    }

}

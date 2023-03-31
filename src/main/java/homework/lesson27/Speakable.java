package homework.lesson27;

public interface Speakable {
    
    default void speak() {
        System.out.println("Somebody Speaks");
    }

}

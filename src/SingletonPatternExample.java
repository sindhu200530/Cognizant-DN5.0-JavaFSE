public class SingletonPatternExample {

    // Single instance
    private static SingletonPatternExample instance;

    // Private constructor
    private SingletonPatternExample() {}

    // Global access point
    public static SingletonPatternExample getInstance() {
        if (instance == null) {
            instance = new SingletonPatternExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method to test
    public static void main(String[] args) {
        SingletonPatternExample obj1 = SingletonPatternExample.getInstance();
        SingletonPatternExample obj2 = SingletonPatternExample.getInstance();

        obj1.showMessage();

        // Both should be same instance
        System.out.println(obj1 == obj2); // prints true
    }
}
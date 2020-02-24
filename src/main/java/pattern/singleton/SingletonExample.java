package pattern.singleton;

public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample() {
    }

    static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }
}

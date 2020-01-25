package singleton;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;
    private int value;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance(){
        if (singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

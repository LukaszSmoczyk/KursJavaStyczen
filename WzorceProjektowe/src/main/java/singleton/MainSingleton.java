package singleton;

public class MainSingleton {

    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.setValue(101);
        System.out.println(singletonLazy);

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        singletonLazy1.setValue(98);
        System.out.println(singletonLazy1);

        System.out.println(singletonLazy.getValue());
        System.out.println(singletonLazy1.getValue());

        ///////////////////////////////////////////
        // ENUM

        SingletonEnum singletonEnum = SingletonEnum.SINGLETON_ENUM;
        singletonEnum.setValue(202);

        SingletonEnum singletonEnum1 = SingletonEnum.SINGLETON_ENUM;
        singletonEnum1.setValue(101010);

        System.out.println(singletonEnum.getValue());
        System.out.println(singletonEnum1.getValue());
    }
}

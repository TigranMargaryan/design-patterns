package singleton.simplesingleton;

public class SingletonClass {

    private SingletonClass(){};

    private static SingletonClass instance = new SingletonClass();

    public static SingletonClass getInstance(){
        return instance;
    }

}

package design_pattern;

public class SinglePattern {
    private final static SinglePattern instance = new SinglePattern();

    private SinglePattern() {
    }

    public static SinglePattern getInstance(){
        return instance;
    }

/*
    // 声明变量
    private static volatile Singleton singleton = null;

    // 私有构造函数
    private Singleton() {
    }

    // 提供对外方法
    public static Singleton getInstance() {
    if (singleton == null) {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
 */
}

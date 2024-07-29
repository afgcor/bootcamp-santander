package dio.gof.singleton;

/* Singleton "Apressado"
@author: Anna */

public class SingletonEager {
    private static SingletonEager instancia;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}

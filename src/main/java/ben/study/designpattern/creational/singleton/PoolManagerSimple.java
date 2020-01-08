package ben.study.designpattern.creational.singleton;

/*
    This is a Lazily instantiated singleton : create instance at the first time that it is used.
 */
public class PoolManagerSimple
{
    private static PoolManagerSimple instance;

    private PoolManagerSimple(){
    }

    public static synchronized PoolManagerSimple getInstance(){
        if (instance == null){
            instance = new PoolManagerSimple();
        }
        return instance;
    }
}

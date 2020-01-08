package ben.study.designpattern.creational.singleton.jee;

import javax.inject.Inject;

public class UsePoolManager {
    @Inject
    private PoolManager poolManager;

    public void userPoolObject(){
        Object obj = poolManager.borrowObject();
        // TODO: use it

        poolManager.returnObject(obj);
    }
}

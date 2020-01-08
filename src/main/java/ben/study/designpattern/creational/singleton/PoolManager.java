package ben.study.designpattern.creational.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

@Startup   // init when app start up
@Singleton
public class PoolManager {
    private Queue<Object> pooledObject;

    @PostConstruct
    // This method will be evoked after the successful construction of the singleton bean
    void constructExpensiveObjects() {
        pooledObject = new LinkedBlockingDeque<>(1000);
        for (int i = 0; i < 1000; i++) {
            pooledObject.offer(new Object());
        }
    }

    public void returnObject(Object obj) {
        pooledObject.offer(obj);
    }

    public Object borrowObject() {
        return pooledObject.poll();
    }
}
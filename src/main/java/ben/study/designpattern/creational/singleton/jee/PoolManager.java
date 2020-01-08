package ben.study.designpattern.creational.singleton.jee;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

@Startup   // init when app start up
@Singleton
@DependsOn("Configuration")
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
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

    @AccessTimeout(value=30, unit= TimeUnit.SECONDS)
    @Lock(LockType.WRITE)
    public void returnObject(Object obj) {
        pooledObject.offer(obj);
    }


    @Lock(LockType.READ)
    public Object borrowObject() {
        return pooledObject.poll();
    }
}
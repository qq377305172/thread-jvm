package jing.chao.thread;

import lombok.RequiredArgsConstructor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author cj
 * @date 2020/4/14 17:51
 */
@RequiredArgsConstructor(staticName = "blockingQueue")
class MyResource {
    private volatile boolean flag = true;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private BlockingQueue<String> blockingQueue = null;

    public void myProd() throws InterruptedException {
        String data = null;
        boolean retValue;
        while (flag) {
            data = atomicInteger.incrementAndGet() + "";
            retValue = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
            if(retValue){

            }
        }
    }
}

public class ProdConsumerBlockQueueDemo {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);
        blockingQueue.poll();
    }
}

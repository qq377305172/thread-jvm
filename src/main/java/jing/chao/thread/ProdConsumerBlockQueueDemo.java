package jing.chao.thread;

import lombok.RequiredArgsConstructor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
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

}

public class ProdConsumerBlockQueueDemo {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);
        blockingQueue.poll();
    }
}

package pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainPoint {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(2);
        //ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Point point = new Point(0, 0);

        Collection<Future<?>> results = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            Future<?> result = executorService.submit(new PointMoverTask(point));
            results.add(result);
        }
        try {
            for (Future<?> result : results) {
                result.get();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);
    }
}


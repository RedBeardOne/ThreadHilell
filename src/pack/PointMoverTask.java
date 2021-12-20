package pack;

public class PointMoverTask implements Runnable {
    final private Point point;

    public PointMoverTask(Point point) {
        this.point = point;
    }

    @Override
    public void run() {
        point.move(1, 1);
    }
}

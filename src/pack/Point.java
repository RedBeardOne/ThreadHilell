package pack;

public class Point {
    private final Object lock = new Object();
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void moveWithLock(int dx, int dy) {
        synchronized (lock) {
            x += dx;
            y += dy;
        }
    }

    public void moveWithLockObject(Point point, int dx, int dy) {
        synchronized (lock) {
            point.x += dx;
            point.y += dy;
        }
    }

    public synchronized void moveWithSyncMethod(Point point, int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static synchronized void moveWithSyncStaticMethod(Point point, int dx, int dy) {
        point.x += dx;
        point.y += dy;
    }
}

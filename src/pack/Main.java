package pack;

public class Main {
    public static void main(String[] args) {
        FibonachiImplement implement = new FibonachiImplement();
        Thread thread = new Thread(implement);
        thread.start();

        try {
            thread.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main finished");

//        FibonachiExtends extended = new FibonachiExtends();
//        extended.start();
    }
}

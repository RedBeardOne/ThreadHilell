package pack;

import java.math.BigDecimal;

public class FibonachiExtends extends Thread{
    private BigDecimal previous;
    private BigDecimal current;

    @Override
    public void run() {
        BigDecimal previous = new BigDecimal("0");
        BigDecimal current = new BigDecimal("1");
        BigDecimal fibon = previous;
        setPrevious(previous);
        setCurrent(current);
        for (int i = 0; i < 100; i++) {
            fibon = previous.add(current);
            System.out.println("Fibonachi = " + fibon);
            previous = current;
            current = fibon;
        }
    }

    public void setPrevious(BigDecimal previous) {
        this.previous = previous;
    }

    public void setCurrent(BigDecimal current) {
        this.current = current;
    }
}
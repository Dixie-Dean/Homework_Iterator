import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int value;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
        value = setRandomValue(min, max);
    }

    protected int setRandomValue(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(this);
    }
}

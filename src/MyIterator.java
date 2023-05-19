import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
    private final Randoms randoms;

    public MyIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randoms.value = randoms.setRandomValue(randoms.min, randoms.max);
    }
}

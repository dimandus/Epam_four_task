public class FilterMore100 implements Predicat {
    @Override
    public boolean verify(int item) {
        return item > 100;
    }
}

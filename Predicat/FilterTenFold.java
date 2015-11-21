public class FilterTenFold implements Predicat {
    @Override
    public boolean verify(int item) {
        return (item % 10) == 0;
    }
}

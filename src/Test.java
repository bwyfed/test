public class Test {
    private int count;
    private String name;
    Test(int c, String n) {
        count = c;
        name = n;
    }
    Test() {
        count = 0;
        name = "Test name";
    }
    @Override
    public String toString() {
        return String.format("Test info: count=%d, name=%s", count, name);
    }
}

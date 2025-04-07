class TestThread {

    public static void main(String[] args) {
        new PrintNameThread("A");
        new PrintNameThread("B");
        new PrintNameThread("C");
        new PrintNameThread("D");
    }
}
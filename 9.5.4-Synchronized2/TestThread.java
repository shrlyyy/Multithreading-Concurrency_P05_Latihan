class TestThread {

    public static void main(String[] args) {
        
        TwoStrings ts = new TwoStrings();
        new PrintStringThread("Hello ", "there!", ts);
        new PrintStringThread("How are  ", "you?", ts);
        new PrintStringThread("Thank you ", "very much!", ts);
    } 
}
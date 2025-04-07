class TestThread {

    public static void main(String[] args) {
        
        new PrintStringThread("Hello ", "there!");
        new PrintStringThread("How are  ", "you?");
        new PrintStringThread("Thank you ", "very much!");
    } 
}

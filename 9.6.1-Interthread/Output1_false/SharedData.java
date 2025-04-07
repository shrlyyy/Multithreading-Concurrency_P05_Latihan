class SharedData {

    int data;

    synchronized void set(int value) {
        System.out.println("Generate " + value);
        data = value;
    }

    synchronized int get() {
        System.out.println("Get " + data);
        return data;
    }
}
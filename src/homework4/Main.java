package homework4;

public class Main {

    final Object monitor = new Object();
    volatile char currentLetter = 'A';///

    public static void main(String[] args) {

        Main hw = new Main();
        new Thread(() -> hw.printLetter('A', 'B', 5)).start();
        new Thread(() -> hw.printLetter('B', 'C', 5)).start();
        new Thread(() -> hw.printLetter('C', 'A', 5)).start();
    }
    void printLetter(char mainLetter, char nextLetter, int times) {
        synchronized (monitor) {
            try {
                for (int i = 0; i < times; i++) {
                    while (currentLetter != mainLetter)
                        monitor.wait();
                    System.out.print(mainLetter);
                    currentLetter = nextLetter;
                    monitor.notifyAll();
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

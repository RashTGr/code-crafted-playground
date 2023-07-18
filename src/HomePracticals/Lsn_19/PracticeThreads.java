package HomePracticals.Lsn_19;

public class PracticeThreads {

    public static void main(String[] args) {

        OddEvenNumbers generator = new OddEvenNumbers(1, 100);

        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                generator.oddNumbers();
            }
        });

        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                generator.evenNumbers();
            }
        });

        odd.start();
        even.start();
    }
}

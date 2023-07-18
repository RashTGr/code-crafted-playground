package HomePracticals.Lsn_19;

class OddEvenNumbers {
    private final int min;
    private final int max;

    // Constructor
    public OddEvenNumbers(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public synchronized void oddNumbers() {
        for (int i = min; i <= max; i++) {
            if ((i % 2) != 0) {
                System.out.println("Odd: " + i);
                notify(); // this is to notify other thread in waiting
                try {
                    if (i < max) {
                        wait(); // to wait for other thread to complete print process
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void evenNumbers() {
        for (int i = min; i <= max; i++) {
            if ((i % 2) == 0) {
                System.out.println("Even: " + i);
                notify(); // this is to notify the above thread in waiting
                try {
                    if (i < max) {
                        wait(); //to wait for the above thread to complete print process
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

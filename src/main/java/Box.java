public class Box {
    volatile boolean ToggleSwitch;
    int onetic = 700;
    int clicks = 5;
    long[] sleep = new long[]{1000, 2000, 3000};

    public void tictac() {
        try {
            while (true) {
                Thread.sleep(onetic);
                System.out.println("             tic |");
                Thread.sleep(onetic);
                System.out.println("                 | tac");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicking() {
        try {
            for (int i = 0; i < clicks; i++) {
                int n = (int) Math.floor(Math.random() * sleep.length);
                Thread.sleep(sleep[n]);
                System.out.println("///+++///    ВКЛЮЧЕНО    ///+++///");
                ToggleSwitch = true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void trinket() {
        while (true) {
            if (ToggleSwitch) {
                System.out.println("///+++///    ВЫКЛЮЧЕНО   ///+++///");
                ToggleSwitch = false;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("\n/// Самая бесполезная коробка ///\n" +
                "//////// Начала работать ////////\n");

        Thread clicking = new Thread(null, box::clicking, "Палец");
        Thread trinket = new Thread(null, box::trinket, "Кнопка");
        Thread tictac = new Thread(null, box::tictac, "Часы на заднем плане"); //для наглядности

        tictac.start();
        trinket.start();
        clicking.start();
        try {
            clicking.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tictac.interrupt();
        trinket.interrupt();
        System.out.println("\n           /// Конец ///");
    }
}
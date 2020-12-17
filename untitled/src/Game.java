import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Player 1", 3);
        protected Gamer gamer2 = new Gamer("Player 2", 1);
        protected Gamer gamer3 = new Gamer("Player 3", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Здесь может и должен быть ваш код
            try
            { 
                int i;
                int size = OnlineGame.steps.size();
                while (!OnlineGame.isWinnerFound)
                {
                    for (i = 0; i < OnlineGame.steps.size(); i++)
                    {
                        System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                        Thread.sleep(1000/rating);
                    }

                    if (i == size)
                    {
                        System.out.println(getName() + ":победитель!");
                        OnlineGame.isWinnerFound = true;
                    }

                }
            }catch (InterruptedException e)
            {
                System.out.println(getName() + ":проиграл");
            }

        }
    }
}
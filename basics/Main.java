import java.util.Random;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // check pluralize
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        // check flipNHeads
        flipNHeads(0);
        flipNHeads(3);

        // test clock
        clock();
    }

    public static String pluralize(String word, int count) {
        // return with an s added if number isn't 1
        if (!(count == 1)) {
            return word + 's';
        }
        return word;
    }

    public static void flipNHeads(int n) {
        // get random int
        Random rand = new Random();
        int flips = 0;
        int tailCount = 0;
        while (n > tailCount) {
            if (rand.nextFloat() < .5) {
                System.out.println("tails");
                tailCount++;
            } else {
                System.out.println("heads");
                tailCount = 0;
            }
            flips++;
        }
        String flipsStr = String.valueOf(flips);
        System.out.println("It took " + flipsStr + " flips to flip " + String.valueOf(n) + " heads in a row.");
    }

    public static void clock() {
        while (true) {
            // console log the current time
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // check pluralize
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    }

    public static String pluralize (String word, int count) {
            if (!(count == 1)) {
                return word + 's';    
            }
            return word;
        }
  }
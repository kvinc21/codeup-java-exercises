import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"Charming", "Cruel", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Tasty", "Zealous"};
    public static String[] nouns = {"bed", "cat", "movie", "train", "country", "book", "phone", "match", "speaker", "clock", "pen", "David", "violin"};

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n ");
                System.out.println(getWord(adjectives) + " " + getWord(nouns));
    }

    public static String getWord(String[] choices){
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }
}

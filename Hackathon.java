//creators : Rhea Seeralan, Ayushi Dalal, Ashviqha Parida

import java.util.HashMap;
import java.util.Scanner;

public class Hackathon {
    public static void main(String[] args) {
        
        
        System.out.println("\n\nWelcome to the WRONG Translator!(DEVIOUS MODE) 😈");
        boolean keepGoing = true;

        
        HashMap<String, String> Chinese = new HashMap<>();
        HashMap<String, String> Hindi = new HashMap<>();
        HashMap<String, String> Spanish = new HashMap<>();
        HashMap<String, String> French = new HashMap<>();
        HashMap<String, String> Emoji = new HashMap<>();

        
        String[] Englishbet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] Chinesebet = {"一個", "乙", "C", "D", "乙", "的", "不", "了", "我", "在", "他", "这", "为", "之", "来", "个", "中", "上", "之", "这", "在", "人", "不", "一", "来", "这"};
        String[] Hindibet = {"अ", "ब", "क", "द", "ई", "फ", "ग", "ह", "इ", "ज", "क", "ल", "म", "न", "ओ", "प", "क", "र", "स", "त", "उ", "व", "व", "क्स", "य", "ज"};
        String[] Spanishbet = {"a", "be", "ce", "de", "e", "efe", "ge", "hache", "i", "jota", "ka", "ele", "eme", "ene", "o", "pe", "cu", "erre", "ese", "te", "u", "uve", "doble ve", "equis", "ye", "zeta"};
        String[] Frenchbet = {"a", "bé", "cé", "dé", "é", "effe", "gé", "ache", "i", "ji", "ka", "elle", "emme", "enne", "o", "pé", "ku", "erre", "esse", "té", "u", "vé", "double vé", "iks", "i grec", "zède"};
        String[] Emojibet = {"🚑", "🏝️", "🧉","😉","😇", "💀","💡","😱","🥳", "🍓", "🥶", "🥼", "🍁", "🌸", "🚣", "📝", "🌛", "🦝", "🦁", "🐈", "🍜", "😶", "🧇", "💉", "🍠", "🐖"};
        
        
        for (int i = 0; i < Englishbet.length; i++) {
            Chinese.put(Englishbet[i], Chinesebet[i]);
        }

        
        for (int i = 0; i < Englishbet.length; i++) {
            Hindi.put(Englishbet[i], Hindibet[i]);
            Spanish.put(Englishbet[i], Spanishbet[i]);
            French.put(Englishbet[i], Frenchbet[i]);
            Emoji.put(Englishbet[i], Emojibet[i]);
        }

        while(keepGoing) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n\nEnter the language (Chinese, Hindi, Spanish, French, Emoji): ");
            String language = scanner.nextLine().trim().toLowerCase();

            System.out.print("\nEnter the string to translate: ");
            String input = scanner.nextLine().toLowerCase(); 

            
            HashMap<String, String> selectedLanguage = null;
            switch (language) {
                case "chinese":
                    selectedLanguage = Hindi;
                    break;
                case "hindi":
                    selectedLanguage = French;
                    break;
                case "spanish":
                    selectedLanguage = Emoji;
                    break;
                case "french":
                    selectedLanguage = Spanish;
                    break;
                case "emoji":
                    selectedLanguage = Chinese;
                    break;
                default:
                    System.out.println("Invalid language selected.");
                    System.out.print("\nEnter the language (Chinese, Hindi, Spanish, French, Emoji): ");
                    language = scanner.nextLine().trim().toLowerCase();
                    return;
            }
            
            StringBuilder translatedString = new StringBuilder();
            for (char c : input.toCharArray()) {
                String key = String.valueOf(c);
                translatedString.append(selectedLanguage.getOrDefault(key, key)).append(" ");
            }
            
            System.out.println("\nTranslated string: " + translatedString.toString().trim());
            
            System.out.println("\nDo you want to keep going?: ");
            String cont = scanner.nextLine().trim().toLowerCase();

            if(cont.equals("Yes") || cont.equals("yes")) {
                keepGoing = false;
            }

            if(!keepGoing) {
                System.out.print("\nI dont like you, I am done. Thank you for using our translator! 👿");
                scanner.close();
                break;
            }

            System.out.println("\nYOU HAVE NO CHOICE KEEP GOING...👿");
            
        }
    }
        
}

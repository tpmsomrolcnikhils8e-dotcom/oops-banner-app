import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // Map to store character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    // Static block to initialize patterns
    static {

        patternMap.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                "  **** ",
                " *     ",
                " *     ",
                "  ***  ",
                "     * ",
                "     * ",
                " ****  "
        });
    }

    // Render Function
    public static void renderBanner(String word) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        renderBanner("OOPS");
    }
}
public class OOPSBannerUC7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create Pattern Objects

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                "  **** ",
                " *     ",
                " *     ",
                "  ***  ",
                "     * ",
                "     * ",
                " ****  "
        });

        // Store characters for word OOPS
        CharacterPatternMap[] word = {O, O, P, S};

        // Print Banner
        for (int i = 0; i < word[0].getPattern().length; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}
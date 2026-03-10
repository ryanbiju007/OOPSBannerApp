public class OOPSBannerApp {

    static class CharacterPatternMap {
        char character;
        String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        });

        return new CharacterPatternMap[]{o, p, s};
    }

    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int line = 0; line < 7; line++) {

            StringBuilder row = new StringBuilder();

            for (char c : message.toCharArray()) {

                for (CharacterPatternMap map : maps) {
                    if (map.getCharacter() == c) {
                        row.append(map.getPattern()[line]).append(" ");
                    }
                }
            }

            System.out.println(row);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        printMessage("OOPS", maps);
    }
}
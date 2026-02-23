public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: create array for 7 lines
        String[] lines = new String[7];

        // Step 2: build each line using String.join()
        lines[0] = String.join(" ",
                "  *****  ", "  *****  ", " ******  ", "  *****  ");
        lines[1] = String.join(" ",
                " **   ** ", " **   ** ", " **   ** ", " **   ** ");
        lines[2] = String.join(" ",
                "**     **", "**     **", " **   ** ", "**       ");
        lines[3] = String.join(" ",
                "**     **", "**     **", " ******  ", "  *****  ");
        lines[4] = String.join(" ",
                "**     **", "**     **", " **      ", "       **");
        lines[5] = String.join(" ",
                " **   ** ", " **   ** ", " **      ", " **   ** ");
        lines[6] = String.join(" ",
                "  *****  ", "  *****  ", " **      ", "  *****  ");

        // Step 3: loop and print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
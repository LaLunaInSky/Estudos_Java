package strings;

public class FilenameDemo {

    public static void main(
        String... args
    ) {
        final String FPATH = "/home/user/index.html";

        Filename myHomePage = new Filename(
            FPATH,
            '/', '.'
        );

        System.out.printf(
            "%nExtension = %s" + 
            "%nFilename = %s" +
            "%nPath = %s%n%n",
            myHomePage.extension(),
            myHomePage.filename(),
            myHomePage.path()
        );
    }
}

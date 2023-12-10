import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException, SQLException {
        String pathCSV = "res\\game.csv";
        String pathSQLite = "jdbc:sqlite:res/Games.sqlite";
        Parser parser = new Parser(pathCSV);
        SQLite sqLite = new SQLite(pathSQLite);
        File file = new File("res\\Games.sqlite");
        SQLite.createTable(parser, sqLite);
        /*
        for (var a: parser.games) {
            System.out.println(a);
        }
        */
    }
}
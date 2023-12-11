import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException, SQLException {
        String pathCSV = "res\\Игры.csv";
        String pathSQLite = "jdbc:sqlite:res/Games.sqlite";
        Parser parser = new Parser(pathCSV);
        SQLite sqLite = new SQLite(pathSQLite);
        File file = new File("res\\Games.sqlite");
        if (file.length() == 0) {
            SQLite.createTable(parser, sqLite);
        }
        Tasks.firstTask();
        Tasks.secondTask();
        Tasks.thirdTask();
        SQLite.closeSQLite();
    }
}
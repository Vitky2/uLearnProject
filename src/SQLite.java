import java.sql.*;
import org.sqlite.*;

public class SQLite {
    private static Connection connection;
    protected static Statement statement;
    public SQLite(String path) throws SQLException {
        connection = DriverManager.getConnection(path);
        statement = connection.createStatement();
    }
    public static void createTable(Parser parser, SQLite sqLite) throws SQLException {
        String request = "CREATE TABLE IF NOT EXISTS Games (" +
                "rank INTEGER PRIMARY KEY, " +
                "name TEXT, platform TEXT, " +
                "year INT, genre TEXT, " +
                "publisher TEXT, NA_Sales FLOAT, " +
                "EU_Sales FLOAT, JP_Sales FLOAT, " +
                "Other_Sales FLOAT, Global_Sales FLOAT)";
        statement.execute(request);
        parser.games.forEach(sqLite::addLine);
    }

    public void addLine(Game game) {
        String request = "INSERT INTO Games (rank, name, platform, year, genre, publisher, " +
                "NA_Sales, EU_Sales, JP_Sales, Other_Sales, Global_Sales) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setObject(1, game.getRank());
            statement.setObject(2, game.getName());
            statement.setObject(3, game.getPlatform());
            statement.setObject(4, game.getYear());
            statement.setObject(5, game.getGenre());
            statement.setObject(6, game.getPublisher());
            statement.setObject(7, game.getNA_Sales());
            statement.setObject(8, game.getEU_Sales());
            statement.setObject(9, game.getJP_Sales());
            statement.setObject(10, game.getOther_Sales());
            statement.setObject(11, game.getGlobal_Sales());
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeSQLite() throws SQLException {
        connection.close();
    }
}


import java.sql.ResultSet;
import java.sql.SQLException;

public class Tasks {
    public static void secondTask() throws SQLException {
        String request = "SELECT name, EU_Sales FROM Games WHERE year = 2000 ORDER BY EU_Sales DESC LIMIT 1";
        System.out.println("2) Игра с самыми восокими продажами в Европе за 2000 год: " +
                SQLite.statement.executeQuery(request).getString("name") + "\nПродажи: " +
                SQLite.statement.executeQuery(request).getString("EU_Sales"));
    }

    public static void thirdTask() throws SQLException {
        String request = "SELECT name, JP_Sales FROM Games WHERE year BETWEEN 2000 AND 2006 AND genre = \"Sports\" ORDER BY JP_Sales DESC LIMIT 1";
        System.out.println("3) Самая продаваемая спортивная игра в Японии с 2000 по 2006: " +
                SQLite.statement.executeQuery(request).getString("name") + "\nПродажи: " +
                SQLite.statement.executeQuery(request).getString("JP_Sales"));
    }
}

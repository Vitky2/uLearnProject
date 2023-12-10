import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public List<Game> games = new ArrayList<>();
    public Parser(String path) {
        String line = "";
        try  {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (row[0].equals("Rank")) continue;
                if (row[0].equals("200")) break;
                Game game = new Game(row[0], row[1], row[2], row[3], row[4],
                        row[5], row[6], row[7], row[8], row[9], row[10]);
                games.add(game);

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}

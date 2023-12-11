import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public List<Game> games = new ArrayList<>();
    public Parser(String path) {
        String line = "";
        try  {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                //String[] row = line.split(",");
                ArrayList<String> row = new ArrayList<>(Arrays.asList(line.split(",")));
                if (row.size() > 11) {
                    for (int i = 0; i < row.size(); i++) {
                        if (row.get(i).contains("\"")) {
                            while (countK(row.get(i)) != 2) {
                                row.set(i, row.get(i) + row.get(i + 1));
                                row.remove(i + 1);
                            }
                        }
                    }
                }
                //if (row.get(0).equals("1000")) break;
                if (row.get(0).equals("Rank")) continue;
                Game game = new Game(row.get(0), row.get(1), row.get(2), row.get(3), row.get(4),
                        row.get(5), row.get(6), row.get(7), row.get(8), row.get(9), row.get(10));
                games.add(game);

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int countK(String s) {
        return s.length() - s.replace("\"", "").length();
    }

}

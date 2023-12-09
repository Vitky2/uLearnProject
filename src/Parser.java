import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public List<Game> games = new ArrayList<>();

    public Parser(String path) {
        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] values;
            reader.readNext();
            while ((values = reader.readNext()) != null) {
                if (Integer.parseInt(values[0]) == 10) break;
                Game game = new Game(Integer.parseInt(values[0]), values[1], values[2], Integer.parseInt(values[3]),
                        values[4], values[5], Double.parseDouble(values[6]), Double.parseDouble(values[7]),
                        Double.parseDouble(values[8]), Double.parseDouble(values[9]), Double.parseDouble(values[10]));
                games.add(game);

            }
        }
        catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

}

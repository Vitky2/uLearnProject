public class Game {
    private final int rank;
    private final String name;
    private final String platform;
    private final int year;
    private final String genre;
    private final String publisher;
    private final double NA_Sales;
    private final double EU_Sales;
    private final double JP_Sales;
    private final double Other_Sales;
    private final double Global_Sales;

    public Game (String rank, String name, String platform, String year, String genre, String publisher,
                 String NA_Sales, String EU_Sales, String JP_Sales, String Other_Sales, String Global_Sales) {
        if (isNumeric(rank)) {
            this.rank = Integer.parseInt(rank);
        }
        else {
            this.rank = 0;
        }

        this.name = name;
        this.platform = platform;
        if (isNumeric(year)) {
            this.year = Integer.parseInt(year);
        } else {
            this.year = 0;
        }
        this.genre = genre;
        this.publisher = publisher;
        this.NA_Sales = Double.parseDouble(NA_Sales);
        this.EU_Sales = Double.parseDouble(EU_Sales);
        this.JP_Sales = Double.parseDouble(JP_Sales);
        this.Other_Sales = Double.parseDouble(Other_Sales);
        this.Global_Sales = Double.parseDouble(Global_Sales);
    }

    public boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  // Проверяет, содержит ли строка только цифры
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return  genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getNA_Sales() {
        return NA_Sales;
    }

    public double getEU_Sales() {
        return EU_Sales;
    }

    public double getJP_Sales() {
        return JP_Sales;
    }

    public double getOther_Sales() {
        return Other_Sales;
    }

    public double getGlobal_Sales() {
        return Global_Sales;
    }

    @Override
    public String toString() {
        return rank + " " + name + " " + platform + " " + year + " " + genre
                + " " + publisher + " " + NA_Sales + " " + EU_Sales + " " +JP_Sales
                + " " + Other_Sales + " " + Global_Sales;
    }
}

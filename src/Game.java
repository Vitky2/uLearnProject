public class Game {
    private final String rank;
    private final String name;
    private final String platform;
    private final String year;
    private final String genre;
    private final String publisher;
    private final String NA_Sales;
    private final String EU_Sales;
    private final String JP_Sales;
    private final String Other_Sales;
    private final String Global_Sales;

    public Game (String rank, String name, String platform, String year, String genre, String publisher,
                 String NA_Sales, String EU_Sales, String JP_Sales, String Other_Sales, String Global_Sales) {
        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.NA_Sales = NA_Sales;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        this.Other_Sales = Other_Sales;
        this.Global_Sales = Global_Sales;
    }

    public String getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return  genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getNA_Sales() {
        return NA_Sales;
    }

    public String getEU_Sales() {
        return EU_Sales;
    }

    public String getJP_Sales() {
        return JP_Sales;
    }

    public String getOther_Sales() {
        return Other_Sales;
    }

    public String getGlobal_Sales() {
        return Global_Sales;
    }

    @Override
    public String toString() {
        String txt = rank + " " + name + " " + platform + " " + year + " " + genre
                + " " + publisher + " " + NA_Sales + " " + EU_Sales + " " +JP_Sales
                + " " + Other_Sales + " " + Global_Sales;
        return txt;
    }
}

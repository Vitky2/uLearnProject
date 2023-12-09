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

    public Game (int rank, String name, String platform, int year, String genre, String publisher,
                 double NA_Sales, double EU_Sales, double JP_Sales, double Other_Sales, double Global_Sales) {
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
}

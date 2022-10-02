public class Player {
    private String name;
    private int numOfMatches;
    private int numOfCaps; // Times a player has played for a national Team
    private double height;
    private int numOfGoalsAssists; // Number of scored goals and assists given, whole number

    public Player(){
        name = "";
        numOfMatches = 0;
        numOfCaps = 0;
        height = 0;
        numOfGoalsAssists = 0;
    }

    public Player(String name, int numOfMatches){
        this.name = name;
        this.numOfMatches = numOfMatches;
    }

    public Player(String name, int numOfMatches, int numOfCaps){
        this.name = name;
        this.numOfMatches = numOfMatches;
        this.numOfCaps = numOfCaps;
    }

    public Player(String name, int numOfMatches, int numOfCaps, double height, int numOfGoalsAssists){
        this.name = name;
        this.numOfMatches = numOfMatches;
        this.numOfCaps = numOfCaps;
        this.height = height;
        this.numOfGoalsAssists = numOfGoalsAssists;
    }

    public void getPlayerData(){
        System.out.println("Player's name: " + name + "\nNumber of Matches: " + numOfMatches +
                "\nNumber of International Caps: " + numOfCaps + "\nHeight: " + height +
                "\nNumber of Scored Goals and Assists Given: " + numOfGoalsAssists);
    }

    public void getGoalsAssistsPerMatch(){

        double goalsAssistsPerMatch = numOfGoalsAssists/numOfMatches;
        System.out.println(name + "'s Goals and Assists per Match: " + goalsAssistsPerMatch);
    }

    public String getName() {
        return name;
    }

    public int getNumOfMatches() {
        return numOfMatches;
    }

    public int getNumOfCaps() {
        return numOfCaps;
    }

    public double getHeight() {
        return height;
    }

    public int getNumOfGoalsAssists() {
        return numOfGoalsAssists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfMatches(int numOfMatches) {
        this.numOfMatches = numOfMatches;
    }

    public void setNumOfCaps(int numOfCaps) {
        this.numOfCaps = numOfCaps;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setNumOfGoalsAssists(int numOfGoalsAssists) {
        this.numOfGoalsAssists = numOfGoalsAssists;
    }

    public void setAll(String name, int numOfMatches, int numOfCaps, double height, int numOfGoalsAssists){
        this.name = name;
        this.numOfMatches = numOfMatches;
        this.numOfCaps = numOfCaps;
        this.height = height;
        this.numOfGoalsAssists = numOfGoalsAssists;
    }
}

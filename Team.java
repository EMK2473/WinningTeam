public class Team {
    // TODO: Declare private fields - name, wins, losses
    private String name;
    private int wins;
    private int losses;
    
    // TODO: Define mutator methods - 
    //       setName(), setWins(), setLosses()
    public void setName(String teamName) {
      name = teamName;
    }
    
    public void setWins(int teamWins){
       wins = teamWins;
    }
    
    public void setLosses(int teamLosses){
       losses = teamLosses;
    }
    
    
    // TODO: Define accessor methods - 
    //       getName(), getWins(), getLosses()
    public String getName(){
        return name;
    }
    
    public int getWins() {
       return wins;
    }
    
    public int getLosses() {
       return losses;
    }
    
    // TODO: Define getWinPercentage()
    public double getWinPercentage(){
       return (double) wins / (wins + losses);
    }
    
    // TODO: Define printStanding()
    public void printStanding() {
        double winPercentage = getWinPercentage();
        System.out.printf("Win percentage: %.2f\n",  winPercentage);

        if(winPercentage >= 0.5) {
            System.out.println("Congratulations, Team " + name + " has a winning average!");
        }
        else {
            System.out.println("Team " + name + " has a losing average.");
        }
    }
 }
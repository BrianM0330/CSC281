package week5;

public class FootballGame {

    private String team1, team2;
    private int team1Score, team2Score;

    private final int MIN_SCORE = 0;

    private static int totalGames = 0;
    private static int totalScore = 0;

    public FootballGame() {
        this.team1 = "Lane Tech";
        this.team2 = "Walter Payton";

        team1Score = MIN_SCORE;
        team2Score = MIN_SCORE;

        totalGames = totalGames + 1;
    }

    public FootballGame(String t1, String t2) {
        this.team1 = t1;
        this.team2 = t2;

        team1Score = MIN_SCORE;
        team2Score = MIN_SCORE;

        totalGames = totalGames + 1;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public boolean incrScore(String team, int score) {
        if (score == 1 || score == 2 || score == 3 || score == 6) {
            if (team.equals(team1)) {
                team1Score = team1Score + score;
                totalScore = totalScore + score;
                return true;
            }
            else if (team.equals(team2)) {
                team2Score = team2Score + score;
                totalScore = totalScore + score;
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
	
	public void display() {
		System.out.println("The current score is: " + team1 + ": " + team1Score + ", " + team2 + ": " + team2Score);
	}
	
	public static double getAvg() {
		if (totalGames > 0) {
		    double totalS = (double) totalScore;
		    double totalG = (double) totalGames;
		    double average = totalS/totalG;
		    return average;
		}
		else {
			return 0.0;
		}
	}
}

package week5;

public class PlayFootballGames {

	public static void main(String[] args) {
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		System.out.println();
		
		System.out.println("Information for the first game: ");
		FootballGame game1 = new FootballGame();
		game1.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		if (game1.incrScore(game1.getTeam1(), 6))
			System.out.println(game1.getTeam1() + " scored.");
		else System.out.println(game1.getTeam1() + " did not score.");
		game1.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		if (game1.incrScore(game1.getTeam2(), 3))
			System.out.println(game1.getTeam2() + " scored.");
		else System.out.println(game1.getTeam2() + " did not score.");
		game1.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		if (game1.incrScore(game1.getTeam1(), 4))
			System.out.println(game1.getTeam1() + " scored a goal.");
		else System.out.println(game1.getTeam1() + " did not score a goal.");
		game1.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		
		System.out.println();
		System.out.println("Information for the second game: ");
		FootballGame game2 = new FootballGame("Chicago Bears", "Green Bay Packers");
		game2.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		if (game2.incrScore(game2.getTeam1(), 6))
			System.out.println(game2.getTeam1() + " scored a goal.");
		else System.out.println(game2.getTeam1() + " did not score a goal.");
		game2.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		if (game2.incrScore(game2.getTeam1(), 1))
			System.out.println(game2.getTeam1() + " scored a goal.");
		else System.out.println(game2.getTeam1() + " did not score a goal.");
		game2.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		if (game2.incrScore(game2.getTeam2(), 3))
			System.out.println(game2.getTeam2() + " scored a goal.");
		else System.out.println(game2.getTeam2() + " did not score a goal.");
		game2.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
		if (game2.incrScore("Killer Prudence", 3))
			System.out.println("Killer Prudence scored a goal.");
		else System.out.println("Killer Prudence did not score a goal.");
		game2.display();
		System.out.println("The average score across all games is: " + FootballGame.getAvg());
	}

}

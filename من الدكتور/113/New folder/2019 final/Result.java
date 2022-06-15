
public class Result {
	private String competitionName;
	private String date;
	private double score;
	
	public Result(String competitionName, String date, double score) {
		this.competitionName = competitionName;
		this.date = date;
		this.score = score;
	}
	public Result(Result r) {
		this.competitionName = r.competitionName;
		this.date = r.date;
		this.score = r.score;
	}
	public String getCompetitionName() {
		return competitionName;
	}
	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}

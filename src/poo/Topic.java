package poo;

public class Topic {
	private String name;
	private double score;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Topic [name=" + name + ", score=" + score + "]";
	}

}

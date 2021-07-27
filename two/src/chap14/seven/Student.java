package chap14.seven;

public class Student {
	private String name;
	private int englishScore;
	private int mathscore;
	
	public Student(String name , int englishScore , int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathscore=mathScore;
	}
	
	public String getName() {return name;}
	public int getEnglishScore() {return englishScore;}
	public int getMathScore() {return mathscore;}
}

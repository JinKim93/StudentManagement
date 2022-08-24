package grade;

public interface GradeEvaluation {
	
	//점수를 받으면, 학점의 정보를 String값으로 반환 S,A,B 등
	public String getGrade(int point); 
}

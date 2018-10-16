/**
 *Michael Haugh
 *Project CH4PC3
 *AP CS
 *10-15-18
 */

public class TestScores {
    // ^This is the class.^
    
    private double score1;
    private double score2;
    private double score3;
    private double average;
    private char letterGrade;
    // ^These are the variables.^
    
    public TestScores(double s1, double s2, double s3, double a, char l){
    // ^This is the constructor.^
        
        score1 = s1;
        score2 = s2;
        score3 = s3;
        average = a;
        letterGrade = l;
    // ^These are the attributes.^
}
    public void setScore1(double score1){
        score1 = s1;
        // ^This is the mutator method.^
    }
    
    public double getScore1(){
       return score1;
       // ^This is the accessor method.^
    }
    
    public void setScore2(double score2){
        score2 = s2;
        // ^This is the mutator method.^
    }
    
    public double getScore2(){
        return score2;
        // ^This is the accessor method.^
    }
    
    public void setScore3(double s3){
        score3 = s3;
        // ^This is the mutator method.^
    }
    
    public double getScore3(){
        return score3;
        // ^This is the accessor method.^
    }
    
    public double average(){
        average = (score1 + score2 + score3) / 3;
        return average;
        // ^This is the mutator method.^
    }
    
    public char letterGrade(){
        if (average < 60){
            letterGrade = 'F';
  
        }
        else if (average >= 60 || average <= 69){
            letterGrade = 'D';
   
        }
        else if (average > 69 || average <= 79){
            letterGrade = 'C';
   
        }
         else if (average > 79 || average <= 89){
            letterGrade = 'B';
    
        }
         else if (average > 89 || average <= 100){
            letterGrade = 'A';
    
        }
        return letterGrade;
    }
        // ^This is the mutator method.^

}

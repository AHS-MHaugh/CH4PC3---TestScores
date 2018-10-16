/**
 *Michael Haugh
 *Project CH4PC3
 *AP CS
 *10-15-18
 */

public class TestScoresDemo {
    //^This is the class.^

    public static void main(String[] args) {
        TestScores t = new TestScores (63, 78, 95, 0, 'Z');
        // ^This is the object.^
        
 System.out.println("Test Score One was equal to " + t.getScore1() 
                + "%. "); 
 System.out.println("Test Score Two was equal to " + t.getScore2() 
                + "%. "); 
 System.out.println("Test Score Three was equal to " + t.getScore3() 
                + "%. "); 
 System.out.println("The average of the three test scores was equal to " + 
         t.average() + " %.");
 System.out.println("The letter grade of the average of the three test scores "
         + "was equal to a " + t.letterGrade() + ".");
 // ^This is the print command.^
    }
    
    
}

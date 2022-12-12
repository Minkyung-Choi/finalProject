/**
 * A class that has method printStar and multiplying string
 * @author mchoi
 */
public class Star {

    private int row;
    private int columns;

    public Star(int row, int columns){ //requirement 2: Object class with a constructor
        this.row = row;
        this.columns=columns;
    }

    /**
     * A method that takes the inputted rows and columns and print out the stars
     * @param line boolean that represent if the user wants a line between each row of stars
     */
    public void printStar(boolean line){ //requirement 4: Method with parameters
        boolean manyStars = columns>1;
        for(int i =0; i<row; i++){ //requirement 3: Iteration (use a loop)
            for(int j =0; j<3; j++){
                String starSentence = "";
                if(j==0){
                    starSentence ="  *  "; //string for top of star
                }else if(j==1){
                    starSentence ="*****"; //string for middle of star
                }else{
                    starSentence = " * * "; //string for bottom of star
                }
                if(manyStars){
                    starSentence = multiplyString(starSentence); //requirement 4: implemented and called
                }
                System.out.println(starSentence);
            }
            if(line && row>1){ //requirement 5: advanced conditional
                System.out.println();
            }
        }
    }

    /**
     * the method that modifies the column according to user input
     * @param sentence the original version of the string that is needed to be printed
     * @return updated value of the string
     */
    public String multiplyString(String sentence){ //requirement 4: method with parameters
        String update = sentence;
        for(int g=0;g<(columns-1);g++){
            update = update+"\t"+sentence;
        }
        return update;
    }
}

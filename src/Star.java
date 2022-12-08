public class Star {

    private int row;
    private int columns;

    public Star(int row, int columns){
        this.row = row;
        this.columns=columns;
    }

    public void printStar(boolean line){
        boolean manyStars = columns>1;
        for(int i =0; i<row; i++){
            for(int j =0; j<3; j++){
                String starSentence = "";
                if(j==0){
                    starSentence ="  *  ";
                }else if(j==1){
                    starSentence ="*****";
                }else{
                    starSentence = " * * ";
                }
                if(manyStars){
                    starSentence = multiplyString(starSentence);
                }
                System.out.println(starSentence);
            }
            if(line && row>1){
                System.out.println();
            }
        }
    }

    public String multiplyString(String sentence){
        String update = sentence;
        for(int g=0;g<(columns-1);g++){
            update = update+"\t"+sentence;
        }
        return update;
    }
}

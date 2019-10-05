
package ch05.simpledotcom;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int i = 0; i < locationCells.length;i++){
            if(guess == locationCells[i]){
        //for(int cell : locationCells){ //enhanced loop
            //if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }   
}

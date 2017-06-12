package Athlete;

import java.util.List ;
import java.util.Set;


/**
 * Created by ken on 2017-06-09.
 */
public abstract class Athlete {
    private string name;
    private string sports;
    private int score;

    public Athlete(string name, string sports) {
        this. nmae  = name;
        this. name = name;

    }
    // return name
 public string getName() {
     return nmae;
 }
    // return sports
    public string getSports(){
        return Sports

    }
    public  abstract int determinePoint(String scoreType, int scoreParm);

    public void updateScore(int points){
        score + = points;
    }
}

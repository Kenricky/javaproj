package Athlete;
import java.util;

/**
 * Created by ken on 2017-06-09.
 */
public class Quarterback extends Athlete{
    private int jerseyNumber;
    private double completionPercent;

    public Quarterback(String name, String sport, int jerseyNumber, double completionPercent) {
        super(name, sport);
        this.jerseyNumber = jerseyNumber;
        this.completionPercent = completionPercent;
    }


    public int determinePoint(String scoreType, int scoreParm)
    {
        return scoreParm;
    }

}

}

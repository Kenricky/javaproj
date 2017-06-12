package Athlete;

/**
 * Created by ken on 2017-06-09.
 */
public class Main {
    public class Main {

        public static void main(String[] args) {
            Quarterback FootbballPlayer1 = new Quarterback("Ronaldo","football",10,30);
            FootbballPlayer1.updateScore(3);
            Golfer GolfPayer1=new Golfer("tiger","golfe",13);


            System.out.println(FootbballPlayer1.getName().toString()+" is playing "+FootbballPlayer1.getSport());
//	        System.out.print(FootbballPlayer1.getName().toString()+"'s Score was "+FootbballPlayer1.updateScore(3));
            System.out.println(GolfPayer1.getName().toString()+"'s stroke is "+GolfPayer1.determinePoint("bogey",2));
        }
}















package ChefCertificate;


/**
 * Created by ken on 2017-06-09.
 */
public class Food {
       /*
    *Constructor method for food
    * @param foodType is the category of food
    * @param foodDesc is the description of the food
     */

    private String foodType;
    private String foodDesc;

    public Food(String foodType, String foodDesc){
        this.foodType = foodType;
        this.foodDesc = foodDesc;
    }

    /*
    *returns the category of the food
    */

    public String getFoodType(){
        return foodType;
    }

    /*
    *returns the description of the food
     */

    public String getFoodDesc(){
        return foodDesc;
    }
    //instance variables and other methods not shown
}




 
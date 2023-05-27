package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {

        //checking if triangle is valid or not by using the logic
        if((firstSide + secondSide > thirdSide || firstSide + thirdSide > secondSide || secondSide + thirdSide > firstSide)){
            System.out.println("Triangle is Valid");
        }  else {
            System.out.println("Triangle is not Valid");
        }
    }
}

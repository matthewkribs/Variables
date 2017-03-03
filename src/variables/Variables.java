/*
 * March 1, 2017
 * Variables
 * 
 */

package variables;

/**
 *
 * @author makri3110
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Q #1
        double pi=3.14; //storing the value for pi
        int rSquared=15*15; //area of a circle pir^2 
        double circleArea; //area of circle
        
     //Q #2
        String wayneName="Wayne Gretzky";
        int wayneNumber=99;
        
     //Q #3
        double rectangleHeight=5.7;
        double rectangleWidth=4.8;
        
     //Q #4
        double hours=40;
        double wage=10.55;
        double insurance=2;
        double tax=0.22;
        
     //Q #5
        double roomWidth=8.5;
        double roomLength=6;
        double squareMeter=19.95;
        
     //Q #6
        double purchasePrice=12.49;
        double moneyGiven=20;
        
        //Q #1
        circleArea=pi*rSquared;
        
        System.out.println("The area of a circle is " +circleArea+"cm");
        
        //Q #2
        System.out.println(wayneName+" is number "+wayneNumber);

        //Q #3
        System.out.println("The height of the rectangle is "+rectangleHeight+"cm");
        System.out.println("The width of the rectangle is "+rectangleWidth+"cm");
        System.out.println("The area of the rectangle is "+rectangleWidth*rectangleHeight+"cm");
       
        //Q #4
        System.out.println("The net pay for the employee is "+((hours*wage-insurance)-tax*(hours*wage-insurance))+"$");
                
        //Q #5
        System.out.println("The cost to carpet a room is "+(roomWidth*roomLength)*squareMeter+"$");
        
        //Q #6
        System.out.println("Bill for Shirt purchase");
        System.out.println("Tax = "+purchasePrice*0.13+"$");
        System.out.println("Shirt price = "+(purchasePrice*0.13+purchasePrice)+"$");
        System.out.println("Change = "+(moneyGiven-(purchasePrice*0.13+purchasePrice))+"$");
    }
    
}

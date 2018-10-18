/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premidterm;

/**
 *
 * @author hp
 */
public class Premidterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 20;
        double height = 1.8f;
        String name = "beatrice";
        double weight = 60;
        boolean ishealthy = false;
        
     // calculateBmi(name, age, height, weight);
        

String[] names ={ "Beatrice","Natasha","Levit"};
int [] ages = {20, 40, 30};



System.out.println(names[2 ]+ ages [ 1]);


      
                
    }
    
    public static void calculateBmi(String m, int a, double h, double t){
        double Bmi = t/(h*h);
      //  System.out.println("Hey my name is " +m+ " and my bmi is "+ Bmi+ getStatement());
       
      
      
      
    }
    
    public static String getStatement(){
        
        
        
        return  " i am underweight";
    }
    
    
}


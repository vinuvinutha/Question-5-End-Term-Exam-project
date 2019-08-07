package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	
                        	//call the function which calculate the calories for only bread
                        	System.out.println(cal.calculateCalories(bread));
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.println( cal.calculateCalories(bread,jam));
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.println(cal.calculateCalories(bread,jam,butter));
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            int calculateCalories(int bread) {
            	//System.out.println(bread*74);
            //you have to overload this function for three parameters refer the question
            	return bread*74;
            }
            int calculateCalories(int bread,int jam) {
            	//System.out.println((bread*74+jam*26));
                //you have to overload this function for three parameters refer the question
                	return (bread*74+jam*26);
                }
            int calculateCalories(int bread,int jam,int butter) {
            	//System.out.println((bread*74+jam*26+butter*102));
                //you have to overload this function for three parameters refer the question
                	return (bread*74+jam*26+butter*102);
                }
                
            
            
            
            
}
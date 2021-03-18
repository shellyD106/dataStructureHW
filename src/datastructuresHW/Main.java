package datastructuresHW;

import java.util.Arrays;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		  
        int arr[] = {2,5,6,3,7,8};
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        
        System.out.println("Sum of array is: "+sum);
	}		
	  public static double[] toPower(int size, int power){
	        double[] result = new double[size];
	        for(int i=0; i<size; i++){
	            result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
	        }
	        return result;
	    }

	 
	        
	        int size = 4; 
	        int power = 2;
	        double[] result = toPower(size, power);
	        
	        System.out.println("toPower result is: "+Arrays.toStringResult);
 }



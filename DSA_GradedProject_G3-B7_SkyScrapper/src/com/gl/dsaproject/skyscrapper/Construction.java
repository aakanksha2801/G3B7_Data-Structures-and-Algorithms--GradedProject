package com.gl.dsaproject.skyscrapper;

import java.util.*; 

public class Construction{     
    public static void main(String args[]){   

        Scanner sc = new Scanner(System.in);   

        System.out.println("Enter the total number floors in the building : "); 
        int n=sc.nextInt(); 
		
        int day[]=new int[n+1]; // array to store the size of each floor
        
		// iterate through 1 to n floors/ days
        for(int i=1;i<=n;i++){ 
            System.out.println("Enter the floor size given on day : "+i);             
            int size = sc.nextInt(); 
            day[size]=i; 
        }
        
		// declare a temporary variable
        int temp=n;  

		// declare a flag variable to check the condition when required.
        int flag;        
        System.out.println("The order of construction is as follows ");
			
        for(int i=1;i<=n;i++){
            flag=0;             
            System.out.println("Day "+i+" :");
            while(temp>=1 && day[temp]<=i){ // find the floor with the highest size available
                flag=1; 
                System.out.print(temp +" ");

				// find the next highest floor available
                temp--;             
            }

			// if flag is updated proceed to the next day
            if(flag==1)
                    System.out.println();             
        }     
        
    } 
    
}


// 4.Write a program to validate age (should be between 18 and 60 using &&).

package com.index;

import java.util.Scanner;

public class Operator_ass3_sum4 {

	public static void main(String[] args) {
	
			
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the age");
	int age= obj.nextInt();
	
	if((age>=18)&&(age<=60)){
		
		System.out.println("The age is vaild");
	}
    
	else {
		
		System.out.println("Invaild age");
	}
	
	}

}

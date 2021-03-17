package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Integer[] number= {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,6,6,6};
//		//List<Integer> numbers=Arrays.asList(number);
//		List<Integer> numbers = new LinkedList<Integer>(Arrays.asList(number));
//
//		int tempNum=0,counter=0,i=0;
//		while(i<numbers.size()-1) {
//			tempNum=numbers.get(i);
//			counter++;
//			int nextNum=numbers.get(i+1);
//			if(tempNum==nextNum) {
//				numbers.remove(i+1);
//				/*for(int j=i+1;j<numbers.size()-1;j++){
//					//numbers.g[j]=numbers[j+1];
//					numbers.set(j,)=numbers(j+1);
//				}*/
//			//	i++;
//				
//			}
//			else if(tempNum<nextNum) {
//				i++;
//			}
//			else {
//				break;
//			}
//		}
//		for(int k=0;k<numbers.size();k++) {
//			System.out.print(numbers.get(k)+ " ");
//		}
		
	      
	    int i = 0;
	    for (int j = 1; j < number.length; j++) {
	        if (number[j] != number[i]) {
	            i++;
	            number[i] = number[j];
	        }
	    }
	    System.out.print(i + 1);
	    
		
	}
}

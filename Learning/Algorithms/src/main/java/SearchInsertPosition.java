package main.java;

public class SearchInsertPosition {
	public static void main(String[] arg) {
		int[] num= {1,3,5,6};
		int target=2;
		boolean flag=false;
		/*for(int i=0;i<num.length;i++) {
			if(num[i]==target)
			{
				System.out.print(i);
				flag=true;
				break;
				
			}
		}*/
	
		
			for(int i=0;i<num.length;i++) {
				if(!((i+1)==num.length) && num[i+1]>target && num[i]<=target) {
					System.out.print("number should be at index: "+(i+1));
					break;
				}
				else if((i+1)==num.length) {
					System.out.println("number should be at index"+(i+1));
				}
					
			}
		
	}

}

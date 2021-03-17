package main.java;

public class MatrixRotation {
	public static void main(String[] arg) {
		int[][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
		MatrixRotation obj=new MatrixRotation();
		obj.printMatrix(matrix);
		System.out.println("after traverse");
		obj.traverse(matrix);
		obj.printMatrix(matrix);
		System.out.println("after diagonal");
		obj.diagonal(matrix);
		obj.printMatrix(matrix);
		System.out.println("after diagonal");
		obj.diagonal(matrix);
		obj.printMatrix(matrix);
	}
	public void printMatrix(int[][] matrix) {
		int n=matrix.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
		void traverse(int[][] matrix){
	        int temp;
	        int n=matrix.length;
	        for(int i=0;i<n;i++){
	            for(int j=i;j<n;j++){
	                temp=matrix[j][i];
	                matrix[j][i]=matrix[i][j];
	                matrix[i][j]=temp;
	            }
	        }
		}
		
		void diagonal(int[][] matrix) {
			int temp;
	        int n=matrix.length;
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<n/2;j++) {
	        		temp=matrix[i][j];
	        		matrix[i][j]=matrix[i][n-j-1];
	        		matrix[i][n-j-1]=temp;
	        	}
	        }
		}
		
}

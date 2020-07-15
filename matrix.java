
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main
{
	/*package whatever //do not write package name here */



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] mat_size=new int[2];
        ArrayList<Integer> ar=new ArrayList<Integer>();
        
        for(int i=0;i<2;i++){
           if(scan.hasNextInt()){
           mat_size[i]=scan.nextInt();
        }
        }
        //System.out.println(mat_size[0]);
        int[][] mat=new int[mat_size[0]][mat_size[1]];
        for(int i=0;i<mat_size[0];i++){
             //String[] line = scan.nextLine().trim().split(" ");
            for(int j=0;j<mat_size[1];j++){
                mat[i][j] = scan.nextInt();
                
            }
        }
        //int sum=0;
        for(int j=0;j<mat_size[1];j++){
	    int sum=0;
	    for(int i=0;i<mat_size[0];i++){
	        sum=sum+mat[i][j];
	    }
	    ar.add(sum);
	}
	for(int i=0;i<ar.size();i++){
	    System.out.print(ar.get(i)+" ");
	}
    }
}
        


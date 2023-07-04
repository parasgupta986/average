package com.intershala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int sum=0;
	int n=scn.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]= scn.nextInt();
	}
	for(int i=0;i<n;i++){
		sum=sum+arr[i];
	}
	float average=sum/n;
	    System.out.println(average);
    }
}

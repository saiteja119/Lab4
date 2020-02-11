package com.CapG.lab4.Exercise1;
import java.util.*;
public class Cubes{
	static void sumOfCube(int num)
	{
		int res=0;
		while(num>0)
		{
			int temp=num%10;
			res+=(temp*temp*temp);
			num=num/10;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sumOfCube(num);
	}
}

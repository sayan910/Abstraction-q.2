package com.app;
import java.util.Scanner;
import com.model.Sphere;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		int radius=sc.nextInt();
		Sphere sphere=new Sphere(radius);
		System.out.printf("Volume of Sphere is %.1f", sphere.calculateVolume());

	}

}

package lt.vtmc.builder3;

import java.util.Scanner;

public class MyDinner {

	public static void main(String[] args) {
		DinnerOrder myDinner = new DinnerBuilder().bread("Vilniaus duona").meat("Steak").wine("Kazkas").build();	
		System.out.println(myDinner);
		DinnerOrder myWifeDinner = new DinnerBuilder().wine("Geras").meat("Kotletas").build();
		System.out.println(myWifeDinner);
		
	}

}

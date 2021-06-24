package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		/*
		 * String myName = "Oğuz!"; String myWomanName = "Damla!"; double myLength =
		 * 1.83; double myWomanLength = 1.60; int myAge = 22; boolean isAlive = true;
		 * 
		 * System.out.println(isAlive);
		 * 
		 * if (myLength > myWomanLength) { System.out.println(myName);
		 * 
		 * 
		 * }else if(myWomanLength == myLength) { System.out.println("eşit"); } else {
		 * 
		 * System.out.println(myWomanName); }
		 

		String[] list = { "K1", "K2", "K3", "K4", "K5" };

	
		for(String listElem : list)  {
			System.out.println(listElem);
		};
		
		for(int i = list.length ; i>0; i--) {
			System.out.println(i);
		}
		
		VALUE TYPE
		int num1 = 11;
		int num2 =20;
		num1 = num2;
		num2 = 100;
		System.out.println(num1);
		
				REFERENCE TYPE
		*/
		
		
//			STACK & HEAP 
		
//		DEĞER TİPLERDE ATAMALAR YAPILIR DEĞER DEĞİŞİR SAYISAL BERİ TİPLERİ 
		
//		ARRAY REFERANS TİPLİDİR CLASS İNTERFACE ABSTRACTS
		
//		DATAS KEEPS ON ADRESS 
		
//		GARBAGE COLLECTOR REMOVES 101 
		
		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = {10,20,30,40,50};
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);
		
		
		String city1 = "a";
		String city2 = "b";
		city1 = city2;
		city2 = "izmir";
		System.out.println(city1);
	}

}
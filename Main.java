package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 구구단
// -------------------		
		// Scanner scanner= new Scanner(System.in);

		// int dan = 0;

		// System.out.println("구구단으로 사용할 숫자를 입력하세요!");
		// dan = scanner.nextInt();

// -------------------------------------------		
		// for(int dan =2; dan <= 9; dan++) {
		// System.out.println("-----------" + dan +"단 ---------");
		// for(int i=1; i<=9; i++) {
		// System.out.println( dan + " X " +i + " = " + (i*dan));

		// ------------------------------------------------------

		// }
		// }

		// System.out.print("1111111111\t");
		// System.out.print("2222222222\t");
		// System.out.print("3333333333\t");
		// -------------------------------------

		// for (int i=1; i<=9; i++) {
		// for (int dan=2; dan<=9; dan++) {
		// System.out.print(dan + " x " + i + " = " + (dan*i) + "\t");
		// }
		// System.out.println();

		// }
		// ---------------------------------------------------------

		// for (int i=1; i<=9; i++) {
		// for (int dan=2; dan<=9; dan++)
		// if(i % 2 == 0)
		// {
		// System.out.print(dan + " x " + i + " = " + (i*dan) + "\t");

		// }

		// System.out.println();

//	}

		// ---------------------------------------------------------------------

		// for (int i = 1; i <= 9; i++) {
		// for (int dan = 2; dan <= 9; dan++) //nested for 문 , row
		// if (i * dan % 2 == 0) { // column
		// System.out.print(dan + " x " + i + " = " + (i * dan) + "\t");
		// } else {
		// System.out.print("\t\t"); // 띄어쓰기
		// }
		// System.out.println();
		// }

		// ------------------------------------------------------------------------------

		// for (int i = 1; i <= 9; i++) {
		// for (int dan = 2; dan <= 9; dan++)
		// if (i % 2 == 0) {
		// System.out.print(dan + " x " + i + " = " + (i * dan) + "\t");
		// } else {
		// System.out.print(dan + " x " + "* " + "= " + (i * dan) + "\t");
		// }
		// System.out.println();

		// ---------------------------------------------------------------------------------

		// for (int i = 1; i <= 9; i++) {
		// for (int dan = 2; dan <= 9; dan++) {

		// System.out.print(i % 2 == 0 ? dan + " x " + i + " = " + (i * dan) + "\t"
		// : dan + " x " + "* " + "= " + (i * dan) + "\t");

		// } // 삼항연산자는 print 문 안에 넣어 준다. 물어 볼때는 i % 2 == 0 ? a : b 로 물어본다.

		// System.out.println();
// --------------------------------------------------- 

//		for (int i = 1; i <= 9; i++) {
//			System.out.print(2 + " x " + i + " = " + (i * 2) + "\t");
//			System.out.print(3 + " x " + i + " = " + (i * 3) + "\t");
//			System.out.print(4 + " x " + i + " = " + (i * 4) + "\t");
//			System.out.print(5 + " x " + i + " = " + (i * 5) + "\t");
//			System.out.print(6 + " x " + i + " = " + (i * 6) + "\t");
//			System.out.print(7 + " x " + i + " = " + (i * 7) + "\t");
//			System.out.print(8 + " x " + i + " = " + (i * 8) + "\t");
//			System.out.print(9 + " x " + i + " = " + (i * 9) + "\t");

//			System.out.println();

//		}
//---------------------------------------------------------------------
		int dan = 1;
		if (dan >= 1 || dan < 9) {
			dan++; }
		{
				System.out.print(dan);
			
		} //System.out.println(dan);
		//{for (int i = 1; i <= 9; i++) {			
		//	System.out.print(dan + " x " + i + " = " + (i * dan + "\t"));
		//	{
	
		//		System.out.println();

		//	}
	//	}
	// }
}
}

// -----------------------------------------------------------------------

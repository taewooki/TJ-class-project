package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		// String[] weekDay = new String[7];
		// weekDay[0] = "일요일";
		// weekDay[1] = "월요일";
		// weekDay[2] = "화요일";
		// weekDay[3] = "수요일";
		// weekDay[4] = "목요일";
		// weekDay[5] = "금요일";
		// weekDay[6] = "토요일";
//-------------------------------------------
		String[] weekDay = new String[7];
		weekDay[0] = "일요일";
		weekDay[1] = "월요일";
		weekDay[2] = "화요일";
		weekDay[3] = "수요일";
		weekDay[4] = "목요일";
		weekDay[5] = "금요일";
		weekDay[6] = "토요일";
	
		System.out.println(weekDay.length);
		
		
		//------------------------------------------
		// System.out.println(weekDay.length);
		// ----------------------------------------------
		// for(int i=0; i<weekDay.length; i++)
		// if (i % 2 == 0)

		// {
		// System.out.println(weekDay[i]);

		// }

		// ------------------------------------------------
	//	for (int i = 0; i < weekDay.length; i++)
	//		if (i % 2 == 0) {
	//			System.out.println(weekDay[i]);
	//		}

		// ----------------------------------------
		// int i = 0;
		// while (i < weekDay.length) {

		// System.out.println(weekDay[i]);
		// i++;
		// }

		// ----------------------------------------------
		
		int i = 0;
		while (i <weekDay.length) {
		
		System.out.println(weekDay[i]);
		i++;
		}
		
		
		// --------------------------------------------

	}
}

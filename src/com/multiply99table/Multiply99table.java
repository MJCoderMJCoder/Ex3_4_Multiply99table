package com.multiply99table;

public class Multiply99table {	//multiply：乘、增加、繁殖
	public static String Convert(int digit) {		//convert:转变、兑换；digit：数字（0~9）、手指、足趾
		String[] digitWords = {
				"十","一","二","三","四","五","六","七","八","九"
		};
		if (digit < 10)
			return digitWords[digit];
		else if (digit == 10)
			return digitWords[digit / 10] + digitWords[0];
		else
			return digitWords[digit/10] + digitWords[0] + digitWords[digit % 10];
	}

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				
				/*条件运算符（  ？  ：  ）*/
				System.out.print(Convert(i) + Convert(j) + ((i * j >= 10) ? "" : "得")
						+ Convert(i * j));
				System.out.print(((i * j > 10) ? ",  " : ",    "));
			}
			System.out.println("\n");
		}
	}
}

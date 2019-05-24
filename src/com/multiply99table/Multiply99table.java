package com.multiply99table;

public class Multiply99table {	//multiply���ˡ����ӡ���ֳ
	public static String Convert(int digit) {		//convert:ת�䡢�һ���digit�����֣�0~9������ָ����ֺ
		String[] digitWords = {
				"ʮ","һ","��","��","��","��","��","��","��","��"
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
				
				/*�����������  ��  ��  ��*/
				System.out.print(Convert(i) + Convert(j) + ((i * j >= 10) ? "" : "��")
						+ Convert(i * j));
				System.out.print(((i * j > 10) ? ",  " : ",    "));
			}
			System.out.println("\n");
		}
	}
}

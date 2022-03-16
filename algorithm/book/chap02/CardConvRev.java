package chap02;

import java.util.Scanner;

public class CardConvRev {
	//기수변환
	// 정숫값을 임이의 기수로 변환하는 알고리즘
	// 10진수 정수를 n진수 정수로 변환하려면 정수를 n으로 나눈 나머지를 구하는 동시에 그 몫에 대한 나눗셈 반복 --> 구한 나머지를 거꾸로 늘어뜨린 숫자 = 기수로 변환한 숫자
	
	// 기수변환을 수행하는 프로그램 : 입력받는 10진수를 2진수~36진수로 기수 변환하여 나타냄
	static int cardConvR(int x, int r, char[] d) {
		//정수 값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
		int digits=0; //변환 후 자리수 
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWZYZ"; // 변한환 값의 각 자리의 문자를 char형 배열 d에 넣기 
		
		do {
			d[digits++] = dchar.charAt(x%r); // r로 나눈 나머지를 저장, charAt 메서드 : 문자열에서 임의의 문자를 엑세스하기 위한 String 클래스
			//1. 먼저 x를 r로 나눈 나머지를 인덱스로 하는 문자를 배열 d 요소[digits]에 대입하고 digits의 값을 증가 \
			x/=r; //2. x를 r로 나눈다.
		}while(x!=0); //x가 0이 아닐 때까지 
		return digits;
	} // 배열을 넣는 것을 역순으로 수행 (배열 앞쪽에 아랫자리가 들어감)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no; //변환하는 정수
		int cd; //기수
		int dno; // 변환 후 자릿수
		int retry; // 다시 한 번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자 배열
		
		System.out.println("[10진수를 다른 진수로 변환합니다.]");
		do {
			System.out.println("===정수입력===");
			do {
				System.out.print("변환할 정수 : ");
				no=scan.nextInt();
			}while(no<0); //음수이면 다시 
			
			System.out.println("==변환할 진수 입력==");
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36) : ");
				cd=scan.nextInt();
			}while(cd<2||cd>36);
			
			dno = cardConvR(no, cd, cno); // no를 cd진수로 변환하는 메소드에 대입
			
			System.out.print(cd+"진수 --> ");
			for (int i = dno-1; i>=0; i--) { //윗자리부터 차례대로 나타냄
				System.out.print(cno[i]);
			}
			System.out.println();
			
			//다시 한 번?
			System.out.print("한 번 더 바꾸겠습니까? 1. 예/ 0. 아니오");
				retry= scan.nextInt();
		}while(retry==1);
	}
	//([.70)
}

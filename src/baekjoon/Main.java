package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정 
		
		String[] minus = in.nextLine().split("-");
		for (int i=0;i<minus.length;i++) {
			int temp =0;
			String[] plus = minus[i].split("\\+");
			for(int j=0;j<plus.length;j++) {
				temp+=Integer.parseInt(plus[j]);
			}
			if(sum ==  Integer.MAX_VALUE)
				sum=temp;
			else
				sum-=temp;
		}
		System.out.println(sum);
	}
 
}
package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
int x =1;
int y= 3;
		
	}
	public static int hanoi(int N,int x,int y) {
		if(y>0) {
			x = y;
			y = 6 - x- y;
			return hanoi(N,y,x%y);
		}else
		return 1;
	}
}

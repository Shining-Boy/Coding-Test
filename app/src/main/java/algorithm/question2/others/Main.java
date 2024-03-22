package algorithm.question2.others;

import java.util.Scanner;
import java.util.Arrays;


// 달팽이 삼각형 문제
// https://www.jungol.co.kr/problem/1337
public class Main {
	private static final int[] dx = {1, -1, 0};
	private static final int[] dy = {1, 0, -1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] triangle = new int[n][n];
		for(int i=0; i<n; i++){
			Arrays.fill(triangle[i], -1);
		}
		int x = 0;
		int y = 0;
		int d = 0;
		int v = 0;

		while(true){
			triangle[y][x] = v;
			int nx = x + dx[d];
			int ny = y + dy[d];

			if(nx==n || nx==-1 || ny==n || ny==-1 || triangle[ny][nx]!=-1){
				d = (d+1)%3;
				nx = x + dx[d];
				ny = y + dy[d];
				if(nx==n || nx==-1 || ny==n || ny==-1 || triangle[ny][nx]!=-1){
					break;
				}
			}
			x = nx;
			y = ny;
			v = (v+1)%10;
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				System.out.printf("%d ", triangle[i][j]);
			}
			System.out.println();
		}
	}
}
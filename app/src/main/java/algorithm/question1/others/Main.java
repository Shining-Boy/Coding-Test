package algorithm.question1.others;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfLine = sc.nextInt();

		int[][] lines = new int[numberOfLine][];

		for(int i=0; i<numberOfLine; i++){
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			lines[i] = new int[7];
			lines[i][0] = y2 - y1;
			lines[i][1] = x1 - x2;
			lines[i][2] = -(lines[i][0] * x1 + lines[i][1] * y1);
			lines[i][3] = x1 < x2 ? x1 : x2;
			lines[i][4] = x1 > x2 ? x1 : x2;
			lines[i][5] = y1 < y2 ? y1 : y2;
			lines[i][6] = y1 > y2 ? y1 : y2;
		}

		int numberOfIntersection = 0;
		for(int i=0; i<numberOfLine-1; i++){
			for(int j=i+1; j<numberOfLine; j++){
				int a = lines[i][0];
				int b = lines[i][1];
				int e = lines[i][2];
				int c = lines[j][0];
				int d = lines[j][1];
				int f = lines[j][2];

				if(a*d - b*c == 0) continue;

				double x = (double) (b*f - d*e) / (a*d - b*c);
				double y = (double) (a*f - c*e) / (b*c - a*d);

				// System.out.print(x);
				// System.out.print(',');
				// System.out.println(y);

				//if(x%1==0 && y%1==0){
					if(x>=(double)lines[i][3]&&x<=(double)lines[i][4]&&y>=(double)lines[i][5]&&y<=(double)lines[i][6]){
						if(x>=(double)lines[j][3]&&x<=(double)lines[j][4]&&y>=(double)lines[j][5]&&y<=(double)lines[j][6]){
							// System.out.print(x);
							// System.out.print(',');
							// System.out.println(y);
							numberOfIntersection++;
						}
					}
					
				//} 
			}
		}

		System.out.print(numberOfIntersection);
	}
}

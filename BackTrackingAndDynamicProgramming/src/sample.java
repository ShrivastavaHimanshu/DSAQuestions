import java.util.Arrays;
import java.util.Scanner;


class sample {

	public static void sound() {
		System.out.println(" Roar");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int sum = s.nextInt();

		int count = 0;

		int array[] = new int[n];

		for(int i=0;i<n;i++)

		array[i] = s.nextInt();
		
		solve(array , sum);


		}

		public static void  solve(int[] A, int B) {
		      int n = A.length;
			    int result [] = new int [2];
		        boolean flag = false;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {

						if ((A[i] + A[j] == B) && i != j){
		                    result[0] = A[i];
		                    result[1] = A[j];
		                    flag = true;

		                }
							 

					}

				}
				if (flag) {
					System.out.println("true");
					Arrays.sort(result);
		            System.out.println(result[0] + ","+ result[1]);
				}
				//return 0;
			}

		}

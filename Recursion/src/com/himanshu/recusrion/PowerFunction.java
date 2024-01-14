package com.himanshu.recusrion;

public class PowerFunction {

	public static void main(String[] args) {
	 int A= -1, B=2, C=20;
	 long ans = pow(A,B,C);
	 System.out.println("ans is :" + ans);

	}

	public static long pow(int A, int n, int C) {
        if(n==0 && A==0) return 0;
        if (n==0 && A !=0) return 1;
        if (A<0 && n%2==1) return A+C;
        if (n==1) return A;
        long he = pow(A,n/2,C);
        long ha = (he%C * he%C)%C;
       
        if (n%2==0){
            return ha;
        }
        else {
            return (ha%C*A%C)%C;
        }

    }
	
}

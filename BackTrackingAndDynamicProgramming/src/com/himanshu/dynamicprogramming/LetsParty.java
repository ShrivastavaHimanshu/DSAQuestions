/**
 * 
 */
package com.himanshu.dynamicprogramming;

/**
 * @author Hshri
 *In Danceland, one person can party either alone or can pair up with another person.

Can you find in how many ways they can party if there are A people in Danceland?

Note: Return your answer modulo 10003, as the answer can be large
 */
public class LetsParty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3 ;
		int ans = solve(n);
		System.out.println(" ans is : " + ans);

	}

	private static int solve(int n) {
		int mod = 10003;
		int dp [] = new int [n+1];
		dp[0] = 1; 
		dp [1] = 1 ; // dp[2] means 2 people can party in 2 party in 2 2ays  either in single single or in pair
		// So dp[2] = dp[1]+ 1 *dp[0] --> 2 = dp[1] + 1 --> dp[1] = 1
		
		
//		Recursive Relation
//		For any A except for base cases we can say that
//		new person who will join after (A - 1) people will join in either individually or will pair up with one of the remaining people
//
//		Case1: joins individually
//		When (A)th person join individually to (A - 1) people then no equation changes. 
//		Therefore number of distinct ways for this case is = dp[A - 1];
//
//		Case2: joins as a pair
//		(A)th person can form pair with all (A - 1) people. In fact he will form pair with all (A - 1) people to form all distinct ways. 
//
//		Suppose there are 4 people = {P1, P2, P3, P4}
//		P4 forms pair with P1 = {P1P4}, remaining people are {P2, P3}, i.e. 2 people.
//		In how many distinct ways this 2 remaining people can dance = dp[A - 2];
//
//		Like this P4 will form pair with first P1, then P2, then P3.
//		Therefore, number of distinct ways are
//		 (Number of people last person can form pair with i.e. A-1) * (Number of ways in which A-2 people can dance = dp[A - 2]);
//
//		Resultant DP Relation = Case1 + Case2
//		dp[i] = dp[i - 1] + ((i - 1) * dp[i - 2]);

		
		for(int i = 2 ; i <= n ; i++) {
			dp[i] = (dp[i-1] % mod +(i-1) % mod* dp[i-2] % mod ) % mod;
		}
		return dp[n];
	}

}

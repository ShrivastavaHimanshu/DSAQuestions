package com.himanshu.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*There are N jobs to be done, but you can do only one job at a time.

Given an array A denoting the start time of the jobs and an array B denoting the finish time of the jobs.

Your aim is to select jobs in such a way so that you can finish the maximum number of jobs.

Return the maximum number of jobs you can finish.
*/

class job {
	int startTime ;
	int endTime ;
	 job(int s , int e){
		 this.startTime = s;
		 this.endTime = e;
	 }
}
public class MaximumJobs {

	public static void main(String[] args) {
		int a [] = {3, 2, 6};
		int b [] =	 {9, 8, 9};
		int ans = solve(a, b);
		System.out.println(" ans is :" + ans);

	}

	private static int solve(int[] a, int[] b) {
		int n = a.length ;
		List<job> listJob = new ArrayList<>();
		for (int i = 0 ; i < n ; i++) {
			 listJob.add(new job(a[i], b[i]));
		}
			
		// now sort this pair on the basis of end Time
		Collections.sort(listJob, (job1, job2) -> job1.endTime - job2.endTime);
		
//		Collections.sort(listJob, new Comparator<job>() {
//			@Override
//			public int compare(job o1, job o2) {
//				
//				return o1.endTime - o2.endTime;
//			}
//			
//		});
		
		
		int currEnd = listJob.get(0).endTime;
		int res = 1;
		for(int i = 1; i < listJob.size() ; i++) {
			int nextstart = listJob.get(i).startTime;
			// Checking for no overlapping
			if(currEnd <= nextstart) {
				res++;
				currEnd = listJob.get(i).endTime;
			}
			
		}
		return res;
	}

}

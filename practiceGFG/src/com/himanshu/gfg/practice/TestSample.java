package com.himanshu.gfg.practice;
import java.util.*;
public class TestSample {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(1.00, 2.00, 3.00, 4.00, 5.00, 6.00);
		int window = 5;
		List<Double> ans = getAverage(list, window);
		for(int i = 0 ; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " , ");
		}
			
	}

	private static List<Double> getAverage(List<Double> list, int window) {
		int n = list.size();
		List<Double> ans = new ArrayList<Double>();
		
		for(int i = 0 ; i < n ; i++) {
			//if (i)
			int tempWindow = window;
			double  tempAvg = 0.00;
			int j = i - (window/2) ;
			int count = 0;
			while(j >= 0 &&  j < n && tempWindow > 0) {
				tempAvg+=list.get(j);
				tempWindow--;
				j++;
				count++;
				
			}
			list.add(tempAvg/count);
		}
		return ans;
	}

}

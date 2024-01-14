package com.himanshu.leetCode;

public class FindFirstAndLastPositionInArray {

	public static void main(String[] args) {
		// index 0 1 2 3 4 5
		int[] nums = { 1,2,2 };
		int target = 2;
		int ans[] = searchRange(nums, target);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] searchRange(int[] nums, int target) {
		int n = nums.length;
		int l = 0, r = n - 1, start = 0, end = 0, startCount = 0 , endCount = 0;
		if (n == 0) {
			return insertIndex(-1, -1);
		}
		if (n == 1 && nums[0] == target) {

			return insertIndex(0, 0);
		}
		if (n == 2) {
			if (nums[0] == target && nums[1] == target) {
				start = 0;
				end = 1;
			} else if (nums[0] == target && nums[1] != target) {
				start = 0;
				end = 0;
			} else if (nums[0] != target && nums[1] == target) {
				start = 1;
				end = 1;
			} else {
				start = -1;
				end = -1;
			}
			return insertIndex(start, end);

		}

		// First Find the start element
		while (l <= r) {
			int mid = l + (r - l) / 2;
			
			if (mid > 0 && nums[mid] == target && nums[mid - 1] != target) {
				start = mid;
				startCount++;
				break;
			}
			if (nums[mid] >= target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		
		// Find the end element
		l = 0;
		r = n - 1; // 3-1 = 2
		while (l <= r) {

			int mid = l + (r - l) / 2;
			if (mid < n - 1 && nums[mid] == target && nums[mid + 1] != target) {
				end = mid;
				endCount++;
				break;
			}
			if (nums[mid] <= target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		System.out.println("start is :" + start + " end is : " + end);
		if (startCount==0 && endCount==0) {
		     start=-1; end = -1;
		}else if (startCount == 0 && endCount > 0) {
			start = end ; 
		}
		else if (startCount > 0 &&  endCount ==0) {
			end = start;
		}
			return insertIndex(start, end);
		}

	

	public static int[] insertIndex(int start, int end) {
		int ans[] = new int[2];
		ans[0] = start;
		ans[1] = end;
		return ans;
	}
}

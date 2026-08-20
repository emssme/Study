import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			int[] nums = new int[10];
			
			for(int i=0; i<10; i++) {
				nums[i] = sc.nextInt();
			}

			int sum = 0;
			int length = nums.length - 2;
			
			Arrays.sort(nums);
			
			for(int i=1; i<9; i++) {
				sum += nums[i];
			}
			// 형변환 필요
			int  answer = (int) Math.round((double) sum / length);
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}

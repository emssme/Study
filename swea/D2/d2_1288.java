package D2;

import java.util.Scanner;
import java.util.Set;
/*
 * 1. �׽�Ʈ���̽� ��ȣ T�� �Է¹ޱ�.
 * 2. �׽�Ʈ���̽� ����,
 *  2-1. num(N)_���� �Է¹޴´�.
 *  2-2. 0~9������ ���� ��� numbers �迭��, �� ���� ���Դ��� üũ�ϴ� isVisited �迭�� �ʱ�ȭ�ϰ� ���� �Ҵ����ش�.
 *  2-3. while������ ��� num �� ���ذ��鼭 (num*count)
 *      2-3-0. while�� �ѹ� �� ������ count ���� ������Ű�鼭 break ������ �� ��� ���ߴ��� Ȯ��
 *      2-3-1. �ڿ������� �� �ϳ��� ���� ���Դ� �������� Ȯ���ϰ�
 *      2-3-2. ó�� ���� ���ڸ� visit ó�� ���ְ�, seenCount++
 *      2-3-3. ���� �� �Ǻ��� ���� temp �� ����
 *  2-4. ��� �������� �ݺ� ���� (seenCount�� 10�� �Ǹ�)
 * 3. kN�� ° ���� ���� �� �� kN�� ����϶� �����ϱ� num*count ���� result�� �Ҵ��Ͽ� ���
 */
public class d2_1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			// 0~9 ���� ����
			boolean[] checkArr = new boolean[10];
			// ���� ���� ���� ����
			int seeCount = 0;
			// ��� °�� ���� ������
			int multiple = 0;
			
			while(seeCount < 10) {
				// 10���� �� ���������� �ݺ�
				multiple++;
				int currentNum = N * multiple;
				// �̹��� ���� �� ��ȣ
				int temp = currentNum;
				while(temp > 0) {
					// �ڸ� �� ����
					int digit = temp % 10;
					if(!checkArr[digit]) {
						// �ش� ���� ������ true �� ����
						checkArr[digit] = true;
						// ���� ���� +1
						seeCount++;
					}
					temp /= 10;
				}
			}
			System.out.println("#" + test_case + " " + N * multiple);	// kN ���
		}
	}
}

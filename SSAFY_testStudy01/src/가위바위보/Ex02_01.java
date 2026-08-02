package 가위바위보;

import java.util.Scanner;

/*
1을 가위, 2를 주먹, 3을 보라고 가정했을 때 컴퓨터와 사용자가 함께하는 가위바위보 게임을 작성하여 보자.  비기는 경우도 1판으로 인정한다.

| 자료 1: 난수 발생 코드
(int) (Math.random() * 3) +1
| 자료 2: 프로그램 실행 예시
가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.

1. 5판 3승
2. 3판 2승
3. 1판 1승

번호를 입력하세요. 2

가위바위보 중 하나 입력: 가위
졌습니다!!!
가위바위보 중 하나 입력: 가위
졌습니다!!!
### 컴퓨터 승!!!
 */
public class Ex02_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요.");
		
		int N = sc.nextInt();
		
		// 목표 승수 정하기
		int winCnt;
		switch(N) {
			case 1: winCnt = 3; break;
			case 2: winCnt = 2; break;
			default: winCnt = 1;
		}
		
		int userWin = 0;
		int comWin = 0;
		
		// 목표 승수 도달하면 종료
		while(userWin < winCnt && comWin < winCnt) {
			System.out.print("가위바위보 중 하나 입력: ");
			String user = sc.next();
			
			int cpt = (int) (Math.random() * 3) +1;
			
			int u;
			if(user.equals("가위")) u = 1;
			else if(user.equals("바위")) u = 2;
			else if(user.equals("보")) u = 3;
			else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			if(u == cpt) {
				// 비겼을 때
				System.out.println("비겼습니다!!!");
			} else if ((u == 1 && cpt == 3) ||
					(u == 2 && cpt == 1) ||
					(u == 3 && cpt == 2)) {
				// 이겼을 때
				System.out.println("이겼습니다!!!");
				userWin++;
			} else {
				// 졌을 때
				System.out.println("졌습니다!!!");
				comWin++;
			}
		}
		
		if(userWin == winCnt) {
			System.out.println("### 사람 승!!!");
		} else if(comWin == winCnt) {
			System.out.println("### 컴퓨터 승!!!");
		}
	}
}


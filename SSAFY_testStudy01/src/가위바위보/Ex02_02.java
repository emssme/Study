package 가위바위보;

import java.util.Scanner;

/*
문제
1을 물, 2를 불, 3을 풀이라고 가정한 "속성 배틀" 게임을 작성해 보자. 물은 불을 이기고, 불은 풀을 이기고, 풀은 물을 이긴다. 컴퓨터는 난수로 속성을 정하고, 사용자는 매 판 속성을 입력한다. 비기는 경우도 1판으로 인정한다. (패키지명: com.ssafy.ws.step3, 클래스명: ElementTest)

입력
먼저 승부 방식 번호(1~3)를 입력하고, 이후 매 판마다 물, 불, 풀 중 하나를 문자열로 입력한다.

출력
매 판 결과를 이겼습니다!!! / 졌습니다!!! / 비겼습니다!!! 로 출력하고, 목표 승수에 먼저 도달한 쪽을 ### 사용자 승!!! 또는 ### 컴퓨터 승!!! 로 출력한다.

제약조건

난수: (int)(Math.random() * 3) + 1 사용
메뉴 1 → 3승 먼저, 메뉴 2 → 2승 먼저, 메뉴 3 → 1승 먼저 도달 시 승리
비긴 판은 어느 쪽에도 승수를 주지 않으며 게임은 계속 진행

입출력 예시

입력	출력
2 물 불 풀	(메뉴 안내 출력 후)
물불풀 중 하나 입력: 물
이겼습니다!!!
물불풀 중 하나 입력: 불
비겼습니다!!!
물불풀 중 하나 입력: 풀
이겼습니다!!!
### 사용자 승!!!
 */
public class Ex02_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("속성 배틀을 시작합니다. 아래 보기 중 하나를 고르세요.");
        System.out.println();
        System.out.println("1. 5판 3승");
        System.out.println("2. 3판 2승");
        System.out.println("3. 1판 1승");
        System.out.println();
        System.out.print("번호를 입력하세요. ");
        
		int N = sc.nextInt();
		int winCnt;
		
		switch(N) {
			case 1: winCnt = 3; break;
			case 2: winCnt = 2; break;
			default: winCnt = 1;
		}
		
		int userWin = 0;
		int cptWin = 0;
		
		while(userWin < winCnt && cptWin < winCnt) {
			System.out.print("물불풀 중 하나 입력: ");
			String user = sc.next();
			int u;
			int cpt = (int)(Math.random() * 3) + 1;
			
			if(user.equals("물")) u = 1;
			else if(user.equals("불")) u = 2;
			else if(user.equals("풀")) u = 3;
			else {
				System.out.println("다시 입력해주세요");
				continue;
			}
			
			if(u == cpt) {
				// 비겼을때
				System.out.println("비겼습니다!!!");
			} else if((u==1 && cpt==2) || (u==2 || cpt==3) || (u==3 || cpt==1)) {
				// 이겼을 때
				System.out.println("이겼습니다!!!");
				userWin++;
			} else {
				// 졌을 때
				System.out.println("졌습니다!!!");
				userWin++;
			}
		}
		
		if(userWin == winCnt) {
			System.out.println("### 사용자 승!!!");
		} else if(cptWin == winCnt){
			System.out.println("### 컴퓨터 승!!!");
		}
	}
}

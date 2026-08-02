package 가위바위보;

import java.util.Scanner;

/*
출제 개념: 난수 발생, 반복문, 조건 분기(일치 비교), 승수 누적, 조기 종료

문제
컴퓨터(술래)와 사용자가 겨루는 "참참참" 게임을 작성해 보자. 사용자는 매 판 좌 또는 우로 고개를 돌리고, 컴퓨터는 난수로 한쪽 방향을 가리킨다. 방향이 같으면 걸려서 컴퓨터가 이기고, 다르면 사용자가 이긴다. (패키지명: com.ssafy.ws.step3, 클래스명: ChamTest)

입력
먼저 승부 방식 번호(1~3)를 입력하고, 이후 매 판마다 좌 또는 우를 문자열로 입력한다.

출력
컴퓨터가 가리킨 방향을 먼저 출력하고, 매 판 결과를 걸렸습니다!!!(컴퓨터 승) 또는 피했습니다!!!(사용자 승)로 출력한다. 마지막에 ### 사용자 승!!! 또는 ### 컴퓨터 승!!! 를 출력한다.

제약조건

난수: (int)(Math.random() * 2) + 1 (1=좌, 2=우)
메뉴 1 → 3승, 메뉴 2 → 2승, 메뉴 3 → 1승 먼저 도달 시 승리
이 게임에는 무승부가 없다

입출력 예시

입력	출력
2 좌 우 좌	(메뉴 안내 출력 후)
좌 또는 우 입력: 좌
컴퓨터: 우
피했습니다!!!
좌 또는 우 입력: 우
컴퓨터: 우
걸렸습니다!!!
좌 또는 우 입력: 좌
컴퓨터: 좌
걸렸습니다!!!
### 컴퓨터 승!!!
 */
public class Ex02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("참참참을 시작합니다. 아래 보기 중 하나를 고르세요.");
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
		int u;
		
		while(userWin < winCnt && cptWin < winCnt) {
			System.out.print("좌 또는 우 입력: ");
			String user = sc.next();

			int cpt = (int)(Math.random() * 2) + 1;
			
			if(user.equals("좌")) u = 1;
			else if(user.equals("우")) u = 2;
			else {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			if(cpt == 1) {
				System.out.println("컴퓨터: 좌");
			} else {
				System.out.println("컴퓨터: 우");
			}
			
			if(u == cpt) {
				// 방향이 같을 때
				System.out.println("걸렸습니다!!!");
				cptWin++;
			} else {
				System.out.println("피했습니다!!!");
				userWin++;
			}
		}
		
		if(userWin == winCnt) {
			System.out.println("### 사용자 승!!!");
		} else if(cptWin == winCnt) {
			System.out.println("### 컴퓨터 승!!!");
		}
	}
}

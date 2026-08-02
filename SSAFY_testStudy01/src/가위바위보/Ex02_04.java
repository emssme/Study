package 가위바위보;

import java.util.Scanner;

/*
문제
컴퓨터와 사용자가 매 판 주사위(1~6)를 굴려 겨루는 "주사위 대결" 게임을 작성해 보자. 두 주사위 값 중 큰 쪽이 이기고, 같으면 무승부다. 무승부도 1판으로 인정한다. (패키지명: com.ssafy.ws.step3, 클래스명: DiceTest)

입력
승부 방식 번호(1~3)만 입력한다. 이후 주사위 값은 컴퓨터가 매 판 자동으로 굴린다(사용자·컴퓨터 모두 난수).

출력
매 판 두 주사위 값을 사용자: X vs 컴퓨터: Y 형식으로 출력하고, 결과를 이겼습니다!!! / 졌습니다!!! / 비겼습니다!!! 로 출력한다. 마지막에 ### 사용자 승!!! 또는 ### 컴퓨터 승!!! 를 출력한다.

제약조건

난수: (int)(Math.random() * 6) + 1 (사용자·컴퓨터 각각 1회씩)
메뉴 1 → 3승, 메뉴 2 → 2승, 메뉴 3 → 1승 먼저 도달 시 승리
무승부인 판은 어느 쪽에도 승수를 주지 않으며 게임은 계속 진행

입출력 예시

입력	출력
2	(메뉴 안내 출력 후)
사용자: 5 vs 컴퓨터: 3
이겼습니다!!!
사용자: 2 vs 컴퓨터: 2
비겼습니다!!!
사용자: 6 vs 컴퓨터: 1
이겼습니다!!!
### 사용자 승!!!
 */
public class Ex02_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("주사위 대결을 시작합니다. 아래 보기 중 하나를 고르세요.");
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
        	int cpt = (int)(Math.random() * 6) + 1;
        	int user = (int)(Math.random() * 6) + 1;
        	
        	System.out.printf("사용자: %3d vs 컴퓨터: %3d", user, cpt);
        	System.out.println();
        	
        	if(cpt == user) {
        		// 같을 때
        		System.out.println("비겼습니다!!!");
        	} else if(user > cpt) {
        		System.out.println("이겼습니다!!!");
        		userWin++;
        	} else {
        		System.out.println("졌습니다!!!");
        		cptWin++;
        	}
        }
        
        if(userWin == winCnt) {
        	System.out.println("### 사용자 승!!!");
        } else if(cptWin == winCnt) {
        	System.out.println("### 컴퓨터 승!!!");
        }
        
	}
}

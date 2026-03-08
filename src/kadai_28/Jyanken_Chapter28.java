package kadai_28;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		
		// スキャナーインスタンス生成
		Scanner scanner = new Scanner(System.in);
		
		// 正しいじゃんけんの手であるか判定→falseなら再入力
		while(true) {
			
			// スキャナーの入力を受け取る
			String myHand = scanner.next();
			
			if("r".equals(myHand) || "s".equals(myHand) || "p".equals(myHand)) {
				return myHand;
			}
			
			System.out.println("入力が正しくありません、もう一度入力してください。");
		}
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		
		String[] comHand = {"r", "s", "p"};
		
		double randomNum = Math.floor(Math.random() * 3);
		return comHand[(int)randomNum];
	}
	
	// じゃんけんを行うメソッド
	public void playGame(String myChoice, String random) {
		
		HashMap<String, String> getHand = new HashMap<>();
		getHand.put("r", "グー");
		getHand.put("s", "チョキ");
		getHand.put("p", "パー");
		
		System.out.println("自分の手は" + getHand.get(myChoice) + ",対戦相手の手は" + getHand.get(random));
		
		if(myChoice == "r") {
			switch(random) {
			case "r" -> System.out.println("あいこです");
			case "s" -> System.out.println("自分の勝ちです");
			case "p" -> System.out.println("自分の負けです");
			}
		} else if(myChoice == "s") {
			switch(random) {
			case "r" -> System.out.println("自分の負けです");
			case "s" -> System.out.println("あいこです");
			case "p" -> System.out.println("自分の勝ちです");
			}
		} else {
			switch(random) {
			case "r" -> System.out.println("自分の勝ちです");
			case "s" -> System.out.println("自分の負けです");
			case "p" -> System.out.println("あいこです");
			}
		}
	}
}
package kadai_28;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();
		
		// テキスト表示
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String myChoice = Jyanken.getMyChoice();
		String random = Jyanken.getRandom();
		Jyanken.playGame(myChoice, random);
	}
}
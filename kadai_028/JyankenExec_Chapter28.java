package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

		//じゃんけんの手を入力して"myHand"に出力
		String myHand = jyanken.getMyChoice();
				
		//相手のじゃんけんの手を出力
		String yourHand = jyanken.getRandom();
		
		//じゃんけん開始
		jyanken.playGame(myHand, yourHand);
	}
}

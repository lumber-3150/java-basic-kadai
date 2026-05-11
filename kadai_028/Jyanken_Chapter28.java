package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//
	public String getMyChoice() {
		String choice	=""; 
		Scanner scanner = new Scanner(System.in);
		
		while(choice.equals("")) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpapaerのpを入力しましょう");
		
			String input = scanner.next();
		
			if(input.equals("r")) {
				choice = "r";
			}else if(input.equals("s")) {
				choice = "s";
			}else if(input.equals("p")) {
				choice = "p";
			}else {
				choice = "";
				System.out.println("正しいじゃんけんの手ではありません");
			}
		}
		scanner.close();
		return choice;
	}
	
	public String getRandom() {
		String[] handList = {"r", "s", "p"};
		String random = handList[(int)Math.floor(Math.random()*3)];
		
		return random;
	}
	
	public void playGame(String myHand, String yourHand) {
		
		HashMap<String, String> handMap = new HashMap<String, String>();
		
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		System.out.println("自分の手は" + handMap.get(myHand) + "対戦相手の手は" + handMap.get(yourHand));
		
		if(myHand.equals(yourHand)) {
			System.out.println("あいこです");
		}else if(
		(myHand.equals("r") && yourHand.equals("s")) ||
		(myHand.equals("s") && yourHand.equals("p")) ||
		(myHand.equals("p") && yourHand.equals("r")) 
		) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}
}

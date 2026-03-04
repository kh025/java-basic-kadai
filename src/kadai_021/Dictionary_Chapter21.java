package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	HashMap<String, String> dictionary = new HashMap<>();
	
		// コンストラクタ
		public Dictionary_Chapter21() {
			
			// 辞書に追加
			dictionary.put("apple", "りんご");
			dictionary.put("peach", "桃");
			dictionary.put("banana", "バナナ");
			dictionary.put("lemon", "レモン");
			dictionary.put("pear", "梨");
			dictionary.put("kiwi", "キウィ");
			dictionary.put("strawberry", "いちご");
			dictionary.put("grape", "ぶどう");
			dictionary.put("muscat", "マスカット");
			dictionary.put("cherry", "さくらんぼ");
		}
		
	// 検索用メソッド
	public void search(String[] searchWords) {
		for(String searchWord : searchWords) {
			if(dictionary.containsKey(searchWord)) {
				System.out.println(searchWord + "の意味は" + dictionary.get(searchWord));
			} else {
				System.out.println(searchWord + "は辞書に存在しません");
			}
		}
	}
}
package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		
		// インスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 検索ワードを配列にセット
		String[] searchWords = {"apple", "banana", "grape", "orange"};
		
		// 実行
		dictionary.search(searchWords);
	}
}
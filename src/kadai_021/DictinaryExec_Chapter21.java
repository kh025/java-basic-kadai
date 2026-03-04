package kadai_021;

public class DictinaryExec_Chapter21 {
	public static void main(String[] args) {
		
		// インスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 検索ワードを配列にセット
		String[] serchWords = {"apple", "banana", "grape", "prange"};
		
		// 実行
		dictionary.serch(serchWords);
	}
}
# 課題 13-2: ArrayListと繰り返し処理

### 課題の説明
課題13-1で作成したRailwayLineクラスに全ての駅名をCSV形式にした文字列を返すgetStationsAsCSVメソッドを追加しなさい。


### ProgD2.java (提出不要)
```java
public class ProgD2 {

	public static void main(String[] args) {
		RailwayLine yamanote = new RailwayLine();
		System.out.println(yamanote.getStationsAsCSV());
	}
}
```


### 実行例
```
東京,神田,秋葉原,御徒町,上野,鶯谷,日暮里,西日暮里,田端,駒込,巣鴨,大塚,池袋,目白,高田馬場,高田馬場,新大久保,新宿,代々木,原宿,渋谷,恵比寿,目黒,五反田,大崎,品川,田町,浜松町,新橋,ゆうらくちょう,
```
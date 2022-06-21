import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @version (20220621)
 */
public class RailwayLineTest {

    ArrayList<String> stations = new ArrayList<String>(Arrays.asList(
            "東京",
            "神田",
            "秋葉原",
            "御徒町",
            "上野",
            "鶯谷",
            "日暮里",
            "西日暮里",
            "田端",
            "駒込",
            "巣鴨",
            "大塚",
            "池袋",
            "目白",
            "高田馬場",
            "高田馬場",
            "新大久保",
            "新宿",
            "代々木",
            "原宿",
            "渋谷",
            "恵比寿",
            "目黒",
            "五反田",
            "大崎",
            "品川",
            "田町",
            "浜松町",
            "新橋",
            "ゆうらくちょう"
    ));

    @Test
    public void testGetStationsAsCSV()
    {
        try{
            // action
            RailwayLine y = new RailwayLine();
            Field stations = y.getClass().getDeclaredField("stations");

            // assertion
            assertEquals(Modifier.PRIVATE, stations.getModifiers());

            // action
            stations.setAccessible(true);
            stations.set(y, this.stations);

            // assertion
            String expected = "東京,神田,秋葉原,御徒町,上野,鶯谷,日暮里,西日暮里,田端,駒込,巣鴨,大塚,池袋,目白,高田馬場,高田馬場,新大久保,新宿,代々木,原宿,渋谷,恵比寿,目黒,五反田,大崎,品川,田町,浜松町,新橋,ゆうらくちょう,";

            assertEquals(expected, y.getStationsAsCSV(), "getStationsAsCSV()の出力が期待したものと異なります!");

        } catch (Exception e) {
            // なにかしら例外がでたらfailにする
            fail("教員に相談してください!");
        }
    }
}

package sampleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sample.FizzBuzz;

public class MainTest {

    @Test
    void _1を渡すと文字列1を返す() throws Exception {
        //準備
        FizzBuzz fizzbuzz = new FizzBuzz();
        //実行&検証
        assertEquals("1", fizzbuzz.convert(1));
        /*
         * assertEquals("2", fizzbuzz.convert(2));
         * を追加しても可能だが、良くない
         * →テストは失敗したら、そのテストメソッドは中止になる
         * →どこが正常に動くかわからない＝後進
         * 　かつ、1つのテストメソッドで何をしたいか分からない
         *
         * 1テスト1アサーションを、1 assertion per 1 testという
         */
        //片付け(DBの後処理などで、今回はない)
    }

    @Test
    void _2を渡すと文字列2を返す() throws Exception {
        //準備
        FizzBuzz fizzbuzz = new FizzBuzz();
        //実行&検証
        assertEquals("2", fizzbuzz.convert(2));
        //片付け(DBの後処理などで、今回はない)
    }

}

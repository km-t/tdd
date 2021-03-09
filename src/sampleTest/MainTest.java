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
        //片付け(DBの後処理などで、今回はない)
    }

}

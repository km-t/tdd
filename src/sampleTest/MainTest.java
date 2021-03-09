package sampleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sample.FizzBuzz;

public class MainTest {

    private FizzBuzz fizzbuzz;

    @BeforeEach
    private void 準備() {
        fizzbuzz = new FizzBuzz();
        /**
         * テストメソッドが呼ばれる順番は変わる
         * →テストの信頼性を確保するため
         * →テスト間の依存関係が無いということを担保
         * ex)テスト1で書き込んだ内容をテスト2で読み込むなど
         */
    }

    @Test
    void _1を渡すと文字列1を返す() throws Exception {
        assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    void _2を渡すと文字列2を返す() throws Exception {
        assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    void _3を渡すと文字列Fizzを返す() throws Exception {
        assertEquals("Fizz", fizzbuzz.convert(3));
    }

    @Test
    void _5を渡すと文字列Buzzを返す() throws Exception {
        assertEquals("Buzz", fizzbuzz.convert(5));
    }
}

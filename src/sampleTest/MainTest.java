package sampleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import sample.FizzBuzz;

@DisplayName("Fizz Buzz 数列とその変換規則を扱う FizzBuzzクラス")
public class MainTest {

    /**
     * 今は、1,2,3,5以外の値に対する挙動/情報が書いていない
     * ex)FizzBuzzって何?
     * →動作するドキュメントとは言えない
     * →仕様書にあるものをテストコードに反映
     * →３の倍数はFizzなど
     * →nestさせる
     */

    private FizzBuzz fizzbuzz;

    @BeforeEach
    private void 準備() {
        fizzbuzz = new FizzBuzz();
    }

    @Nested
    class convertメソッドは引数に与えられた整数を文字列に変換する {
        @Nested
        class その他の数はそのまま文字列に変換する {
            @Test
            void _1を渡すと文字列1を返す() throws Exception {
                assertEquals("1", fizzbuzz.convert(1));
            }
            /**
             * テストコードもメンテナンスする必要がある
             * →無駄なテスト(三角測量を行った際のコードなど)は消しておく
             */

        }

        @Nested
        class _3の倍数のときは代わりにFizzを返す {

            @Test
            void _3を渡すと文字列Fizzを返す() throws Exception {
                assertEquals("Fizz", fizzbuzz.convert(3));
            }
        }

        @Nested
        class _5の倍数のときは代わりにBuzzを返す {
            @Test
            void _5を渡すと文字列Buzzを返す() throws Exception {
                assertEquals("Buzz", fizzbuzz.convert(5));
            }
        }
    }

}

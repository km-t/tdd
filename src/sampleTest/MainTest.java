package sampleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import sample.FizzBuzz;

@DisplayName("Fizz Buzz 数列とその変換規則を扱う FizzBuzzクラス")
public class MainTest {

    private FizzBuzz fizzbuzz;

    @BeforeEach
    private void 準備() {
        fizzbuzz = new FizzBuzz();
    }
    /**
     * 品質保証の観点から考えると、(意識的に考えられた)テストケースが少ない
     * ex) 境界値分析や同値分割など
     *
     */

    @Nested
    class convertメソッドは引数に与えられた整数を文字列に変換する {
        @Nested
        class その他の数はそのまま文字列に変換する {
            @Test
            void 下の境界値1を渡すと文字列1を返す() throws Exception {
                assertEquals("1", fizzbuzz.convert(1));
            }
            @Test
            void 下の境界値のひとつ内側の値2を渡すと文字列2を返す() throws Exception {
                assertEquals("2", fizzbuzz.convert(2));
            }
        }

        @Nested
        class _3の倍数のときは代わりにFizzを返す {
            @Test
            void 同値類の中の最小の3の倍数3を渡すと文字列Fizzを返す() throws Exception {
                assertEquals("Fizz", fizzbuzz.convert(3));
            }
            @Test
            void 上の境界値のひとつ内側の値であり同値類の中の最大の3の倍数99を渡すと文字列Fizzを返す() throws Exception {
                assertEquals("Fizz", fizzbuzz.convert(99));
            }
        }

        @Nested
        class _5の倍数のときは代わりにBuzzを返す {
            @Test
            void 同値類の中の最小の5の倍数5を渡すと文字列Buzzを返す() throws Exception {
                assertEquals("Buzz", fizzbuzz.convert(5));
            }
            @Test
            void 上の境界値100を渡すと文字列Buzzを返す() throws Exception {
                assertEquals("Buzz", fizzbuzz.convert(100));
            }
        }
    }

}

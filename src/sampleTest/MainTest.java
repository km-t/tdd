package sampleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sample.FizzBuzz;

@DisplayName("Fizz Buzz 数列とその変換規則を扱う FizzBuzz クラス")
class MainTest {
    private FizzBuzz fizzbuzz;
    @BeforeEach
    void 前準備() {
         fizzbuzz = new FizzBuzz();
    }

    @Nested
    class convertメソッドは数を文字列に変換する {

        @ParameterizedTest(name = "{1}{0}を渡すと文字列「Fizz」を返すこと")
        @CsvSource({
            "3,  '同値類の中の最小の3の倍数'",
            "99, '上の境界値のひとつ内側の値であり同値類の中の最大の3の倍数'"
        })
        void _3の倍数のときは数の代わりにFizzに変換する(int input, String description) {
            assertEquals("Fizz", fizzbuzz.convert(input));
        }

        @ParameterizedTest(name = "{1}{0}を渡すと文字列「Buzz」を返すこと")
        @CsvSource({
            "5,   '同値類の中の最小の5の倍数'",
            "100, '上の境界値であり同値類の中の最大の5の倍数'"
        })
        void _5の倍数のときは数の代わりにBuzzに変換する(int input, String description) {
            assertEquals("Buzz", fizzbuzz.convert(input));
        }

        @ParameterizedTest(name = "{1}{0}を渡すと文字列「FizzBuzz」を返すこと")
        @CsvSource({
            "15,  '同値類の中の最小の3と5の公倍数'",
            "0,   '下の境界値のひとつ外側の値0は3と5両方の倍数でもあるので'"
        })
        void _3と5両方の倍数の場合には数の代わりにFizzBuzzに変換する(int input, String description) {
            assertEquals("FizzBuzz", fizzbuzz.convert(input));
        }

        @ParameterizedTest(name = "{2}{0}を渡すと文字列「{1}」を返すこと")
        @CsvSource({
            "1,   '1',   '下の境界値'",
            "2,   '2',   '下の境界値のひとつ内側の値'",
            "101, '101', '下の境界値のひとつ外側の値'"
        })
        void その他の数のときはそのまま文字列に変換する(int input, String expected, String description) {
            assertEquals(expected, fizzbuzz.convert(input));
        }
    }
}
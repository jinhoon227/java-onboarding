package onboarding;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {
    @Nested
    class Problem1Test {
        @Test
        void case1() {
            List<Integer> pobi = List.of(97, 98);
            List<Integer> crong = List.of(197, 198);
            int result = 0;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case2() {
            List<Integer> pobi = List.of(131, 132);
            List<Integer> crong = List.of(211, 212);
            int result = 1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case3() {
            List<Integer> pobi = List.of(99, 102);
            List<Integer> crong = List.of(211, 212);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case4() {
            // 초과된 페이지번호 예외처리
            List<Integer> pobi = List.of(451, 452);
            List<Integer> crong = List.of(211, 212);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case5() {
            // 왼쪽페이지가 짝수일때 예외처리
            List<Integer> pobi = List.of(150, 151);
            List<Integer> crong = List.of(211, 212);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case6() {
            // 왼쪽페이지가 마지막 페이지를 펼쳤을때 예외처리
            List<Integer> pobi = List.of(399, 400);
            List<Integer> crong = List.of(211, 212);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case7() {
            // 곱연산 맥스값으로 크롱이 이겼을때
            List<Integer> pobi = List.of(199, 200);
            List<Integer> crong = List.of(299, 300);
            int result = 2;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case8() {
            // 서로 다른 맥스값(하나는 곱연산, 하나는 더하기연산)으로 무승부가 날경우
            List<Integer> pobi = List.of(311, 312);
            List<Integer> crong = List.of(113, 114);
            int result = 0;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case9() {
            // 더하기연산 맥스값으로 크롱이 이겼을때
            List<Integer> pobi = List.of(311, 312);
            List<Integer> crong = List.of(115, 116);
            int result = 2;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case10() {
            // 서로 같은페이지를 펼쳤을때 무승부가 날경우
            List<Integer> pobi = List.of(311, 312);
            List<Integer> crong = List.of(311, 312);
            int result = 0;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }
    }

    @Nested
    class Problem2Test {
        @Test
        void case1() {
            String cryptogram = "browoanoommnaon";
            String result = "brown";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }

        @Test
        void case2() {
            String cryptogram = "zyelleyz";
            String result = "";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }

        @Test
        void case3() {
            // 3개 이상 연속되는 문자열 중복처리
            String cryptogram = "ooooo";
            String result = "";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }

        @Test
        void case4() {
            // 중복제거 순서 확인, 중복되는 문자를 한번에 처리하는 과정이라면 z가 남을것.
            String cryptogram = "zozzoooxzzzxo";
            String result = "z";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }

        @Test
        void case5() {
            // 한글자 처리 테스트
            String cryptogram = "z";
            String result = "z";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }
    }

    @Nested
    class Problem3Test {
        @Test
        void case1() {
            int number = 13;
            int result = 4;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }

        @Test
        void case2() {
            int number = 33;
            int result = 14;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }

        @Test
        void case3() {
            // 세자리수 확인
            int number = 333;
            int result = 228;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }

        @Test
        void case4() {
            // 최소값 확인
            int number = 1;
            int result = 0;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }
    }

    @Nested
    class Problem4Test {
        @Test
        void case1() {
            String word = "I love you";
            String result = "R olev blf";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }

        void case2() {
            // 연속된 특수문자(공백)
            String word = "Hello  Everyone!";
            String result = "Svool  Veviblmv!";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }

        void case3() {
            // 여러종류 특수문자 테스트
            String word = "안녕ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !@#!#  123";
            String result = "안녕ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba !@#!#  123";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }

        void case4() {
            // 최소글자 테스트
            String word = "a";
            String result = "z";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }
    }

    @Nested
    class Problem5Test {
        @Test
        void case1() {
            int money = 50_237;
            List<Integer> result = List.of(1, 0, 0, 0, 0, 2, 0, 3, 7);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }

        @Test
        void case2() {
            int money = 15_000;
            List<Integer> result = List.of(0, 1, 1, 0, 0, 0, 0, 0, 0);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }

        @Test
        void case3() {
            // 최소금액
            int money = 1;
            List<Integer> result = List.of(0, 0, 0, 0, 0, 0, 0, 0, 1);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }

        @Test
        void case4() {
            // 5만원권 제외한 최대금액
            int money = 49_999;
            List<Integer> result = List.of(0, 4, 1, 4, 1, 4, 1, 4, 9);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }

        @Test
        void case5() {
            // 최대금액
            int money = 1_000_000;
            List<Integer> result = List.of(20, 0, 0, 0, 0, 0, 0, 0, 0);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }
    }

    @Nested
    class Problem6Test {
        @Test
        void case1() {
            List<List<String>> forms = List.of(
                    List.of("jm@email.com", "제이엠"),
                    List.of("jason@email.com", "제이슨"),
                    List.of("woniee@email.com", "워니"),
                    List.of("mj@email.com", "엠제이"),
                    List.of("nowm@email.com", "이제엠")
            );
            List<String> result = List.of("jason@email.com", "jm@email.com", "mj@email.com");
            assertThat(Problem6.solution(forms)).isEqualTo(result);
        }

        @Test
        void case2() {
            // 모든 인원이 중복
            List<List<String>> forms = List.of(
                    List.of("onepiece@email.com", "원피수"),
                    List.of("jason@email.com", "제이슨"),
                    List.of("onepisu@email.com", "원피수"),
                    List.of("m@email.com", "엠제이"),
                    List.of("suoffnepi@email.com", "수원피")
            );
            List<String> result = List.of("jason@email.com", "m@email.com", "onepiece@email.com",
                    "onepisu@email.com", "suoffnepi@email.com");
            assertThat(Problem6.solution(forms)).isEqualTo(result);
        }

        @Test
        void case3() {
            // 최소인원
            List<List<String>> forms = List.of(
                    List.of("jason@email.com", "자")

            );
            List<String> result = List.of();
            assertThat(Problem6.solution(forms)).isEqualTo(result);
        }

        @Test
        void case4() {
            // 한글자 중복 체크 안해야함
            List<List<String>> forms = List.of(
                    List.of("jason@email.com", "자"),
                    List.of("jaswon@email.com", "자")

            );
            List<String> result = List.of();
            assertThat(Problem6.solution(forms)).isEqualTo(result);
        }
    }

    @Nested
    class Problem7Test {
        @Test
        void case1() {
            String user = "mrko";
            List<List<String>> friends = List.of(
                    List.of("donut", "andole"),
                    List.of("donut", "jun"),
                    List.of("donut", "mrko"),
                    List.of("shakevan", "andole"),
                    List.of("shakevan", "jun"),
                    List.of("shakevan", "mrko")
            );
            List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
            List<String> result = List.of("andole", "jun", "bedi");
            assertThat(Problem7.solution(user, friends, visitors)).isEqualTo(result);
        }
    }

    @Test
    void case2() {
        String user = "mrko";
        List<List<String>> friends = List.of(
                List.of("mrko", "jun"),
                List.of("donut", "jun"),
                List.of("donut", "mrko"),
                List.of("shakevan", "andole"),
                List.of("shakevan", "jun"),
                List.of("shakevan", "mrko")
        );
        List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
        List<String> result = List.of("andole", "bedi");
        assertThat(Problem7.solution(user, friends, visitors)).isEqualTo(result);
    }
}
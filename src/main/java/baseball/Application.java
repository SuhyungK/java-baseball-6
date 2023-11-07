package baseball;

import baseball.domain.NumberGenerator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 숫자 야구 프로그램의 시작점
        NumberGenerator genreator = new NumberGenerator();
        List<Integer> numbers = genreator.createRandomNumbers();
        System.out.println(numbers);
    }
}

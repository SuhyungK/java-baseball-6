package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 숫자 야구 프로그램의 시작점
        final NumberGenerator generator = new NumberGenerator();
        List<Integer> computerNumbers = generator.createRandomNumbers();

        Referee referee = new Referee();
        String result = "";
        while (!result.equals("0 볼 3 스트라이크")) {
            referee.compare(computerNumbers, askNumbers());
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    }

    public static List<Integer> askNumbers() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number: input.split("")) {
            numbers.add(Integer.valueOf(number));
        }

        return numbers;
    }
}

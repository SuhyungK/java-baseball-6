package baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {
        // 몇 개의 숫자가 같은 지 알아낸 뒤
        // 스트라이크의 개수를 구해서 뺀다.
        // 남은 수는 볼의 개수이다.

        final Judgement judgement = new Judgement(); // 객체들이 서로 협력해서 하나의 프로그램을 완성한다...
        int correctCount = judgement.correctCount(computer, player);

        int strike = 0;
        for (int placeIndex = 0; placeIndex < computer.size(); placeIndex++) {
            if (judgement.hasPlace(computer, placeIndex, player.get(placeIndex))) {
                strike++;
            }
        }

        int ball = correctCount - strike;

        if (correctCount == 0) {
            return "낫싱";
        }
        return ball + " 볼 " + strike + " 스트라이크";
    }
}

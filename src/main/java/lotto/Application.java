package lotto;

import lotto.contoller.LottoController;
import lotto.domain.LottoRankEnum;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        LottoController lottoController = new LottoController();
        lottoController.run();
    }
}

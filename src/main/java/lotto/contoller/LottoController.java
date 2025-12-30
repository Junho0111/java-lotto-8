package lotto.contoller;

import lotto.domain.Lotto;
import lotto.domain.LottoMachine;
import lotto.domain.WinningLotto;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    public void run() {

        int price = InputView.setPurchasePrice();
        price /= 1_000;

        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i <= price; i++) {
            Lotto lotto = new Lotto(LottoMachine.getLottoNumber());
            lottos.add(lotto);
        }

        OutputView.lottoView(lottos, price);

        List<Integer> winnig = InputView.setWinningNumber();
        int bonusNumber = InputView.setBonusNumber();
        WinningLotto winningLotto = new WinningLotto(winnig, bonusNumber);


        //당첨 통계 출력
    }
}

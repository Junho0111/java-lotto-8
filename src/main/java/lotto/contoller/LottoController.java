package lotto.contoller;

import lotto.domain.Lotto;
import lotto.domain.LottoMachine;
import lotto.domain.LottoResult;
import lotto.domain.WinningLotto;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    public void run() {

        int purchasePrice = InputView.setPurchasePrice();
        int lottoCount = purchasePrice / 1_000;

        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < lottoCount; i++) {
            Lotto lotto = new Lotto(LottoMachine.getLottoNumber());
            lottos.add(lotto);
        }

        OutputView.lottoView(lottos, lottoCount);

        List<Integer> winnig = InputView.setWinningNumber();
        int bonusNumber = InputView.setBonusNumber();
        WinningLotto winningLotto = new WinningLotto(winnig, bonusNumber);

        LottoResult result = new LottoResult();
        result.winnigData(lottos, winningLotto);
        result.winnigDataView();

        result.getRateOfReturn(purchasePrice);
    }
}

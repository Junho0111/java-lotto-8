package lotto.view;

import lotto.domain.Lotto;

import java.util.List;

public class OutputView {

    public static void lottoView(List<Lotto> lottos, int price) {
        System.out.println(price + "개를 구매했습니다.");

        for (int i = 0; i < price; i++) {
            System.out.println("[" + lottos.get(i).toString() + "]");
        }
        System.out.println();
    }
}

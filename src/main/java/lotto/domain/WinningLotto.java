package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class WinningLotto {

    private List<Integer> winnigLottoList =  new ArrayList<>();

    public WinningLotto(List<Integer> setWinningNumber, int BonusNumber) {
        setWinningNumber.add(BonusNumber);
        this.winnigLottoList = setWinningNumber;
    }

    public List<Integer> getWinnigLottoList() {
        return winnigLottoList;
    }
}

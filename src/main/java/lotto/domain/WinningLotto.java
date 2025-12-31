package lotto.domain;

import java.util.List;

public class WinningLotto {
    private List<Integer> winningNumbers;
    private int bonusNumber;

    public WinningLotto(List<Integer> winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public int getWinningNumber(int idx) {
        return winningNumbers.get(idx);
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}

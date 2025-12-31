package lotto.domain;

public enum LottoRankEnum {
    RANK_1(6, 2_000_000_000),
    RANK_2(5, 30_000_000),
    RANK_3(5, 1_500_000),
    RANK_4(4, 50_000),
    RANK_5(3, 5_000);

    private final int winningCount;
    private final int amount;

    LottoRankEnum(int winningCount, int amount) {
        this.winningCount = winningCount;
        this.amount = amount;
    }

    public int getWinningCount() {
        return winningCount;
    }

    public int getAmount() {
        return amount;
    }
}

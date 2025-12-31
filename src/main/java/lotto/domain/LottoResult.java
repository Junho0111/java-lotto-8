package lotto.domain;

import java.util.List;

public class LottoResult {

    private int rank5Count = 0;
    private int rank4Count = 0;
    private int rank3Count = 0;
    private int rank2Count = 0;
    private int rank1Count = 0;

    public void winnigData(List<Lotto> lottos, WinningLotto winningLotto) {

        for (Lotto l : lottos) {
            int count = 0;

            for (int j = 0; j < 6; j++) {
                if (l.getNumbers().contains(winningLotto.getWinningNumber(j))) {
                    count++;
                }
            }

            boolean checkBonus = l.getNumbers().contains(winningLotto.getBonusNumber());

            if (count == LottoRankEnum.RANK_1.getWinningCount()) rank1Count++;
            else if (count == LottoRankEnum.RANK_2.getWinningCount() && checkBonus) rank2Count++;
            else if (count == LottoRankEnum.RANK_3.getWinningCount()) rank3Count++;
            else if (count == LottoRankEnum.RANK_4.getWinningCount()) rank4Count++;
            else if (count == LottoRankEnum.RANK_5.getWinningCount()) rank5Count++;
        }

    }

    public void winnigDataView() {
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + rank5Count + "개");
        System.out.println("4개 일치 (50,000원) - " + rank4Count + "개");
        System.out.println("5개 일치 (1,500,000원) - " + rank3Count + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + rank2Count + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + rank1Count + "개");
    }

    public void getRateOfReturn(int purchasePrice) {
        long totalWinningAmount = 0;

        totalWinningAmount += (long) rank1Count * LottoRankEnum.RANK_1.getAmount();
        totalWinningAmount += (long) rank2Count * LottoRankEnum.RANK_2.getAmount();
        totalWinningAmount += (long) rank3Count * LottoRankEnum.RANK_3.getAmount();
        totalWinningAmount += (long) rank4Count * LottoRankEnum.RANK_4.getAmount();
        totalWinningAmount += (long) rank5Count * LottoRankEnum.RANK_5.getAmount();

        if (purchasePrice == 0) return;

        double rate = (double) totalWinningAmount / purchasePrice * 100;
        printRateOfReturn(rate);
    }

    public void printRateOfReturn(double rate) {
        String result = String.format("%.1f", rate);
        System.out.println("총 수익률은 "+ result +"%입니다.");
    }
}
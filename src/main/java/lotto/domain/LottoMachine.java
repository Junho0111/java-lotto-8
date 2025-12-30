package lotto.domain;

import java.util.*;

public class LottoMachine {

    public static List<Integer> getLottoNumber() {
        List<Integer> lottoNumbers = new ArrayList<>();
        Random rand = new Random();

        while(lottoNumbers.size() < 6) {
            int lottoNum = rand.nextInt(45) + 1;

            if(!lottoNumbers.contains(lottoNum)) {
                lottoNumbers.add(lottoNum);
            }
        }

        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }
}

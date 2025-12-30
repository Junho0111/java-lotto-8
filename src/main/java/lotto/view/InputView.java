package lotto.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public static int setPurchasePrice() {
        System.out.println("구입금액을 입력해 주세요.");
        return sc.nextInt();
    }

    public static List<Integer> setWinningNumber() {
        System.out.println("당첨 번호를 입력해 주세요.");

        String[] setNumbers = sc.nextLine().split(",");
        List<Integer> numbers = new ArrayList<>();

        for (String part : setNumbers) {
            numbers.add(Integer.parseInt(part.trim()));
        }

        return numbers;
    }

    public static int setBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        return sc.nextInt();
    }
}

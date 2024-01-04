package coding_test.problem.lv1;

import java.util.stream.LongStream;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long longMoney = money;

        for (int i = 1; i <= count; i++) {
            longMoney -= price*i;
        }
        return longMoney <= 0 ? -longMoney : 0;
    }
}

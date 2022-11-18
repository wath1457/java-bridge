package bridge;

import java.util.regex.Pattern;

public class Validation {
    public static void isPositiveInteger(String bridgeSize) {
        String pattern = "^[^0]\\d*";
        if (!Pattern.matches(pattern, bridgeSize)) {
            throw new IllegalArgumentException("[ERROR} 다리 개수는 양의 정수이어야 합니다.");
        }
    }

    public static void isInRange(int bridgeSize) {
        if (!(3 <= bridgeSize && bridgeSize <= 20)) {
            throw new IllegalArgumentException("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
        }
    }
}

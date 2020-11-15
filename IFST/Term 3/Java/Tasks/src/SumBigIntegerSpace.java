import java.math.BigInteger;

public class SumBigIntegerSpace {
    public static void main(String[] args) {
        sumOf(args);
    }
    public static void sumOf(String... args) {
        BigInteger res = new BigInteger("0");
        for (String arg:args) {
            for (int i = 0; i < arg.length(); i++) {
                int j = i;
                while (j < arg.length()
                        && arg.charAt(j) != Character.SPACE_SEPARATOR
                        && !Character.isWhitespace(arg.charAt(j))
                        && (byte)arg.charAt(j) != (byte)-96) j++;
                if (j > i) res = res.add(new BigInteger(arg.substring(i, j)));
                i = j;
            }
        }
        System.out.println(res);
    }
}

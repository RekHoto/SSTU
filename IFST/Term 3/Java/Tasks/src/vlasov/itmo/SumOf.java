package vlasov.itmo;

public class SumOf {
    public static void sumOf(String... args) {
        int res = 0;
        for (String arg:args) {
            for (int i = 0; i < arg.length(); i++) {
                int j = i;
                while (j < arg.length() && !Character.isWhitespace(arg.charAt(j))) j++;
                if (j > i) res += Integer.parseInt(arg.substring(i, j));
                i = j;
            }
        }
        System.out.println(res);
    }
}

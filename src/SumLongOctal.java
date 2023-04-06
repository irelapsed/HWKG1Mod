public class SumLongOctal {

    public static long getNumber(StringBuilder sb) {
        char last = sb.charAt(sb.length() - 1);
        if (last == 'O' || last == 'o') {
            return Long.parseLong(sb.substring(0, sb.length() - 1), 8);
        }

        return Long.parseLong(sb.toString());
    }

    public static long sum(String s) {
        StringBuilder sb = new StringBuilder();
        long sum = 0;


        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else if (!sb.isEmpty()) {
                sum += getNumber(sb);
                sb.setLength(0);
            }
        }

        if (!sb.isEmpty()) {
            sum += getNumber(sb);
        }

        return sum;
    }

    public static void main(String[] args) {
        long sum = 0;

        for (String arg : args) {
            sum += sum(arg);
        }

        System.out.println(sum);
    }
}

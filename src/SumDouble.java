public class SumDouble {

    public static double sum(String s) {
        StringBuilder sb = new StringBuilder();
        double sum = 0;


        for(int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else if (!sb.isEmpty()) {
                sum += Double.parseDouble(sb.toString());
                sb.setLength(0);
            }
        }

        if (!sb.isEmpty()) {
            sum += Double.parseDouble(sb.toString());
        }

        return sum;
    }

    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            sum += sum(arg);
        }

        System.out.println(sum);
    }
}

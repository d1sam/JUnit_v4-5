public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String sumAnd : expression.split("\\+")) {
            sum += Integer.parseInt(sumAnd);
        }
        return sum;
    }
}

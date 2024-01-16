class Solution {

    private static String[] uppercaseAlphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static HashMap<Integer, String> charMap = new HashMap<>();

    public String convertToTitle(int columnNumber) {
        for (int i = 1; i <= uppercaseAlphabet.length; i++) {
            charMap.put(i, uppercaseAlphabet[i-1]);
        }
        return convertNumber(columnNumber);
    }

    private static String convertNumber(int val) {
        double column = (double) val / 26;
        int x = val - ((int) column) * 26;

        if (column > 1) {
            if (x == 0) {
                x = 26;
                column -= 1;
            }

            String title = charMap.get(x);
            return convertNumber((int) column) + title;
        } else return charMap.get(val);
    }
}
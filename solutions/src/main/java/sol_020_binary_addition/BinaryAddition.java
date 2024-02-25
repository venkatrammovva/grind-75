package sol_020_binary_addition;

// https://leetcode.com/problems/add-binary/
public class BinaryAddition {
    public String addBinary(String a, String b) {
        int ai = a.length() - 1, bi = b.length() - 1;

        StringBuilder sb = new StringBuilder();
        int c = 0;
        while(ai >= 0 || bi >= 0) {
            int currA = ai >= 0 ? a.charAt(ai) - '0': 0;
            int currB = bi >= 0 ? b.charAt(bi) - '0': 0;

            sb.append(sum(currA, currB, c));
            c = carry(currA, currB, c);
            System.out.println(c);
            ai--; bi--;
        }

        if(c != 0) {
            sb.append(c);
        }

        return sb.reverse().toString();
    }

    private int sum(int a, int b, int c) {
        return a ^ b ^ c;
    }

    private int carry(int a, int b, int c) {
        return (c & (a ^ b)) | (a & b);
    }
}

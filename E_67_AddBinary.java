// 22.10.2025
// https://leetcode.com/problems/add-binary/
// 67. Add Binary

public class E_67_AddBinary {
    /* 
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder("");
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i -= 1;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j -= 1;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
    */

    public static String addBinary(String a, String b) {
        int size = Math.max(a.length(), b.length());
        char[] res = new char[size + 1]; // 1 extra size for carry if there !!
        int i = a.length() - 1;
        int j = b.length() - 1;
        int k = res.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i -= 1;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j -= 1;
            }
            res[k] = (char) ((sum % 2) + '0');
            k -= 1;
            carry = sum / 2;
        }
        if (res[0] == '0') {
            return new String(res, 1, res.length - 1);
        }
        return new String(res);
    }

    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary(a1, b1));

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a2, b2));
    }
}

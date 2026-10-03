class Solution {
    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < chars.length) {

            int j = i;

            // Find end of current group
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            int count = j - i;

            sb.append(chars[i]);

            if (count > 1) {
                sb.append(count);
            }

            i = j;
        }

        // Copy compressed result back into chars
        for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }

        return sb.length();
    }
}
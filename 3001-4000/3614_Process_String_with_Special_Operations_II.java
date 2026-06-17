// Method - 1
class Solution {
    public char processStr(String s, long k) {

        char[] a = s.toCharArray();
        long totalLen = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '*') {
                if (totalLen >= 1)
                    totalLen -= 1;
            } else if (a[i] == '#') {
                totalLen = totalLen + totalLen;
            } else if (a[i] == '%') {

            } else {
                totalLen++;
            }
        }

        if (k >= totalLen)
            return '.';

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == '*') {
                totalLen += 1;
            } else if (a[i] == '#') {
                if (k >= totalLen / 2) {
                    k -= totalLen / 2;
                }
                totalLen = totalLen / 2;
            } else if (a[i] == '%') {
                k = (totalLen - 1) - k;
            } else {
                if (k == totalLen - 1) {
                    return a[i];
                }
                totalLen -= 1;
            }
        }
        return '.';
    }
}





// Method - 2
class Solution {
    public char processStr(String s, long k) {
        int n = s.length();

        long[] len = new long[n];
        long cur = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if ('a' <= c && c <= 'z') {
                cur++;
            }
            else if (c == '*') {
                if (cur > 0) {
                    cur--;
                }
            }
            else if (c == '#') {
                cur *= 2;
            }
            else { // '%'
                // length does not change
            }

            len[i] = cur;
        }

        if (k >= cur) {
            return '.';
        }

        for(int i = n-1; i >= 0; i--){
             char c = s.charAt(i);

            long before = (i == 0 ? 0 : len[i - 1]);
            long after = len[i];

            if ('a' <= c && c <= 'z') {
                if (k == before) {
                    return c;
                }
            }
            else if (c == '*') {
                // All surviving positions keep same index
                continue;
            }
            else if (c == '#') {
                if (k >= before) {
                    k -= before;
                }
            }
            else { // '%'
                k = after - 1 - k;
            }
        }
        return '.';
    }
}
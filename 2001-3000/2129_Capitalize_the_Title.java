// Method - 1
class Solution1 {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= 2) {
                words[i] = words[i].toLowerCase();
            } else {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words);
    }
}


// Method - 2
class Solution2 {
    public String capitalizeTitle(String title) {
        char[] charArr = title.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            int firstIndex = i;
            while (i < charArr.length && charArr[i] != ' ') {
                charArr[i] = Character.toLowerCase(charArr[i]);
                i++;
            }
            if (i - firstIndex > 2) {
                charArr[firstIndex] = Character.toUpperCase(charArr[firstIndex]);
            }
        }

        return new String(charArr);
    }
}
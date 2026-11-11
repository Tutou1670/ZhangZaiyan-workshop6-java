public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";

        // 按空格拆成单词数组
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();

            // 找出词尾的标点（非字母字符），倒序时保持它们在词尾
            int end = letters.length;
            while (end > 0 && !Character.isLetter(letters[end - 1])) {
                end--;
            }

            // 只把字母部分倒过来拼
            for (int j = end - 1; j >= 0; j--) {
                result.append(letters[j]);
            }
            // 标点原样放回词尾
            for (int j = end; j < letters.length; j++) {
                result.append(letters[j]);
            }
            // 单词之间补空格（最后一个单词后面不加）
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + result.toString());
    }
}

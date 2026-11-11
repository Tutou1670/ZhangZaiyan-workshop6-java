// 练习4：解密密文。密钥表：a->c, b->r, c->g ...（题目给出的 26 个字母对照表）
public class Exercise4 {
    public static void main(String[] args) {
        // 要解密的密文
        String codedMessage = "G tgsl Qefe.";
        // 密钥表：下标0对应'a'的解码结果，以此类推
        String key = "crgzavibsdoeqfhujxklwmynpt";

        System.out.println("Coded message:   " + codedMessage);

        // 存解码结果
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < codedMessage.length(); i++) {
            char c = codedMessage.charAt(i);
            // 小写字母：查表解码
            if (c >= 'a' && c <= 'z') {
                decoded.append(key.charAt(c - 'a'));
            }
            // 大写字母：先按小写查表，再转回大写
            else if (c >= 'A' && c <= 'Z') {
                decoded.append(Character.toUpperCase(key.charAt(c - 'A')));
            }
            // 空格、标点等非字母字符原样保留
            else {
                decoded.append(c);
            }
        }

        System.out.println("Decoded message: " + decoded.toString());
    }
}

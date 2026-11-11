// 练习5：简易搜索引擎——在一个段落数组里搜索短语，输出命中的下标和段落内容
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // 10 个段落（用题目给的示例）
        String[] paragraphs = {
            "Lose all the weight you want.",
            "I can't I must work",
            "That would be like a keyword search.",
            "This would be Victoria.",
            "Join the party.",
            "To be or not to be.",
            "That is a question to test keyword search.",
            "Can you find a needle in a hay stack?",
            "This could be the last paragraph, but its not.",
            "Ada Lovelace is the worlds first programmer as of 1860."
        };

        // 读取用户要搜索的短语
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the phrase to search: ");
        String phrase = scanner.nextLine();
        scanner.close();

        boolean found = false; // 记录是否至少命中一次

        // 逐个段落用 contains() 检查
        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].contains(phrase)) {
                found = true;
                System.out.println("Found at index " + i + ": " + paragraphs[i]);
            }
        }

        // 一个都没命中时给出提示
        if (!found) {
            System.out.println("The phrase was not found in any paragraph.");
        }
    }
}

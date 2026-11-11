public class Exercise1 {
    public static void main(String[] args) {
        // 存 10 首喜欢的歌名
        String[] songs = {
            "Bohemian Rhapsody", "Hotel California", "Imagine",
            "Hey Jude", "Yesterday", "Let It Be",
            "Stairway to Heaven", "Smells Like Teen Spirit",
            "Wonderwall", "Yellow"
        };
        // 存对应的歌手名
        String[] artists = {
            "Queen", "Eagles", "John Lennon",
            "The Beatles", "The Beatles", "The Beatles",
            "Led Zeppelin", "Nirvana",
            "Oasis", "Coldplay"
        };

        // 逐条输出：歌名 - 歌手
        System.out.println("My 10 favorite songs:");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        String[] songs = {
            "Bohemian Rhapsody", "Hotel California", "Imagine",
            "Hey Jude", "Yesterday", "Let It Be",
            "Stairway to Heaven", "Smells Like Teen Spirit",
            "Wonderwall", "Yellow"
        };
        String[] artists = {
            "Queen", "Eagles", "John Lennon",
            "The Beatles", "The Beatles", "The Beatles",
            "Led Zeppelin", "Nirvana",
            "Oasis", "Coldplay"
        };

        // 冒泡排序：按歌名比较（忽略大小写），同时交换歌名和歌手，保证配对不错位
        for (int i = 0; i < songs.length - 1; i++) {
            for (int j = 0; j < songs.length - 1 - i; j++) {
                if (songs[j].compareToIgnoreCase(songs[j + 1]) > 0) {
                    // 交换歌名
                    String tempSong = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = tempSong;
                    // 歌手也跟着一起换，保持对应关系
                    String tempArtist = artists[j];
                    artists[j] = artists[j + 1];
                    artists[j + 1] = tempArtist;
                }
            }
        }

        // 输出排序后的清单
        System.out.println("My 10 favorite songs (alphabetical order):");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}

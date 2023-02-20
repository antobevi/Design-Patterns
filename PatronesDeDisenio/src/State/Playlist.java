package State;

import java.util.List;

public class Playlist {
    private List<String> songs;
    private String previousSong;
    private String currentSong;
    private String nextSong;

    public String currentSong() {

        if(this.currentSong.isEmpty()) {
            this.currentSong = songs.get(0);
            this.nextSong = songs.get(1);
        }

        return this.currentSong;
    }

    public String nextSong(String currentSong) {

        if(currentSong.isEmpty()) {
            this.currentSong = songs.get(0);
            this.nextSong = songs.get(1);

        } else {
            Integer index = this.getIndexTo(currentSong);

            if(index == songs.size() - 1) {
                this.nextSong = songs.get(0);
            } else {
                this.nextSong = songs.get(index);
            }

        }

        return this.nextSong;
    }

    public String previousSong(String currentSong) {

        if(currentSong.isEmpty()) {
            this.currentSong = songs.get(0);
            this.nextSong = songs.get(1);
            this.previousSong = this.currentSong;

        } else {
            Integer index = this.getIndexTo(currentSong) - 1;
            this.previousSong = songs.get(index);
        }

        return this.nextSong;
    }

    public Integer getIndexTo(String song) {
        Integer index = 0;

        for(int i=0; i<songs.size(); i++) {
            if(songs.get(i) == song) {
                index = i;
            }
        }

        return index;
    }

}

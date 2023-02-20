package State.Context;

import State.States.LockedState;
import State.States.State;
import State.Playlist;
import State.UI.UserInterface;

// Contexto
public class AudioPlayer {
    private State state;
    private UserInterface UI;
    private Integer volume;
    private Playlist playlist;
    private String currentSong;
    private Boolean isPlaying;

    public AudioPlayer(Playlist playlist) {
        this.state = new LockedState(this);
        this.UI = new UserInterface();
        this.volume = 100;
        this.isPlaying = false;
        this.playlist = playlist;
        this.currentSong = playlist.currentSong();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public Playlist getPlaylist() {
        return this.playlist;
    }

    public Boolean play(Boolean state) {
        return this.isPlaying = state;
    }

    public Boolean isPlaying() {
        return this.isPlaying;
    }

    // Los metodos UI delegan la ejecucion al estado activo
    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }

    public void nextSong() {
        this.currentSong = playlist.nextSong(this.currentSong);
    }

    public void previousSong() {
        this.currentSong = playlist.previousSong(this.currentSong);
    }
    public void startPlayback() {}

    public void stopPlayback() {}

    public void rewind(Double time) {}

}

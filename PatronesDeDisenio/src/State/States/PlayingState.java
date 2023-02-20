package State.States;

import State.Context.AudioPlayer;

public class PlayingState extends State {

    public PlayingState(AudioPlayer player) {
        super(player);
    }

    public void clickLock() {
        if(player.isPlaying()) {
            player.changeState(new LockedState(player));
        } else {
            this.clickPlay();
        }
    }

    public void clickPlay() {
        player.startPlayback();
        player.changeState(this);
    }

    public void clickNext() {
        player.nextSong();
    }

    public void clickPrevious() {
        player.previousSong();
    }

}

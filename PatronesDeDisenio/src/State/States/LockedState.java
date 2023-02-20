package State.States;

import State.Context.AudioPlayer;

public class LockedState extends State {

    public LockedState(AudioPlayer player) {
        super(player);
    }

    public void clickLock() {
        if(player.isPlaying()) {
            player.changeState(this);
        } else {
            this.clickPlay();
        }
    }

    public void clickPlay() {
        player.changeState(new PlayingState(player));
    }

    public void clickNext() {
        // En pausa, no hace nada
    }

    public void clickPrevious() {
        // En pausa, no hace nada
    }

}

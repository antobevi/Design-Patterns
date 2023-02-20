package State.UI;

import State.Context.AudioPlayer;

public class PlayButton implements Button {

    public void onClick(AudioPlayer player) {
        player.clickPlay();
    }

}

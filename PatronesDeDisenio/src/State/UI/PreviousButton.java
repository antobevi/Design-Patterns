package State.UI;

import State.Context.AudioPlayer;

public class PreviousButton implements Button {

    public void onClick(AudioPlayer player) {
        player.clickPrevious();
    }

}

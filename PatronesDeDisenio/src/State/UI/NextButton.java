package State.UI;

import State.Context.AudioPlayer;

public class NextButton implements Button {

    public void onClick(AudioPlayer player) {
        player.clickNext();
    }

}

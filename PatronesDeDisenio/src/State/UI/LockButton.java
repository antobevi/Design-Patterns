package State.UI;

import State.Context.AudioPlayer;

public class LockButton implements Button {

    public void onClick(AudioPlayer player) {
        player.clickLock();
    }

}

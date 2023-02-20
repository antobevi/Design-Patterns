package State.States;

import State.Context.AudioPlayer;

// La clase estado base declara metodos que todos los estados concretos deben immplementar,
// y proporciona una referencia inversa al objeto de contexto asociado con el estado.
// Los estados pueden utilizar la referencia inversa para dirigir el contexto a otro estado.
public abstract class State {
    protected AudioPlayer player;

    // El CONTEXTO (AudioPlayer) se pasa a si mismo a traves del constructor del estado para ayudar
    // al estado a extraer informacion de contexto util si la necesita.
    public State(AudioPlayer player) {
        this.player = player;
    }

    public abstract void clickLock();
    public abstract void clickPlay();
    public abstract void clickNext();
    public abstract void clickPrevious();

}

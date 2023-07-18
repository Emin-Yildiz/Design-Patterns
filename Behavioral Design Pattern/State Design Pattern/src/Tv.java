public class Tv implements State{
    private State tvState;

    public void setState(State state){
        this.tvState = state;
    }

    public State getTvState(){
        return this.tvState;
    }
    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}

package com.designpatterns.state.abuse;

public class StopWatch {
//    private boolean isRunning;
    private State currentState = new StoppedState(this);
    public void click(){
        currentState.click();
//        if (isRunning){
//            isRunning = false;
//            System.out.println("Stopped .... ");
//        }else{
//            isRunning = true;
//            System.out.println("Running ... ");
//        }

    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}

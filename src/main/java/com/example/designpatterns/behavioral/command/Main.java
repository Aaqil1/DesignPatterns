package com.example.designpatterns.behavioral.command;

/**
 * Problem: Product wanted a remote control UI where buttons trigger actions.
 * Hard-wiring each button to device methods made it impossible to record and
 * replay button presses.
 *
 * Command encapsulates a request so invokers can queue, log, or replay it.
 */
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        RemoteControl remote = new RemoteControl();
        remote.press(new LightOnCommand(livingRoomLight));
        remote.press(new LightOffCommand(livingRoomLight));

        remote.replay();
    }
}

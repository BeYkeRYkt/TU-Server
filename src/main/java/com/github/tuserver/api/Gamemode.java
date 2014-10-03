package com.github.tuserver.api;

public enum Gamemode {

    UNKNOWN(-1), SURVIVAL(0), CREATIVE(1), ADVENTURE(2), SPECTATOR(3);

    private final int id;

    private Gamemode(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }
}

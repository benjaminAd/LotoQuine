package com.badolphe.utils;

public class Timer {
    private static Timer instance = null;
    private long time;

    private Timer() {
        this.time = 0;
    }

    public static Timer getInstance() {
        if (instance == null) {
            instance = new Timer();
        }
        return instance;
    }

    public void beginTimer() {
        this.time = System.currentTimeMillis();
    }

    public void pauseTimer() {
        this.time = System.currentTimeMillis() - this.time;
    }

    public void resumeTimer() {
        this.time += System.currentTimeMillis();
    }

    public String stopAndShowTimer() {
        pauseTimer();
        return this.toString();
    }

    public long getTime() {
        return this.time;
    }

    public long TimeToSec() {
        return this.time / Constantes.CONVERT_MS_TO_SEC;
    }

    @Override
    public String toString() {
        return String.format("Le temps total est de %d secondes", TimeToSec());
    }
}

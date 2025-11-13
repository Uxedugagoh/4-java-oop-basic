package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.fixFormat();
    }

    public void fixFormat() {
        this.minutes += this.seconds / 60;
        this.seconds = this.seconds % 60;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    public void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
        this.fixFormat();
    }

    public void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
        fixFormat();
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}

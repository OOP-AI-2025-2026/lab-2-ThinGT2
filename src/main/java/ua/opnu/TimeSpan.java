package ua.opnu;


public class TimeSpan {
    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            this.hours = 0;
            this.minutes = 0;
            return;
        }
            this.hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }
    

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            return;
        }
        this.hours += hours;
        this.minutes += minutes;

        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
    }

    void addTimeSpan(TimeSpan timespan) {
        if (timespan == null) {
            return;
        }
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        if (span == null) return;

        int totalThis = getTotalMinutes();
        int totalOther = span.getTotalMinutes();

        if (totalOther > totalThis) {
            return;
        }

        int diff = totalThis - totalOther;
        hours = diff / 60;
        minutes = diff % 60;
    }

    void scale(int factor) {
        if (factor <= 0) {
            return;
        }

        int total = getTotalMinutes() * factor;
        hours = total / 60;
        minutes = total % 60;
    }
}

package Lab3.task5;

public class Time implements Comparable<Time>{
    int hour, minute, second;

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Некорректный ввод времени");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversal() {
        return String.format("Universal: %02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int displayHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("Standard: %02d:%02d:%02d %s", displayHour, minute, second, period);
    }

    public void add(Time t) {
        this.second += t.getSecond();
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += t.getMinute();
        this.hour += this.minute / 60;
        this.minute %= 60;

        this.hour += t.getHour();
        this.hour %= 24;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    @Override
    public int compareTo(Time t) {
        int thisTotalSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        int otherTotalSeconds = t.hour * 3600 + t.minute * 60 + t.second;

        return Integer.compare(thisTotalSeconds, otherTotalSeconds);
    }
}

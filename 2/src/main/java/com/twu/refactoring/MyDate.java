package com.twu.refactoring;

public class MyDate {
    private final int start;
    private final int end;
    private final String stringIndexOutOfBoundsException;
    private final String numberFormatException;
    private final int min;
    private final int max;
    private final String illegalArgumentException;

    public MyDate(int start, int end, String stringIndexOutOfBoundsException, String numberFormatException, int min, int max, String illegalArgumentException) {
        this.start = start;
        this.end = end;
        this.stringIndexOutOfBoundsException = stringIndexOutOfBoundsException;
        this.numberFormatException = numberFormatException;
        this.min = min;
        this.max = max;
        this.illegalArgumentException = illegalArgumentException;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getStringIndexOutOfBoundsException() {
        return stringIndexOutOfBoundsException;
    }

    public String getNumberFormatException() {
        return numberFormatException;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getIllegalArgumentException() {
        return illegalArgumentException;
    }
}

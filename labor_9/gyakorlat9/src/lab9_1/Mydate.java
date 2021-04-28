package lab9_1;

public class Mydate implements Comparable<Mydate>{

    private int year = -1;
    private int month = -1;
    private int day = -1;

    public Mydate(int year, int month, int day) {
        if (DateUtil.isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public boolean isValid() {
        return this.year != -1;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", this.year, this.month, this.day);
    }

    @Override
    public int compareTo(Mydate o) {
        //this <-> o
        // < 0 => megfelelo sorrend
        // > 0 => nem megfelelo sorrend
        // 0 => egyenertekuek, default

        //datumok alap ossszehasonlitasa
        if(this.year != o.year ){
            return o.year - this.year;
        }
        if (this.month != o.month) {
            return o.month - this.month;
        }
        if(this.day != o.day){
            return o.day - this.day;
        }

        return 0;
    }
}

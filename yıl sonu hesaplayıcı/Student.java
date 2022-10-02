public class Student {
    private int TC;
    private String name;
    private int vize;
    private int Final;
    private int day;
    private int month;
    private int year;

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        if (vize > 100) {
            System.out.println("hatalı vize notu girdiniz");
        } else {
            this.vize = vize;
        }
    }

    public int getFinal() {
        return Final;
    }

    public void setFinal(int Final) {
        if (Final > 100) {
            System.out.println("hatalı final notu girdiniz");
        } else {
            this.Final = Final;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 31) {
            System.out.println("hatalı gün girdiniz");
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12) {
            System.out.println("hatalı ay girdiniz");
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2023) {
            System.out.println("hatalı yıl girdiniz");
        } else {
            this.year = year;
        }
    }

    public void showInfos() {

        System.out.println("TC:" + TC);
        System.out.println("Name:" + name);
        System.out.println("old:" + (2022 - year) + "year" + (12 - month) + "month" + (31 - day) + "day");
        System.out.println("Vize:" + vize);
        System.out.println("Final:" + Final);
        System.out.println("YEAR-END GRADE:" + ((vize * 0.4) + (Final * 0.6)));


    }


}

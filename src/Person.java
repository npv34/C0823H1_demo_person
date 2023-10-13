package src;

import java.time.LocalDate;

public class Person {
    public String name;
    public String birthDay;

    public Person(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public int getAge() {
        int yearBirthDay = getYearBirthDay();

        int currentYear = this.getCurrentYear();

        return currentYear - yearBirthDay;
    }

    private int getCurrentYear() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    private int getYearBirthDay() {
        LocalDate dateBirthday = LocalDate.parse(this.birthDay);
        return dateBirthday.getYear();
    }

    public String celebrateBirthday() {
        LocalDate dateBirthday = LocalDate.parse(this.birthDay);
        int monthBirthday = dateBirthday.getMonthValue();
        int dayBirthday = dateBirthday.getDayOfMonth();

        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();

        int currentYear = getCurrentYear();
        if(currentMonth == monthBirthday
                && currentDay >= dayBirthday
                || currentMonth > monthBirthday ) {
            currentYear++;
        }

        return currentYear + "-" +monthBirthday+ "-" + dayBirthday;
    }
}

package lt.gintare.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestClasWork {
    // ar 4 yra lyginis skaicius

    public static int ar4LyginisSkaicius(int a, int b) {
        return 4 / 2;
    }

    // dabar yra 19 valanda

    @Test
    public void testTimeNowIfNowIs19Hours() {

        int timeNow = LocalTime.now().getHour();
        int expectedResult = 19;
        int actualResult = timeNow;

        Assert.assertEquals(actualResult, expectedResult);
    }

    // testas "zalias" jei 995  dalijasi is 3 (be liekanos)

    @Test

    public void testIf995IsDivideWith3AndReminder0() {

        int expectedResult = 0;
        int actualResult;
        int inputNumber = 995;

        actualResult = inputNumber % 3;

        Assert.assertEquals(actualResult, expectedResult);
    }

    // ar siandien treciadienis
    @Test
    public void testIfTodayIsWednesday() {

        DayOfWeek expectedResult = DayOfWeek.FRIDAY;
        DayOfWeek actualResult;

        actualResult = LocalDateTime.now().getDayOfWeek();

        System.out.println(LocalDateTime.now().getDayOfWeek());

        Assert.assertEquals(actualResult, expectedResult);
    }
}

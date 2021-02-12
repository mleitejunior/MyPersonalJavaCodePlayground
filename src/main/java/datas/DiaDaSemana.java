package datas;

import org.junit.Assert;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Calendar;

public class DiaDaSemana {

    @Test
    public void verificaDiaDaSemana() {

        Calendar cal = Calendar.getInstance();
        cal.setTime(Calendar.getInstance().getTime());
        int today = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(today);

        Assert.assertEquals(6, today);
    }

    @Test
    public void verificaDiaDaSemanaUsandoLocalDate() {

        LocalDate today = LocalDate.now(ZoneOffset.UTC);
        String todayAsDayOfWeek = today.getDayOfWeek().toString();
        System.out.println(todayAsDayOfWeek);
        Assert.assertEquals("FRIDAY", todayAsDayOfWeek);
        Assert.assertEquals(DayOfWeek.FRIDAY, today.getDayOfWeek());
    }
}

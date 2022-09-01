import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlarmTest {

    @Test
    void alarmTest29rot() {

        //given
        int numb = 29;
        String level = "rot";

        //when

        String actual = Alarm.alarmstufe(level, numb);

        //then
       assertEquals("Zu viele Personen", actual);

    }

    @Test
    void alarmTest31gelb() {

        //given
        int numb = 31;
        String level = "gelb";

        //when

        String actual = Alarm.alarmstufe(level, numb);

        //then
        assertEquals("Zu viele Personen", actual);

    }

    @Test
    void alarmTest30gelb() {

        //given
        int numb = 30;
        String level = "gelb";
        //when
        String actual = Alarm.alarmstufe(level, numb);
        //then
        assertEquals("Maximale Personenzahl nicht ueberschritten", actual);

    }

    @Test
    void alarmTest60green() {

        //given
        int numb = 60;
        String level = "green";
        //when
        String actual = Alarm.alarmstufe(level, numb);
        //then
        assertEquals("Maximale Personenzahl nicht ueberschritten", actual);

    }

    @Test
    void alarmTest61green() {

        //given
        int numb = 61;
        String level = "green";
        //when
        String actual = Alarm.alarmstufe(level, numb);
        //then
        assertEquals("Zu viele Personen", actual);

    }

    @Test
    void alarmTest31() {

        //given
        int numb = 31;
        int max = 30;
        //when
        String actual = Alarm.alarm(numb, max);
        //then
        assertEquals("Zu viele Personen", actual);

    }
    @Test
    void alarmTest30() {

        //given
        int numb = 30;
        int max = 30;
        //when
        String actual = Alarm.alarm(numb, max);
        //then
        assertEquals("Maximale Personenzahl nicht ueberschritten", actual);

    }
}

package ru.netology;

import java.util.*;
import java.text.*;

import static java.lang.System.*;

public class CardDelivery {
    public String date() {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();

        //дату в календарь
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //+ 7 дней
        c.add(Calendar.DATE, 7);

        //календарь в дату
        Date currentDatePlusOne = c.getTime();
        String result = formatForDateNow.format(currentDatePlusOne);
        return result;

    }
}

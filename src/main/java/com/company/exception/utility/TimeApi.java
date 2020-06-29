package com.company.exception.utility;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeApi {

    public static ZonedDateTime getZonedDateTime(){
        LocalDateTime localDateTime=LocalDateTime.now();
        ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Baku"));

        return zonedDateTime;
    }
}

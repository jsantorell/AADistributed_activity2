/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.SalutationService;

import java.util.*;

/**
 *
 * @author jerem
 */
public class SalutationServiceWelcome implements SalutationService{

    @Override
    public String getGreeting() {

        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);

            //int hours = 10; // For Testing

        String greeting = "Good Morning";

        if (hours > 11 && hours < 19) {

            greeting = "Good Afternoon";
        } else if (hours >= 19 && hours < 23) {

            greeting = "Good Evening";
        }

        return greeting;

    }

}

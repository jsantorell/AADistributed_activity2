/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DateService;

import model.SalutationService.*;
import java.util.*;

/**
 *
 * @author jerem
 */
public class DateService{

    
    public int getHours() {

        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);

        return hours;

    }

}

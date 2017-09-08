/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.SalutationService;

import java.util.*;
import model.DateService.DateService;

/**
 *
 * @author jerem
 */
public class SalutationServiceWelcome implements SalutationService{

    private DateService ds = new DateService();
    
    @Override
    public String getGreeting() {

            int hours = ds.getHours();

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

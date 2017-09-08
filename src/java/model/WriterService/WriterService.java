/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WriterService;

import model.SalutationService.SalutationServiceWelcome;
import model.InputService.InputService;

/**
 *
 * @author jerem
 */
public interface WriterService {
    
        public abstract String outputMessage(SalutationServiceWelcome w, InputService m, String name);


    
    
}

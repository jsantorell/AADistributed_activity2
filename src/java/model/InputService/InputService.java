/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.InputService;

/**
 * A Service that sets a message up to be displayed from stored properties 
 * @author jerem
 */
public interface InputService {
    
    
    public abstract String getInput(String name);
    
    
}

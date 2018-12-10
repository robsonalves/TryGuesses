/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guesses.Model;

import java.util.List;

/**
 *
 * @author andro
 */
public interface IGuessesModel {
    /**
     *
     * @return
     */
    public List<GuessesModel> tryGuessUserThought();
    public void add(GuessesModel item);
    
}

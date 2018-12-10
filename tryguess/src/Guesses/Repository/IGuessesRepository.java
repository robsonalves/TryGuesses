/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guesses.Repository;

import Guesses.Model.GuessesModel;
import java.util.List;

/**
 *
 * @author andro
 */
public interface IGuessesRepository {
    public void add(GuessesModel item);
    public List<GuessesModel> getAll();
    public void Remove(GuessesModel item);
}

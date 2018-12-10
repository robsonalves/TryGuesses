/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guesses.Repository;

import Guesses.Model.GuessesModel;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author andro
 */
public final class GuessesRepository implements IGuessesRepository {
    
    private static List<GuessesModel> _listGuess;

    public GuessesRepository() {
        if (_listGuess == null)
            _listGuess = new ArrayList<>();
    }

    @Override
    public void add(GuessesModel item) {
        if (_listGuess.size() <= 0)
            _listGuess.add(item);
        else
            _listGuess.add(_listGuess.size() -1, item);
    }

    @Override
    public List<GuessesModel> getAll() {
        return _listGuess;
    }

    @Override
    public void Remove(GuessesModel item) {
        _listGuess.remove(item);
    }
}

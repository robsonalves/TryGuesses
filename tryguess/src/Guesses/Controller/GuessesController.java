/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guesses.Controller;

import Guesses.Model.GuessesModel;
import Guesses.View.GuessesView;
import java.util.List;

/**
 *
 * @author andro
 */
public class GuessesController {
    private final GuessesModel _guessesModel;
    private final GuessesView _view;
    
    
    public GuessesController(GuessesView view, GuessesModel model){
         _guessesModel = model;
         _view = view;
    }
    
    private List<GuessesModel> ListGuesses(){
        return _guessesModel.tryGuessUserThought();
    }
    
    public void tryGuessUserThought(){
        List<GuessesModel> list = ListGuesses();
        
        if (list != null && !list.isEmpty()){
            _view.tryGuessUserThought(list);            
        }
    } 
    public void add(String option, String details){
        GuessesModel obj = new GuessesModel();
        obj.option = option;
        obj.details = details;
        
        _guessesModel.add(obj);
    }
}

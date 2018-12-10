/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guesses.Model;

import Guesses.Repository.GuessesRepository;
import Guesses.Repository.IGuessesRepository;
import java.util.List;

/**
 *
 * @author robson.alves
 */
public class GuessesModel implements IGuessesModel {
    
    private final IGuessesRepository _guessRepository;
    public String option = "";
    public String details = "";
    
    
    public GuessesModel(){
        _guessRepository = new GuessesRepository();
    }

    @Override
    public List<GuessesModel> tryGuessUserThought(){   
        FillData();
        List<GuessesModel> listGuesses = getGuesses();        
        return listGuesses;
    }
        
    private List<GuessesModel> getGuesses(){
        return _guessRepository.getAll();
    }
    
    private void FillData(){
        
        List<GuessesModel> list = getGuesses();
        
        if (list.size() <= 0){
            
            GuessesModel model1 = new GuessesModel();
            model1.option = "Bolo de Chocolate";
            model1.details = "";

            _guessRepository.add(model1);
            GuessesModel model2 = new GuessesModel();
            model2.option = "massa";
            model2.details = "lasanha";
            _guessRepository.add(model2);
        }
    }

    @Override
    public void add(GuessesModel item) {
        _guessRepository.add(item);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guesses.View;

import Guesses.Controller.GuessesController;
import Guesses.Model.GuessesModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andro
 */
public class GuessesView {
    
    GuessesModel _model;
    GuessesController _controller;
    
    /**
     *
     * @param list
     */
    public void tryGuessUserThought(List<GuessesModel> list){
        
        for(GuessesModel item : list){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "O prato que você pensou é " + item.option + " ?","Warning",dialogButton);

            if(dialogResult == JOptionPane.YES_OPTION && !item.details.isEmpty()) {
                 dialogResult = JOptionPane.showConfirmDialog (null, "O prato que você pensou é " + item.details + " ?","Warning",dialogButton);

                 if (dialogResult == JOptionPane.YES_OPTION) {
                     correctGuess();
                     break;
                 }
                 else
                 {
                    CreateNewOption(item.details);
                 }
             }
            else if (dialogResult == JOptionPane.YES_OPTION && item.details.isEmpty()){
                 correctGuess();
                 break;
             }
            else if (dialogResult == JOptionPane.NO_OPTION && item.details.isEmpty())
            {
                CreateNewOption(item.option);
            }
        }
    }
    
    public void correctGuess(){
         JOptionPane.showMessageDialog(null, "Acertei novamente");
    }
    
    public void Startup(){
        _model = new GuessesModel();
        _controller = new GuessesController(this, _model);
        _controller.tryGuessUserThought();
    }
    
    public void CreateNewOption(String details){
        String answer1 = JOptionPane.showInputDialog("Qual prato você pensou:  ");
        String answer2 = JOptionPane.showInputDialog(answer1 + " é ________ , mas " + details + " não");

        _controller.add(answer1, answer2);
}
}

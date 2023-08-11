package com.example;

import java.util.ArrayList;
import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML TextArea txtNome;
    @FXML TextArea TxtAlunos;

    ArrayList<String> alunos = new ArrayList<>();


   public void adicionarAluno(){
       alunos.add(txtNome.getText());
        txtNome.clear();
        atualizarTela();
      }

      public void atualizarTela(){
        ordenar();
        TxtAlunos.clear();
        for (var aluno: alunos){
            TxtAlunos.appendText(aluno + "\n");

        }

      }

      private void ordenar(){
        //anonymous class
        alunos.sort( (o1,o2) -> o1.compareToIgnoreCase(o1) );
    }
}

//inner class


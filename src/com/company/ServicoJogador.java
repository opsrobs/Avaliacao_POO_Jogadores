package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class ServicoJogador {

    public String capNomeJogador(){
        return JOptionPane.showInputDialog("Informe o nome do Jogador: ");
    }

    public float capSalarioJogador(String jog){
        return Float.parseFloat(JOptionPane.showInputDialog("Informe o Salário do "+jog+": "));
    }




    public String capSituacaoJogador(){
        int situacaoJog;
        String situacao;
        do {
            situacaoJog= Integer.parseInt(JOptionPane.showInputDialog("Informe a situação do jogador: \n\t[0]RESERVA \n\t[1]TITULAR"));

            situacao=String.valueOf(situacaoJog);
            if (situacaoJog==0)
                situacao="Reserva!";
            else
                situacao="Titular";
        }while (situacaoJog>1);

        return situacao;

    }


}

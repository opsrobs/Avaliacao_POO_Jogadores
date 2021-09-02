package com.company;
import javax.swing.*;

import static com.company.Clube.*;
import static com.company.ServicoClube.*;

public class Main {

    public static void main(String[] args) {
        ServicoClube servicoClube =new ServicoClube();
        String nome= JOptionPane.showInputDialog("Informe o nome do time");
        String cidade=JOptionPane.showInputDialog("Informe o nome da cidade: ");

        while (nome != "sair"){
            servicoClube.gravarClube(nome,cidade);

        }

    }
}

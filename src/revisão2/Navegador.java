/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisão2;

import java.util.ArrayList;

/**
 *
 * @author bruno.191196
 */
public class Navegador implements Interrompivel{
  ArrayList<Aba> listaDeAbas = new ArrayList<>();
  ArrayList<String> historico = new ArrayList<>();
  
  public void abrirAba(String url, TipoAba tipo){
    if (tipo==TipoAba.ANONIMA) {
      listaDeAbas.add(new AbaAnonima(this));
    } else {
      listaDeAbas.add(new AbaRegular(this));
      historico.add(url);
    }
  }
  
  @Override
  public void interrompe(){
    System.out.println("Escrevendo em um arquivo a lista de todas urls abertas:");
    for (int i=0; i<listaDeAbas.size(); i++) {
      if (listaDeAbas.get(i) instanceof AbaRegular) {
        System.out.println(listaDeAbas.get(i).getUrl());
      }
    }
  }
  
  @Override
  public void retoma(){
    System.out.println("abrindo urls fechadas anteriormente.");
  }
}

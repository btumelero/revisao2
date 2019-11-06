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
public abstract class Aba {
  static int numeroDeAbas=0;
  protected String url;
  protected ArrayList<String> historicoLocal = new ArrayList<>();
  
  public abstract String getUrl();
  
  public void visitarPagina(String urlNova){
    historicoLocal.add(url);
    url=urlNova;
  }
  
  public final void recarrega(){
    System.out.println("Recarregando Página");
  }
  
  Aba(Navegador navegador){
    numeroDeAbas++;
  }
}

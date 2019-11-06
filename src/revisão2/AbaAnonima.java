/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisão2;

/**
 *
 * @author bruno.191196
 */
public class AbaAnonima extends Aba{
  
  @Override
  public String getUrl(){
    return "Aba anônima, url secreta";
  }
  
  AbaAnonima(Navegador navegador){
    super(navegador);
  }
}

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
public class AbaRegular extends Aba{
  Navegador navegador = new Navegador();
  
  @Override
  public String getUrl(){
    return url;
  }
  
  @Override
  public void visitarPagina(String urlNova) {
    super.visitarPagina(urlNova);
    navegador.historico.add(historicoLocal.get((historicoLocal.size()-1)));
  }
  
  AbaRegular(Navegador navegador){
    super(navegador);
    this.navegador = navegador;
  }
}

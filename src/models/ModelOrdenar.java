/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.DefaultListModel;

/**
 *
 * @author zeo
 */
public class ModelOrdenar {
    private DefaultListModel<String> valores;

    public DefaultListModel<String> getValores() {
        return valores;
    }

    public void setValores(DefaultListModel<String> valores) {
        this.valores = valores;
    }
    
    public void ordernarAscendente(){
        int size = valores.getSize();
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                int foo = Integer.parseInt(valores.elementAt(i));
                int bar = Integer.parseInt(valores.elementAt(j));
                if(foo > bar){
                    int tmp = foo;
                    foo = bar;
                    bar = tmp;
                }
                valores.setElementAt(String.valueOf(foo), i);
                valores.setElementAt(String.valueOf(bar), j);
            }
        }
    }
    public void ordernarDescendente(){
        int size = valores.getSize();
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                int foo = Integer.parseInt(valores.elementAt(i));
                int bar = Integer.parseInt(valores.elementAt(j));
                if(foo < bar){
                    int tmp = foo;
                    foo = bar;
                    bar = tmp;
                }
                valores.setElementAt(String.valueOf(foo), i);
                valores.setElementAt(String.valueOf(bar), j);
            }
        }
    }
}

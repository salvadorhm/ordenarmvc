/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.DefaultListModel;
import models.ModelOrdenar;
import views.ViewOrdenar;

/**
 *
 * @author zeo
 */
public class ControllerOrdenar {
    
    ModelOrdenar modelAscendente;
    ViewOrdenar viewOrdenar;
    DefaultListModel<String> valores = new DefaultListModel<>();
    
    public ControllerOrdenar(ModelOrdenar modelAscendente, ViewOrdenar viewAscendente){
        this.modelAscendente = modelAscendente;
        this.viewOrdenar = viewAscendente;
        this.viewOrdenar.jbtn_agregar.addActionListener(e -> jtbn_agregar_clic());
        this.viewOrdenar.jbtn_ascendente.addActionListener(e -> jtbn_ascendente_clic());
        this.viewOrdenar.jbtn_descendente.addActionListener(e -> jtbn_descendente_clic());
        this.viewOrdenar.jlst_valores.setModel(valores);
    }

    private void jtbn_agregar_clic() {
        valores.addElement(viewOrdenar.jtf_valor.getText());
        viewOrdenar.jtf_valor.setText("");
        viewOrdenar.jtf_valor.setFocusable(true);
    }

    private void jtbn_ascendente_clic() {
        modelAscendente.setValores(valores);
        modelAscendente.ordernarAscendente();
        valores = modelAscendente.getValores();
    }

    private void jtbn_descendente_clic() {
        modelAscendente.setValores(valores);
        modelAscendente.ordernarDescendente();
        valores = modelAscendente.getValores();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import models.ModelMain;
import views.ViewOrdenar;
import views.ViewMain;


/**
 *
 * @author zeo
 */
public class ControllerMain {
    ModelMain modelMain;
    ViewOrdenar viewOrdenar;
    ViewMain viewMain;
    
    public ControllerMain( ModelMain modelMain, ViewMain viewMain, ViewOrdenar viewAscendente){
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        this.viewOrdenar = viewAscendente;
        this.viewMain.jbtn_ascendente.addActionListener(e -> jbtn_ascendente_clic());
        initView();
    }
    
    private void initView(){
        this.viewMain.setVisible(true);
    }

    private void jbtn_ascendente_clic() {
        viewMain.setContentPane(viewOrdenar);
        viewMain.revalidate();
        viewMain.repaint();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.ModelOrdenar;
import models.ModelMain;

import views.ViewOrdenar;
import views.ViewMain;

import controllers.ControllerOrdenar;
import controllers.ControllerMain;

/**
 *
 * @author zeo
 */
public class Main {
    
    private static ModelOrdenar modelOrdenar;
    private static ModelMain modelMain;
    
    private static ViewOrdenar viewAscendente;
    private static ViewMain viewMain;
    
    private static ControllerOrdenar controllerOrdenar;
    private static ControllerMain controllerMain;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelOrdenar = new ModelOrdenar();
        viewAscendente = new ViewOrdenar();
        controllerOrdenar = new ControllerOrdenar(modelOrdenar, viewAscendente);
        
        modelMain = new ModelMain();
        viewMain = new ViewMain();
        controllerMain = new ControllerMain(modelMain, viewMain, viewAscendente);
    }
}

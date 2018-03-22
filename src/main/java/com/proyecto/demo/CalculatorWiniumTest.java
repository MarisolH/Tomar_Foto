/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.demo;
import java.io.File;
/**
 *
 * @author mhernandez
 */
public class CalculatorWiniumTest {
    static  WiniumDriver driver = null;
    static WiniumDriverService service=null;
    static  DesktopOptions option=null;
    
    public static void setUpEnviroment() throws IOException{
        option =new DesktopOptions();
        option.setSetApplicationPath("");//ruta de la Calculadora
        File driverPath=new File("");//Ruta del Driver de Winium
        service= new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).builDesktopSevice();
        service.start();
        
        
    }
    public void startDriver(){
        driver= new WiniumDriver(service, option);//
    }
    
    public void selectScientificViewNumbersTest() throws InterruptedException{
        WebElement calcFrame=driver.findElement(By.className("CalcFrame"));
        WebElement menu =calcFrame.findElement(By.id("MenuBar"));
        WebElemnt viewMenu = menu.findElement(By.name("View"));
        viewMenu.click();
        viewMenu.findElement(By.name("Scientific")).click();
        wait(2000);
        calcFrame.findElement(By.id("132")).click();
        wait(2000);
    }
    
}

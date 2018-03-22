/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.demo;

import com.github.sarxos.webcam.Webcam;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author mhernandez
 */
public class TakePictureExample {
    public static void main(String[] args) throws IOException {

		// get default webcam and open it
		Webcam webcam = Webcam.getDefault();
		webcam.open(true);

		// get image
		BufferedImage image = webcam.getImage();

		// save image to PNG file
		ImageIO.write(image, "PNG", new File("test.png"));
}
    
}

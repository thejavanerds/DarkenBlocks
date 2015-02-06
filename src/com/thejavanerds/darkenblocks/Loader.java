package com.thejavanerds.darkenblocks;

import java.applet.Applet;
import javax.swing.*;

/**
 * Created by ZhsCraft on 2/6/2015.
 */
public class Loader extends Applet {

    public static int ClientHeight = 720;
    public static int ClientWidth = 1280;

    public static void main(String[] args) {
        Loader loader = new Loader();

        JFrame frame = new JFrame("Darken Blocks 0.0.1");
        frame.setLocation(ClientWidth, ClientHeight);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        loader.start();
    }
}

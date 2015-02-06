package com.thejavanerds.darkenblocks;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

/**
 * Created by ZhsCraft on 2/6/2015.
 */
public class Loader extends Applet implements Runnable {

    public static int ClientHeight = 720;
    public static int ClientWidth = 1280;

    public int camX, camY;

    public Image screen;
    private boolean running = false;

    public void Update() {

    }

    public void Draw() {
        Graphics g = screen.getGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, ClientWidth, ClientHeight);

        world.Draw(g);

        g = getGraphics();

        g.drawImage(screen, 0, 0, ClientWidth, ClientHeight, null);
        g.dispose();
    }

    public World world;

    public void myInit() {
        world = new World();
    }

    public static void main(String[] args) {
        Loader loader = new Loader();

        JFrame frame = new JFrame("Darken Blocks 0.0.1");

        frame.add(loader);
        frame.setSize(Loader.ClientWidth, Loader.ClientHeight);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        loader.start();
    }

    public void start() {
        myInit();
        running = true;
        new Thread(this).start();
    }

    public void stop() {
        running = false;
    }

    public void run() {
        screen = this.createVolatileImage(ClientWidth, ClientHeight);

        while (running) {
            try {
                Update();
                Draw();
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

package com.thejavanerds.darkenblocks;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ZhsCraft on 2/6/2015.
 */
public class World {

    public ArrayList<Chunk> chunks = new ArrayList<Chunk>();

    public World()
    {
        chunks.add(new Chunk(0,1));
    }

    public void Draw(Graphics g) {

    }
}

package com.blockapp.wall.Wall.Api.Model;

import com.blockapp.wall.Wall.Api.Block;
import com.blockapp.wall.Wall.Api.CompositeBlock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {
    Wall wall;

    BlockModel blockModel1;
    BlockModel blockModel2;
    BlockModel blockModel3;
    BlockModel blockModel4;
    BlockModel blockModel5;
    BlockModel blockModel6;

    CompositeBlockModel compositeBlock1;
    CompositeBlockModel compositeBlock2;

    @BeforeEach
    void setUp() {
        blockModel1 = new BlockModel("brick", "red");
        blockModel2 = new BlockModel("wood", "brown");
        blockModel3 = new BlockModel("brick", "black");
        blockModel4 = new BlockModel("wood", "white");
        blockModel5 = new BlockModel("wood", "red");
        blockModel6 = new BlockModel("brick", "brown");

        List<BlockModel> blockModels1 = new ArrayList<>();
        blockModels1.add(blockModel1);
        blockModels1.add(blockModel2);
        blockModels1.add(blockModel3);

        List<BlockModel> blockModels2 = new ArrayList<>();
        blockModels1.add(blockModel4);
        blockModels1.add(blockModel5);
        blockModels1.add(blockModel6);

        compositeBlock1 = new CompositeBlockModel(blockModels1);

        compositeBlock2 = new CompositeBlockModel(blockModels2);
        List<CompositeBlock> compositeBlocks = new ArrayList<>();
        compositeBlocks.add(compositeBlock1);
        compositeBlocks.add(compositeBlock2);

        wall = new Wall(compositeBlocks);
    }

    @Test
    void findBlockByColor() {
        Optional<BlockModel> blockModel = wall.findBlockByColor("red");

        assertEquals("red", blockModel.get().getColor());
    }

    @Test
    void findBlocksByMaterial() {
        List<Block> blockModels = wall.findBlocksByMaterial("brick");

        assertEquals(3, blockModels.size());
        assertEquals("brick", blockModels.get(0).getMaterial());
    }

    @Test
    void count() {
        int size = wall.count();

        assertEquals(6, size);
    }
}
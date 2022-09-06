package com.blockapp.wall.Wall.Api.Model;

import com.blockapp.wall.Wall.Api.CompositeBlock;
import com.blockapp.wall.Wall.Api.Exception.BlockNotFoundException;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CompositeBlockImpl implements CompositeBlock {
    private final List<BlockModel> blocks;

    @Override
    public String getColor() {
        return this.blocks.stream()
                .map(BlockModel::getColor)
                .findAny()
                .orElseThrow(() -> {
                    throw new BlockNotFoundException("Block not found!");
                });
    }

    @Override
    public String getMaterial() {
        return this.blocks.stream()
                .map(BlockModel::getMaterial)
                .findAny()
                .orElseThrow(() -> {
                    throw new BlockNotFoundException("Block not found!");
                });
    }

    @Override
    public List<BlockModel> getBlocks() {
        return this.blocks;
    }
}

package com.blockapp.wall.Wall.Api.Model;

import com.blockapp.wall.Wall.Api.CompositeBlock;

import java.util.List;

public record CompositeBlockModel(List<BlockModel> blocks) implements CompositeBlock {
    @Override
    public String getColor() {
        return this.blocks.stream()
                .map(BlockModel::getColor)
                .findAny()
                .get();
    }

    @Override
    public String getMaterial() {
        return this.blocks.stream()
                .map(BlockModel::getMaterial)
                .findAny()
                .get();
    }
}

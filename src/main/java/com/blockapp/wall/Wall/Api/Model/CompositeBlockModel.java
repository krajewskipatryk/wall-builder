package com.blockapp.wall.Wall.Api.Model;

import com.blockapp.wall.Wall.Api.CompositeBlock;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@RequiredArgsConstructor
public class CompositeBlockModel implements CompositeBlock {
    private final List<BlockModel> blocks;

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

    @Override
    public List<BlockModel> getBlocks() {
        return this.blocks;
    }
}

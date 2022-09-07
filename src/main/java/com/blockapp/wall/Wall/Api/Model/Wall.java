package com.blockapp.wall.Wall.Api.Model;

import com.blockapp.wall.Wall.Api.Block;
import com.blockapp.wall.Wall.Api.CompositeBlock;
import com.blockapp.wall.Wall.Api.Structure;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


@RequiredArgsConstructor
public class Wall implements Structure {
    private final List<CompositeBlock> blocks;

    @Override
    public Optional<BlockModel> findBlockByColor(String color) {
        List<BlockModel> blockList = new ArrayList<>();

        blocks.stream()
                .map(CompositeBlock::getBlocks)
                .forEach(blockList::addAll);

        return blockList.stream()
                .filter(block -> block.getColor().equals(color))
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blockList = new ArrayList<>();

        blocks.stream()
                .map(CompositeBlock::getBlocks)
                .forEach(blockList::addAll);

        return blockList.stream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        AtomicInteger blockCount = new AtomicInteger();

        this.blocks.stream()
                .map(block -> block.getBlocks().size())
                .forEach(blockCount::addAndGet);

        return blockCount.get();
    }
}

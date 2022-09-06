package com.blockapp.wall.Wall.Api;

import com.blockapp.wall.Wall.Api.Model.BlockModel;

import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional<BlockModel> findBlockByColor(String color);
    List<Block> findBlocksByMaterial(String material);
    int count();
}

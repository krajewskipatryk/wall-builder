package com.blockapp.wall.Wall.Api;

import com.blockapp.wall.Wall.Api.Model.BlockModel;

import java.util.List;

public interface CompositeBlock extends Block {
    List<BlockModel> blocks();
}

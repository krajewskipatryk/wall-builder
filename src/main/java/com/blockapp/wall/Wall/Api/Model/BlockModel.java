package com.blockapp.wall.Wall.Api.Model;

import com.blockapp.wall.Wall.Api.Block;

public record BlockModel(String material, String color) implements Block {
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}

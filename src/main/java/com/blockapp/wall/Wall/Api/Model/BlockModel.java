package com.blockapp.wall.Wall.Api.Model;

import com.blockapp.wall.Wall.Api.Block;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class BlockModel implements Block {
    private String material;
    private String color;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}

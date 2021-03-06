package com.buuz135.project42.api.manual.impl.design;

import com.buuz135.project42.Project42;
import com.buuz135.project42.api.manual.design.IBackgroundDesign;
import com.buuz135.project42.api.manual.design.IDrawableLocationTexture;
import net.minecraft.util.ResourceLocation;

public class DefaultBackgroundDesign implements IBackgroundDesign {

    public static final ResourceLocation BOOK_BACK = new ResourceLocation(Project42.MOD_ID, "textures/gui/book_back.png");
    public static final ResourceLocation EXTRAS = new ResourceLocation(Project42.MOD_ID, "textures/gui/extras.png");

    @Override
    public ResourceLocation getTexture() {
        return BOOK_BACK;
    }

    @Override
    public int getTopPadding() {
        return 10;
    }

    @Override
    public int getBottomPadding() {
        return 14;
    }

    @Override
    public int getLeftPadding() {
        return 16;
    }

    @Override
    public int getRightPadding() {
        return 16;
    }

    @Override
    public double getScale() {
        return 1;
    }

    @Override
    public IDrawableLocationTexture getPrevPageTexture() {
        return new DefaultDrawableLocationTexture(4, 176, EXTRAS, 1, 14, 18, 10, 24, 14);
    }

    @Override
    public IDrawableLocationTexture getNextPageTexture() {
        return new DefaultDrawableLocationTexture(130, 176, EXTRAS, 1, 1, 18, 10, 24, 1);
    }

    @Override
    public IDrawableLocationTexture getBackTexture() {
        return null;
    }

    @Override
    public int getTextureX() {
        return 0;
    }

    @Override
    public int getTextureY() {
        return 0;
    }

    @Override
    public int getTextureWidth() {
        return 146;
    }

    @Override
    public int getTextureHeight() {
        return 180;
    }

}

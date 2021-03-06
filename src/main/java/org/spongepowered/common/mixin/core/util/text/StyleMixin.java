/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.common.mixin.core.util.text;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.common.bridge.util.text.StyleBridge;

@Mixin(Style.class)
public class StyleMixin implements StyleBridge {

    @Shadow private Style parentStyle;
    @Shadow private TextFormatting color;
    @Shadow private Boolean bold;
    @Shadow private Boolean italic;
    @Shadow private Boolean underlined;
    @Shadow private Boolean strikethrough;
    @Shadow private Boolean obfuscated;
    @Shadow private ClickEvent clickEvent;
    @Shadow private HoverEvent hoverEvent;
    @Shadow private String insertion;

    @Override
    public Style bridge$getParentStyle() {
        return this.parentStyle;
    }

    @Override
    public TextFormatting bridge$getColor() {
        return this.color;
    }

    @Override
    public Boolean bridge$getBold() {
        return this.bold;
    }

    @Override
    public Boolean bridge$getItalic() {
        return this.italic;
    }

    @Override
    public Boolean bridge$getUnderlined() {
        return this.underlined;
    }

    @Override
    public Boolean bridge$getStrikethrough() {
        return this.strikethrough;
    }

    @Override
    public Boolean bridge$getObfuscated() {
        return this.obfuscated;
    }

    @Override
    public ClickEvent bridge$getClickEvent() {
        return this.clickEvent;
    }

    @Override
    public HoverEvent bridge$getHoverEvent() {
        return this.hoverEvent;
    }

    @Override
    public String bridge$getInsertion() {
        return this.insertion;
    }
}

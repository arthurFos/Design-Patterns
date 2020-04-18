package de.fkal.client;

import de.fkal.abstractproduct.Color;
import de.fkal.abstractproduct.Shape;
import de.fkal.abstractproduct.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

enum FigureType {
    SHAPE,
    SIZE,
    COLOR
}

@Data
@AllArgsConstructor
public class Figure {
    private Color color;
    private Size size;
    private Shape shape;

    public Figure(String color, String size, String shape) {
        buildFigure(color, size, shape);
    }

    public void buildFigure(String color, String size, String shape) {
        this.color = (Color) Objects.requireNonNull(FactoryProvider.getFactory(FigureType.COLOR.name())).create(color);
        this.shape = (Shape) Objects.requireNonNull(FactoryProvider.getFactory(FigureType.SHAPE.name())).create(shape);
        this.size = (Size) Objects.requireNonNull(FactoryProvider.getFactory(FigureType.SIZE.name())).create(size);
    }
}

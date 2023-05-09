package com.example.javaproject2.week4.day2;

public class DiEx {
    private ShapeDrawer shapeDrawer;
    private ParallelogramShapeDrawer parallelogramShapeDrawer;

    public DiEx(ParallelogramShapeDrawer parallelogramShapeDrawer) {
        this.parallelogramShapeDrawer = parallelogramShapeDrawer;
    }

    public void doSth() {
        shapeDrawer.printShape(5);
    }
}

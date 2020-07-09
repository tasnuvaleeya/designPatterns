package com.designpatterns;

import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.state.BrushTool;
import com.designpatterns.state.Canvas;
import com.designpatterns.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
       var canvas = new Canvas();
       canvas.setCurrentTool(new BrushTool());
       canvas.mouseDown();
       canvas.mouseUp();

    }

}

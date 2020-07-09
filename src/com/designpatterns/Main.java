package com.designpatterns;

import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.state.BrushTool;
import com.designpatterns.state.Canvas;
import com.designpatterns.state.SelectionTool;
import com.designpatterns.state.abuse.StopWatch;

public class Main {
    public static void main(String[] args) {
       var stopWatch = new StopWatch();
       stopWatch.click();
       stopWatch.click();
       stopWatch.click();

    }

}

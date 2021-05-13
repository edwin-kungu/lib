
package com.nemido.graphsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nemido.lib.graph.GraphView;
import com.nemido.lib.graph.GraphView.Line;
import com.nemido.lib.utils.Period;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GraphView view = findViewById(R.id.graph);
        final Period period = Period.ofQuarter();
        view.setPeriod(period);
        view.add(dummy(period.getDuration()));
    }

    List<Line> dummy(int duration) {
        final List<Line> lines = new ArrayList<>();
        int i = 0;
        int arr = 1;

        while (i < arr) {
            int j = 0;
            Line line = new Line("label" + i, i++%2 == 0);
            while (j < duration) {
                line.add(j++, Math.random()*1000);
            }
            lines.add(line);
        }

        return lines;
    }

    @SuppressWarnings("SameParameterValue")
    List<Line> genDummy(final int arr, final int duration) {
        final List<Line> lines = new ArrayList<>();
        int i = 0;

        while(i < arr) {
            int j = 0;
            Line line = new Line("label" + i, i++%2 == 0);
            while(j < duration) {
                line.add(j++, Math.random() * 1000);
            }
            lines.add(line);
        }
        return lines;
    }
}
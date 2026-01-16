package dev.lpa;

import java.util.ArrayList;
import javax.lang.model.element.Element;
import java.util.List;

public class layer<T extends Mappable>{

    private List<T> layerElements;

    public layer(T[] layerElements) {
        this.layerElements = new ArrayList<>(List.of(layerElements));
    }

    public void addElement(T... elements){
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer(){
        for(T element: layerElements){
            element.render();
        }

    }
}

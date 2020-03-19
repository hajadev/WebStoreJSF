package fr.koor.webstorejsf.ihm;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@SessionScoped
public class CatalogBrowserBean implements Serializable {

    private static final long serialVersionUID = 2729758432756108274L;

    private int index;
    
    
    public int getIndex() {
        return index;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    public void processPreviousAction( ActionEvent event ) {
        index--;
    }
    
    public void processNextAction( ActionEvent event ) {
        index++;
    }

}
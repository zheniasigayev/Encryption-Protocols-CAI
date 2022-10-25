

import java.util.ArrayList;

public abstract class AbstractCAI {

    private ArrayList<Site> sites = new ArrayList<Site>();

    public void add(Site site){
        sites.add(site);
    }

    public void remove(Site site){
        sites.remove(site);
    }

    protected void notifySites(){
        for(Site s : sites){
            s.update();
        }
    }

}

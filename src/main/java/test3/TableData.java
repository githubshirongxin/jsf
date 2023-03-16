package test3;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="nameList")
@SessionScoped
public class TableData {
    private  Name[] names = new Name[] {
            new Name("William", "Dupont"),
            new Name("Anna", "Keeney"),
            new Name("Mariko", "Randor"),
            new Name("John", "Wilson")
    };
    
    
    public Name[] getNames() { return names;}
    
    
    
    private List<Stop> stopObjList = new ArrayList<Stop>() {
    	private static final long serialVersionUID = 1L;

		{
    		add(new Stop(false));
    		add(new Stop(true));
    		add(new Stop(true));
    		
    	}
    };
    
    
    public List<Stop> getStopObjList() {
		return stopObjList;
	}


	public void setStopObjList(List<Stop> stopObjList) {
		this.stopObjList = stopObjList;
	}

	
	private Boolean[] wrapBooleanList = { new Boolean(false),new Boolean(true),new Boolean(true)};
	


	public Boolean[] getWrapBooleanList() {
		return wrapBooleanList;
	}


	public void setWrapBooleanList(Boolean[] wrapBooleanList) {
		this.wrapBooleanList = wrapBooleanList;
	}



	private boolean[] stopList = {true,false,true,true,false};


	public boolean[] getStopList() {
		return stopList;
	}


	public void setStopList(boolean[] stopList) {
		this.stopList = stopList;
	}


	public void setNames(Name[] names) {
		this.names = names;
	}
    
}
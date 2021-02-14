/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

/**
 *
 * @author JEE
 */
@ManagedBean(name="schedule")
public class ScheduleTimes  {
    private SelectItem[] locations = new SelectItem[]{
      new SelectItem("DHK", "DHK"),
        new SelectItem("CHT", "CHT"),
        new SelectItem("SYT", "SYT"),
        new SelectItem("BAR", "BAR")
    };
    
    private SelectItem[] airlinesName=new SelectItem[]{
        new SelectItem("Bangladesh Biman", "Bangladesh Biman"),
        new SelectItem("Novo Air", "Novo Air"),
        new SelectItem("US Bangla", "US Bangla"),
        new SelectItem("Legent Airways")
    };
    
    public ScheduleTimes(){
        
    }
    
    public SelectItem[] getLocations(){
        return locations;
    }
    public SelectItem[] getAirlinesName(){
        return airlinesName;
    }
}

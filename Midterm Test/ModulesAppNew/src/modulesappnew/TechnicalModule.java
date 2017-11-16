/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulesappnew;


/**
 *
 * @author Stefan
 */
public class TechnicalModule extends Module {
    private String labday;

    public TechnicalModule(String name, String lecturer, String lectureday, String labday) {
        super(name, lecturer, lectureday);
        this.labday = labday;
    }

    public TechnicalModule() {
        this("","","","");
    }

    public String getLabday() {
        return labday;
    }

    public void setLabday(String labday) {
        this.labday = labday;
    }
    
    
}

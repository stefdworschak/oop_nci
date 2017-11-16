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
public class BusinessModule extends Module {
    private String tutorialday;
    
    public BusinessModule(String name, String lecturer, String lectureday, String tutorialday) {
        super(name, lecturer, lectureday);
        this.tutorialday=tutorialday;
    }

    public BusinessModule() {
        this("","","","");
    }

    public String getTutorialday() {
        return tutorialday;
    }

    public void setTutorialday(String tutorialday) {
        this.tutorialday = tutorialday;
    }
        
    
}

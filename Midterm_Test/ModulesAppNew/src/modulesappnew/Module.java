/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulesappnew;

import java.io.Serializable;

/**
 *
 * @author Stefan
 */
public class Module implements Serializable {
    
    protected String name,lecturer,lectureday;
    

    public Module(String name, String lecturer, String lectureday) {
        this.name = name;
        this.lecturer = lecturer;
        this.lectureday = lectureday;
    }

    public Module() {
        this("","","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getLectureday() {
        return lectureday;
    }

    public void setLectureday(String lectureday) {
        this.lectureday = lectureday;
    }
    
    
    
    
            
    
}

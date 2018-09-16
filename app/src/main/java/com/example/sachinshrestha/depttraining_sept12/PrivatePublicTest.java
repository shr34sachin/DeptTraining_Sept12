package com.example.sachinshrestha.depttraining_sept12;

public class PrivatePublicTest {

    // 1. public 2. protected 3. no-access modifier 4.private
    String testos1;
    private String testos2;

    public String getEuta1() {
        return euta1;
    }

    public void setEuta1(String euta1) {
        this.euta1 = euta1;
    }

    public String getEuta2() {
        return euta2;
    }

    public void setEuta2(String euta2) {
        this.euta2 = euta2;
    }

    public String getEuta3() {
        return euta3;
    }

    public void setEuta3(String euta3) {
        this.euta3 = euta3;
    }

    public String getEuta4() {
        return euta4;
    }

    public void setEuta4(String euta4) {
        this.euta4 = euta4;
    }

    private String euta1, euta2, euta3, euta4;

    // setter
    void SetTestos2(String testos2){
        this.testos2 = testos2;
    }

    // Getter
    String GetTestos2(){
        return this.testos2;
    }
}

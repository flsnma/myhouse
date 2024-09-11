package com.cxl.qm.demo8;

public class LoginFrom {
    private AbstractButton button;

    public LoginFrom(AbstractButton button) {
        this.button = button;
    }

    public void displayForm(){
        System.out.println("显示");
        button.display();
    }
}

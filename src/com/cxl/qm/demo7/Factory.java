package com.cxl.qm.demo7;

public class Factory {
   public static Shape getShape(String type){
       if (type.equalsIgnoreCase("circle")){
           return new Circle();
       }else if(type.equalsIgnoreCase("juxing")){
           return new JuXing();
       }
       return null;
   }
}

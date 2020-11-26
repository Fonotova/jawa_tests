package com.company.Lesson06;

public interface Visual_Component {
    void draw();
    default void draw3D(){
        System.out.println("Default value draw3D()");
    }
}

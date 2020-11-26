package com.company.Lesson06;

public class Label extends Component {
    @Override
    public void draw() {
        System.out.println("Label extends Component");
    }
    @Override
    public void draw3D(){
        System.out.println("Class Label - method draw3D ");
    }
}

package com.company.Lesson06;

public class ComponentDemo {
    public static void main(String[] args) {
        //Component
        Visual_Component [] array = {
                new Button(),
                new RoundButton(),
                new ChekBox(),
                new Label()
        };
        for (int i=0; i <array.length; i++){
            array[i].draw();
            array[i].draw3D();
            System.out.println("++++++++++++");
            //System.out.println(array[i]);
        }
       // Component [] arrayRandom = new Component[100];
       // Random random = new Random();
        //int j = random.nextInt(4);
      //  for (int i=0; i< arrayRandom.length; i++)
      //  {
      //      System.out.println(i);
      //      arrayRandom[i] = array[random.nextInt(4)];
      //      arrayRandom[i].draw();
       // }


    }
}

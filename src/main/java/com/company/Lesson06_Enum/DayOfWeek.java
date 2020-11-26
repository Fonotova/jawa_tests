package com.company.Lesson06_Enum;

 enum DayOfWeek {
    SUNDAY(),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    private String day;

    public void getDayAfterTomorrow(){
       if (this.ordinal() >= 5  ){
          System.out.println("Day after tomorrow is: " + values()[this.ordinal()-5]);
       }
       else System.out.println("Day after tomorrow is: " + values()[this.ordinal()+2]);
    }
    public void getDayBeforeYesterday(){
       int dayN = this.ordinal()-2;
       if(dayN < 0)
          System.out.println("Day before yesterday was: " + values()[dayN+7]);
       else System.out.println("Day before yesterday was: " +values()[dayN]);
    }
}

package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 0, 6, isManual, "Race Car", 1);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){

        int newSpeed = this.getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */


        if(newSpeed == 0) {
            stop();
            this.changeGear(1);
            //setCurrentGear(1);
        }
        else if(newSpeed>0 && newSpeed<51) {
            this.changeGear(1);
            //setCurrentGear(1);
        }
        else if(newSpeed>50 && newSpeed<101) {
            this.changeGear(2);
            //setCurrentGear(2);
        }
        else if(newSpeed>=101 && newSpeed<=150) {

            this.changeGear(3);
            //setCurrentGear(3);
        }
        else if(newSpeed>=151 && newSpeed<=200) {

            this.changeGear(4);
            //setCurrentGear(4);
        }
        else if(newSpeed>=201 && newSpeed<=250) {

            this.changeGear(5);
            //setCurrentGear(5);
        }
        else if(newSpeed>250)
        {

            this.changeGear(6);
            //setCurrentGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}

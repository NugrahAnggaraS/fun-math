package org.example

class FunMath {
    fun tambahPunGatau(number1:Int,vararg number2:Int):Int{
        var res = number1;

        for (i in number2){
            res+= i;
        }

        return res;
    }
}
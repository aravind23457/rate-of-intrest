package com.aravind;
import com.aravind.util.Calculateintrest.getInstrust;
public class InstrustExample{
public static void main ( String [] arg){
if(arg.length<3){ 
System.out.println (" please provide p t r values");

return;
}
getInstrust(Long.valueOf(arg[0]),Long.valueOf(arg[1]),Double.valueOf(arg[2]));
System.out.println(Instrust);
}
}
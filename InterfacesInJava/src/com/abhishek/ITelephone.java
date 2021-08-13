package com.abhishek;

// Interface exist to define a method that must be implemented.

public interface ITelephone {
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}

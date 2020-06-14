package Class.Overriding_education;
/*
Write a superclass, EducationalInstitution, that contains:
an int instance variable, duration, indicating the standard number of years spent at the institution

A constructor that accepts an int which is used to initialize the duration instance variable

a method graduationRequirements that returns a String. The (default) behavior of graduationRequirements is to return a String stating "d years of study", where d is the value of the duration instance variable

Write a subclass LawSchool that contains:
a (default) constructor that invokes the superclass constructor with the value 3 (law school is typically a three year program).

a (overridden) method graduationRequirements that returns the string "3 years of study and passing the bar". You MUST invoke the graduationRequirements method of the superclass in this method (to obtain the first portion of the resulting string).
 */
public class LawSchool extends EducationalInstitution {

    public LawSchool () {
        super(3);
    }

    @Override
    public String graduationRequirements () {
        return "3 years of study and passing the bar";

    }

}

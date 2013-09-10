package com.delta.family;

/**
 * Created by macrobius on 9/9/13.
 */
public class FamilyMember {
    private String myFirstName;
    private static String ourLastName = "Android";
    private Integer myAge;
    private static String ourAddress = "Austin, TX";
    private static String ourPhoneNumber = "(555)512-1345";
    private String myPhoneNumber;

    public FamilyMember(String myFirstName, Integer myAge, String myPhoneNumber) {
        //todo:initialize family members
    }

    public String getMyName() {
        //todo:return FamilyMember's age
        return null;
    }

    public static Integer getMyAge() {
        //todo:return FamilyMember's age
        return null;
    }

    public static String callMe() {
        //todo:return FamilyMember's phone number
        return null;
    }

    public static String callMe(FamilyMember familyMember) {
        //todo:return FamilyMember's phone number
        return null;
    }

    public static String callLandLine() {
        //todo:return the family phone number
        return null;
    }

    @Override
    public String toString() {
        String result = "Info goes here";
        return result;
    }
}

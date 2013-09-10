package com.delta.family;

/**
 * Created by macrobius on 9/9/13.
 */
public class FamilyMember {
    private String myFirstName;
    private static String ourLastName = "Reynolds";
    private Integer myAge;
    private static String ourAddress = "912 Congress Ave, Austin TX";
    private String myAddress;
    private static String ourPhoneNumber = "(555)512-1345";
    private String myPhoneNumber;

    public FamilyMember(String myFirstName, Integer myAge, String myPhoneNumber) {
        //todo:initialize family members
    }

    public String getMyName() {
        //todo:return FamilyMember's full name
        return null;
    }

    public Integer getMyAge() {
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

    public static String getMyAddress(FamilyMember familyMember)
    {
        //todo: return in this format: "<family-member-name> lives at <address>"
        return null;
    }


    @Override
    public String toString() {
        String result;
        try{
            result = getMyName() + " , Age:" + getMyAge().toString() + "\n" +
                        "Personal: " + callMe(this) + "\n" +
                        "Landline:" + callLandLine() + "\n" +
                        "Address:" + getMyAddress(this);
        }catch(Exception e){
            result = "incomplete implementation";
        }

        return result;
    }
}

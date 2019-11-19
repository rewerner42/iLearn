package edu.se452.group1.ilearn.data.entity;

public enum UserProfileType {
    USER("USER"),
    DBA("DBA"),
    ADMIN("ADMIN"),
    STUDENT("STUDENT"),
    TEACHER("TEACHER"),
    PARENT("PARENT"),
    UNDEFINED("UNDEFINED");

    String userProfileType;

    private UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }
}

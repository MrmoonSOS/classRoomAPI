package com.example.classRoomAPI.helpers;

public enum ApiMessage {
    ERROR_TEACHER_NOT_FOUND("The Teacher that you try to find, its not in the DB"),
    ERROR_STUDENT_NOT_FOUND("The Student that you try to find, its not in the DB"),
    ERROR_ASSISTANCE_NOT_FOUND("The Assistance that you try to find, its not in the DB"),
    ERROR_COURSE_NOT_FOUND("The Course that you try to find, its not in the DB"),
    ERROR_QUALIFICATIONS_NOT_FOUND("The Qualification that you try to find, its not in the DB"),
    ERROR_REGISTRATION_NOT_FOUND("The Registration that you try to find, its not in the DB"),
    ERROR_SUBJECT_NOT_FOUND("The Subject that you try to find, its not in the DB"),
    ERROR_USER_NOT_FOUND("The User that you try to find, its not in the DB")

    ;
    private String message;

    ApiMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package org.motechproject.ebodac.validation;

import org.motechproject.ebodac.domain.Language;

public class ValidationError {

    public static final String PHONE_NUMBER_NULL = "Error: phoneNumber property can't be null";
    public static final String SUBJECT_ID_NULL = "Error: subjectId property can't be null";
    public static final String SUBJECT_ID_NOT_NUMERIC = "Error: subjectId property has to be numeric";
    public static final String SUBJECT_ID_NOT_VERIFIED = "Error: subjectId property format verification failed";
    public static final String NAME_NULL  = "Error: name property can't be null";
    public static final String NAME_HAS_DIGITS  = "Error: name property cannot contain digits";
    public static final String HOUSEHOLD_NAME_HAS_DIGITS = "Error: householdName property cannot contain digits";
    public static final String LANGUAGE_NULL  = "Error: language property can't be null";
    public static final String LANGUAGE_NOT_CORRECT  = "Error: language property can only equal to one of: " +
            Language.getListOfCodes();
    public static final String HEAD_OF_HOUSEHOLD_HAS_DIGITS = "Error: headOfHousehold property cannot contain digits";


    private String message;

    public ValidationError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return message;
    }
}


package com.ocrtextrecognitionapp;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParsedResult implements Serializable, Parcelable
{

    @SerializedName("TextOverlay")
    @Expose
    private TextOverlay textOverlay;
    @SerializedName("FileParseExitCode")
    @Expose
    private Integer fileParseExitCode;
    @SerializedName("ParsedText")
    @Expose
    private String parsedText;
    @SerializedName("ErrorMessage")
    @Expose
    private String errorMessage;
    @SerializedName("ErrorDetails")
    @Expose
    private String errorDetails;
    public final static Parcelable.Creator<ParsedResult> CREATOR = new Creator<ParsedResult>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ParsedResult createFromParcel(Parcel in) {
            return new ParsedResult(in);
        }

        public ParsedResult[] newArray(int size) {
            return (new ParsedResult[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2922299987668800532L;

    protected ParsedResult(Parcel in) {
        this.textOverlay = ((TextOverlay) in.readValue((TextOverlay.class.getClassLoader())));
        this.fileParseExitCode = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.parsedText = ((String) in.readValue((String.class.getClassLoader())));
        this.errorMessage = ((String) in.readValue((String.class.getClassLoader())));
        this.errorDetails = ((String) in.readValue((String.class.getClassLoader())));
    }

    public ParsedResult() {
    }

    public TextOverlay getTextOverlay() {
        return textOverlay;
    }

    public void setTextOverlay(TextOverlay textOverlay) {
        this.textOverlay = textOverlay;
    }

    public Integer getFileParseExitCode() {
        return fileParseExitCode;
    }

    public void setFileParseExitCode(Integer fileParseExitCode) {
        this.fileParseExitCode = fileParseExitCode;
    }

    public String getParsedText() {
        return parsedText;
    }

    public void setParsedText(String parsedText) {
        this.parsedText = parsedText;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(textOverlay);
        dest.writeValue(fileParseExitCode);
        dest.writeValue(parsedText);
        dest.writeValue(errorMessage);
        dest.writeValue(errorDetails);
    }

    public int describeContents() {
        return  0;
    }

}

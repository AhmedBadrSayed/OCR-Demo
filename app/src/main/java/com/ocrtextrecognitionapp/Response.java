
package com.ocrtextrecognitionapp;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response implements Serializable, Parcelable
{

    @SerializedName("ParsedResults")
    @Expose
    private List<ParsedResult> parsedResults = null;
    @SerializedName("OCRExitCode")
    @Expose
    private Integer oCRExitCode;
    @SerializedName("IsErroredOnProcessing")
    @Expose
    private Boolean isErroredOnProcessing;
    @SerializedName("ErrorMessage")
    @Expose
    private Object errorMessage;
    @SerializedName("ErrorDetails")
    @Expose
    private Object errorDetails;
    @SerializedName("ProcessingTimeInMilliseconds")
    @Expose
    private String processingTimeInMilliseconds;
    @SerializedName("SearchablePDFURL")
    @Expose
    private String searchablePDFURL;
    public final static Parcelable.Creator<Response> CREATOR = new Creator<Response>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Response createFromParcel(Parcel in) {
            return new Response(in);
        }

        public Response[] newArray(int size) {
            return (new Response[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6062759969381866470L;

    protected Response(Parcel in) {
        in.readList(this.parsedResults, (ParsedResult.class.getClassLoader()));
        this.oCRExitCode = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isErroredOnProcessing = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.errorMessage = ((Object) in.readValue((Object.class.getClassLoader())));
        this.errorDetails = ((Object) in.readValue((Object.class.getClassLoader())));
        this.processingTimeInMilliseconds = ((String) in.readValue((String.class.getClassLoader())));
        this.searchablePDFURL = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Response() {
    }

    public List<ParsedResult> getParsedResults() {
        return parsedResults;
    }

    public void setParsedResults(List<ParsedResult> parsedResults) {
        this.parsedResults = parsedResults;
    }

    public Integer getOCRExitCode() {
        return oCRExitCode;
    }

    public void setOCRExitCode(Integer oCRExitCode) {
        this.oCRExitCode = oCRExitCode;
    }

    public Boolean getIsErroredOnProcessing() {
        return isErroredOnProcessing;
    }

    public void setIsErroredOnProcessing(Boolean isErroredOnProcessing) {
        this.isErroredOnProcessing = isErroredOnProcessing;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(Object errorDetails) {
        this.errorDetails = errorDetails;
    }

    public String getProcessingTimeInMilliseconds() {
        return processingTimeInMilliseconds;
    }

    public void setProcessingTimeInMilliseconds(String processingTimeInMilliseconds) {
        this.processingTimeInMilliseconds = processingTimeInMilliseconds;
    }

    public String getSearchablePDFURL() {
        return searchablePDFURL;
    }

    public void setSearchablePDFURL(String searchablePDFURL) {
        this.searchablePDFURL = searchablePDFURL;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(parsedResults);
        dest.writeValue(oCRExitCode);
        dest.writeValue(isErroredOnProcessing);
        dest.writeValue(errorMessage);
        dest.writeValue(errorDetails);
        dest.writeValue(processingTimeInMilliseconds);
        dest.writeValue(searchablePDFURL);
    }

    public int describeContents() {
        return  0;
    }

}

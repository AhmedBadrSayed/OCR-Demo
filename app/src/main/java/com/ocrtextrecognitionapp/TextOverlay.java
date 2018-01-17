
package com.ocrtextrecognitionapp;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TextOverlay implements Serializable, Parcelable
{

    @SerializedName("Lines")
    @Expose
    private List<Line> lines = null;
    @SerializedName("HasOverlay")
    @Expose
    private Boolean hasOverlay;
    @SerializedName("Message")
    @Expose
    private String message;
    public final static Parcelable.Creator<TextOverlay> CREATOR = new Creator<TextOverlay>() {


        @SuppressWarnings({
            "unchecked"
        })
        public TextOverlay createFromParcel(Parcel in) {
            return new TextOverlay(in);
        }

        public TextOverlay[] newArray(int size) {
            return (new TextOverlay[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7361695908974227430L;

    protected TextOverlay(Parcel in) {
        in.readList(this.lines, (Line.class.getClassLoader()));
        this.hasOverlay = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
    }

    public TextOverlay() {
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public Boolean getHasOverlay() {
        return hasOverlay;
    }

    public void setHasOverlay(Boolean hasOverlay) {
        this.hasOverlay = hasOverlay;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(lines);
        dest.writeValue(hasOverlay);
        dest.writeValue(message);
    }

    public int describeContents() {
        return  0;
    }

}

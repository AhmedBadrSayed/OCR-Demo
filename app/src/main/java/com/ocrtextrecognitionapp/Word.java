
package com.ocrtextrecognitionapp;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Word implements Serializable, Parcelable
{

    @SerializedName("WordText")
    @Expose
    private String wordText;
    @SerializedName("Left")
    @Expose
    private Double left;
    @SerializedName("Top")
    @Expose
    private Double top;
    @SerializedName("Height")
    @Expose
    private Double height;
    @SerializedName("Width")
    @Expose
    private Double width;
    public final static Parcelable.Creator<Word> CREATOR = new Creator<Word>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Word createFromParcel(Parcel in) {
            return new Word(in);
        }

        public Word[] newArray(int size) {
            return (new Word[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3711684526409838308L;

    protected Word(Parcel in) {
        this.wordText = ((String) in.readValue((String.class.getClassLoader())));
        this.left = ((Double) in.readValue((Double.class.getClassLoader())));
        this.top = ((Double) in.readValue((Double.class.getClassLoader())));
        this.height = ((Double) in.readValue((Double.class.getClassLoader())));
        this.width = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    public Word() {
    }

    public String getWordText() {
        return wordText;
    }

    public void setWordText(String wordText) {
        this.wordText = wordText;
    }

    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(wordText);
        dest.writeValue(left);
        dest.writeValue(top);
        dest.writeValue(height);
        dest.writeValue(width);
    }

    public int describeContents() {
        return  0;
    }

}


package com.ocrtextrecognitionapp;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Line implements Serializable, Parcelable
{

    @SerializedName("Words")
    @Expose
    private List<Word> words = null;
    @SerializedName("MaxHeight")
    @Expose
    private Double maxHeight;
    @SerializedName("MinTop")
    @Expose
    private Double minTop;
    public final static Parcelable.Creator<Line> CREATOR = new Creator<Line>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Line createFromParcel(Parcel in) {
            return new Line(in);
        }

        public Line[] newArray(int size) {
            return (new Line[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2605871825509446877L;

    protected Line(Parcel in) {
        in.readList(this.words, (Word.class.getClassLoader()));
        this.maxHeight = ((Double) in.readValue((Double.class.getClassLoader())));
        this.minTop = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    public Line() {
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public Double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Double getMinTop() {
        return minTop;
    }

    public void setMinTop(Double minTop) {
        this.minTop = minTop;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(words);
        dest.writeValue(maxHeight);
        dest.writeValue(minTop);
    }

    public int describeContents() {
        return  0;
    }

}

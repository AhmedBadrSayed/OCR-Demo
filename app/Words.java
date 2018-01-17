package app;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Words{
  @SerializedName("Left")
  @Expose
  private Integer Left;
  @SerializedName("Top")
  @Expose
  private Integer Top;
  @SerializedName("Height")
  @Expose
  private Integer Height;
  @SerializedName("WordText")
  @Expose
  private String WordText;
  @SerializedName("Width")
  @Expose
  private Integer Width;
  public void setLeft(Integer Left){
   this.Left=Left;
  }
  public Integer getLeft(){
   return Left;
  }
  public void setTop(Integer Top){
   this.Top=Top;
  }
  public Integer getTop(){
   return Top;
  }
  public void setHeight(Integer Height){
   this.Height=Height;
  }
  public Integer getHeight(){
   return Height;
  }
  public void setWordText(String WordText){
   this.WordText=WordText;
  }
  public String getWordText(){
   return WordText;
  }
  public void setWidth(Integer Width){
   this.Width=Width;
  }
  public Integer getWidth(){
   return Width;
  }
}
package app;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class Lines{
  @SerializedName("MinTop")
  @Expose
  private Integer MinTop;
  @SerializedName("Words")
  @Expose
  private List<Words> Words;
  @SerializedName("MaxHeight")
  @Expose
  private Integer MaxHeight;
  public void setMinTop(Integer MinTop){
   this.MinTop=MinTop;
  }
  public Integer getMinTop(){
   return MinTop;
  }
  public void setWords(List<Words> Words){
   this.Words=Words;
  }
  public List<Words> getWords(){
   return Words;
  }
  public void setMaxHeight(Integer MaxHeight){
   this.MaxHeight=MaxHeight;
  }
  public Integer getMaxHeight(){
   return MaxHeight;
  }
}
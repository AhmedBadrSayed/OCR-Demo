package app;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class TextOverlay{
  @SerializedName("Message")
  @Expose
  private String Message;
  @SerializedName("Lines")
  @Expose
  private List<Lines> Lines;
  @SerializedName("HasOverlay")
  @Expose
  private Boolean HasOverlay;
  public void setMessage(String Message){
   this.Message=Message;
  }
  public String getMessage(){
   return Message;
  }
  public void setLines(List<Lines> Lines){
   this.Lines=Lines;
  }
  public List<Lines> getLines(){
   return Lines;
  }
  public void setHasOverlay(Boolean HasOverlay){
   this.HasOverlay=HasOverlay;
  }
  public Boolean getHasOverlay(){
   return HasOverlay;
  }
}
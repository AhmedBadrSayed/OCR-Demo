package app;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class ParsedResults{
  @SerializedName("ParsedText")
  @Expose
  private String ParsedText;
  @SerializedName("FileParseExitCode")
  @Expose
  private Integer FileParseExitCode;
  @SerializedName("ErrorDetails")
  @Expose
  private String ErrorDetails;
  @SerializedName("ErrorMessage")
  @Expose
  private String ErrorMessage;
  @SerializedName("TextOverlay")
  @Expose
  private TextOverlay TextOverlay;
  public void setParsedText(String ParsedText){
   this.ParsedText=ParsedText;
  }
  public String getParsedText(){
   return ParsedText;
  }
  public void setFileParseExitCode(Integer FileParseExitCode){
   this.FileParseExitCode=FileParseExitCode;
  }
  public Integer getFileParseExitCode(){
   return FileParseExitCode;
  }
  public void setErrorDetails(String ErrorDetails){
   this.ErrorDetails=ErrorDetails;
  }
  public String getErrorDetails(){
   return ErrorDetails;
  }
  public void setErrorMessage(String ErrorMessage){
   this.ErrorMessage=ErrorMessage;
  }
  public String getErrorMessage(){
   return ErrorMessage;
  }
  public void setTextOverlay(TextOverlay TextOverlay){
   this.TextOverlay=TextOverlay;
  }
  public TextOverlay getTextOverlay(){
   return TextOverlay;
  }
}
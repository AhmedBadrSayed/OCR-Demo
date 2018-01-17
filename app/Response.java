package app;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class Response{
  @SerializedName("IsErroredOnProcessing")
  @Expose
  private Boolean IsErroredOnProcessing;
  @SerializedName("ParsedResults")
  @Expose
  private List<ParsedResults> ParsedResults;
  @SerializedName("ProcessingTimeInMilliseconds")
  @Expose
  private Integer ProcessingTimeInMilliseconds;
  @SerializedName("SearchablePDFURL")
  @Expose
  private String SearchablePDFURL;
  @SerializedName("OCRExitCode")
  @Expose
  private Integer OCRExitCode;
  @SerializedName("ErrorDetails")
  @Expose
  private Object ErrorDetails;
  @SerializedName("ErrorMessage")
  @Expose
  private Object ErrorMessage;
  public void setIsErroredOnProcessing(Boolean IsErroredOnProcessing){
   this.IsErroredOnProcessing=IsErroredOnProcessing;
  }
  public Boolean getIsErroredOnProcessing(){
   return IsErroredOnProcessing;
  }
  public void setParsedResults(List<ParsedResults> ParsedResults){
   this.ParsedResults=ParsedResults;
  }
  public List<ParsedResults> getParsedResults(){
   return ParsedResults;
  }
  public void setProcessingTimeInMilliseconds(Integer ProcessingTimeInMilliseconds){
   this.ProcessingTimeInMilliseconds=ProcessingTimeInMilliseconds;
  }
  public Integer getProcessingTimeInMilliseconds(){
   return ProcessingTimeInMilliseconds;
  }
  public void setSearchablePDFURL(String SearchablePDFURL){
   this.SearchablePDFURL=SearchablePDFURL;
  }
  public String getSearchablePDFURL(){
   return SearchablePDFURL;
  }
  public void setOCRExitCode(Integer OCRExitCode){
   this.OCRExitCode=OCRExitCode;
  }
  public Integer getOCRExitCode(){
   return OCRExitCode;
  }
  public void setErrorDetails(Object ErrorDetails){
   this.ErrorDetails=ErrorDetails;
  }
  public Object getErrorDetails(){
   return ErrorDetails;
  }
  public void setErrorMessage(Object ErrorMessage){
   this.ErrorMessage=ErrorMessage;
  }
  public Object getErrorMessage(){
   return ErrorMessage;
  }
}
package PageObjects;
import Settings.GlobalVars;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
public class FileUploadExample_PO extends Base_Actions{
    public FileUploadExample_PO(){super();}
    public @FindBy(xpath = "//input[@id='file-submit']")
    WebElement fileUploadBtn;
    public @FindBy(id="drag-drop-upload")
    WebElement dragAndDropBtn;
    public @FindBy(id = "file-submit")
    WebElement filesubmitBtn;
    public @FindBy(id = "uploaded-files")
    WebElement uploadSuccessMessage;
    public void NavigateToFileUploaderPage(){
        navigateTo_URL(GlobalVars.HEROKUAPPFILEUPLOADER_URL);
    }
    public void fileUploadAction() throws IOException, InterruptedException {
        //Runtime.getRuntime().exec("
        Thread.sleep(2000);
        //You need to change the filePath
        String filePath = "C:\\Users\\VictorMelo\\Desktop\\UploadFile\\UploadFileAutomation\\src\\main\\java\\AutoITscript\\fileUpload.exe";
        ProcessBuilder processBuilder = new ProcessBuilder(filePath);
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                //System.out.println("Process executed successfully");
            } else {
                System.err.println("Error: Process exited with code " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void fileUploadCancelAction() throws IOException, InterruptedException {
        Thread.sleep(2000);
        //You need to change the filePath
        String filePath = "C:\\Users\\VictorMelo\\Desktop\\UploadFile\\UploadFileAutomation\\src\\main\\java\\AutoITscript\\CancellClick.exe";
        ProcessBuilder processBuilder = new ProcessBuilder(filePath);
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                //System.out.println("Process executed successfully");
            } else {
                System.err.println("Error: Process exited with code " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnChooseFileButtonDragAndDrop(){
        waitForWebElementAndClick(dragAndDropBtn);
    }
    public void ClickUploadBtn(){
        waitForWebElementAndClick(fileUploadBtn);
    }
}



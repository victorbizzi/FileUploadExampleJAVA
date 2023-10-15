package Tests;
import PageObjects.Base_Actions;
import PageObjects.FileUploadExample_PO;
import Settings.DriverFactory;
import org.junit.Test;
import java.io.IOException;
public class FileUploadTests extends Base_Actions{
    private FileUploadExample_PO fileUploadExample_po;
    public FileUploadTests() {
        fileUploadExample_po = new FileUploadExample_PO();
    }
    @Test
    public void UploadFile() throws InterruptedException, IOException {
        fileUploadExample_po.NavigateToFileUploaderPage();
        fileUploadExample_po.clickOnChooseFileButtonDragAndDrop();
        fileUploadExample_po.fileUploadAction();
        fileUploadExample_po.ClickUploadBtn();
        DriverFactory.cleanupDriver();
    }
    @Test
    public void CancelUploadButton() throws InterruptedException, IOException {
        fileUploadExample_po.NavigateToFileUploaderPage();
        fileUploadExample_po.clickOnChooseFileButtonDragAndDrop();
        fileUploadExample_po.fileUploadCancelAction();
        DriverFactory.cleanupDriver();
    }
}

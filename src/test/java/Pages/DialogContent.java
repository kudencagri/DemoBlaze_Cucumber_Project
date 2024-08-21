package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "")        public WebElement element;







    public  WebElement getWebElement(String strElement){
        switch (strElement){
            case ""                         :return this.element;
        }
        return null;
    }
}

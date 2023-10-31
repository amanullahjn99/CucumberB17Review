package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD


public class AddEmployeePage extends utlis.CommonMethods {
=======
import utlis.CommonMethods;


public class AddEmployeePage extends CommonMethods {
>>>>>>> a373050 (Oct30)

    @FindBy(id="firstName")
    public WebElement firstNameLoc;

    @FindBy(id="middleName")
    public WebElement middleNameLoc;

    @FindBy(id="lastName")
    public WebElement lastNameLoc;

    @FindBy(id="chkLogin")
    public WebElement checkBox;

    @FindBy(id="photofile")
    public WebElement photograph;
<<<<<<< HEAD

=======
    @FindBy(id="employeeId")
    public WebElement employeeIdLocator;
>>>>>>> a373050 (Oct30)
    @FindBy(id="user_name")
    public WebElement usernameEmp;

    @FindBy(id="user_password")
    public WebElement passwordEmp;

    @FindBy(id="re_password")
    public WebElement confirmPassword;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

<<<<<<< HEAD
    @FindBy(id="employeeId")
    public WebElement employeeIdLocator;
=======
//    @FindBy(id="employeeId")
//    public WebElement employeeIdLocator;

    @FindBy(xpath = "//input[@name='employeeId']")
    public WebElement employeeID;
>>>>>>> a373050 (Oct30)

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}
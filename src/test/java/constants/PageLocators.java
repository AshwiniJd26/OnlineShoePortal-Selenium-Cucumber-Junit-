package constants;


public class PageLocators {
    /* Login page locators */
    public static String menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";
    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_button_xpath = "//input[@value=\"Login\" and @type =\"submit\" ]";
    public static String viewProductCategories = "//h3[contains(text(),'Formal Shoes')]";

    /* Register page locators */
    public static String registration_heading_xpath = "/html/body/center/h1";
    public static String newUser_button_xpath = "//button[@id=\"NewRegistration\"]";
    public static String salution_dropdown_xpath ="//*[@id='Salutation']";
    public static String firstName_text_xpath =  "//*[@id=\"firstname\"]";
    public static String lastName_text_xpath = "//*[@id=\"lastname\"]";
    public static String emailId_text_id = "emailId";
    public static String contact_text_id = "contactNumber";
    public static String submit_button_xpath = "//input[@type='submit']";
}

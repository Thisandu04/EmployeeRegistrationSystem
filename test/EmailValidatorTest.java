import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void isValidEmail() {

        EmailValidator emailValidator = new EmailValidator();

        assertFalse(emailValidator.isValidEmail("test@example.com"),"Valid Email should pass");
        assertFalse(emailValidator.isValidEmail("test example.com"),"Email without @ should fail");
        assertFalse(emailValidator.isValidEmail("test@"),"Email without name server should fail");
        assertFalse(emailValidator.isValidEmail("test@.com"),"Email without domain name should fail");
        assertFalse(emailValidator.isValidEmail("@example.com"),"Empty email should fail");

    }

    @Test
    void isCompanyEmail() {
        EmailValidator emailValidator=new EmailValidator();

       assertTrue(emailValidator.isCompanyEmail("employee@company.com"),"valid email should pass");
        assertTrue(emailValidator.isCompanyEmail("employee@company.com"),"email with the wrong domain(employee@company.com)");
        assertFalse(emailValidator.isCompanyEmail("employee@sub.company.com"),"Invalid company email with subdomain(employee@company.com)");

    }
}
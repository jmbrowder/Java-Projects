public abstract class Employee

{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    protected Date bDate;



    // three-argument constructor
    public Employee( String first, String last, String ssn )
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    } // end three-argument Employee constructor

    public Employee( String first, String last, String ssn, Date bdate )
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        bDate = bdate;
    } // end three-argument Employee constructor



    // set first name

    public void setFirstName( String first )
    {
        firstName = first;
    } // end method setFirstName



    // return first name

    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName



    // set last name
    public void setLastName( String last )
    {
        lastName = last;
    } // end method setLastName



    // return last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName



    // set social security number

    public void setSocialSecurityNumber( String ssn )
    {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber



    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    public void setBirthDate( Date bdate )
    {
        bDate = bdate; // should validate
    } // end method setSocialSecurityNumber



    // return social security number
    public Date getBirthDate()
    {
        return bDate;
    } // end method getSocialSecurityNumber


    // return String representation of Employee object
    public String toString()
    {
        return String.format( "%s %s\nsocial security number: %s \nbirth date: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate() );
    } // end method toString

    // abstract method overridden by subclasses
    public abstract double earnings(); // no implementation here
} // end abstract class Employee
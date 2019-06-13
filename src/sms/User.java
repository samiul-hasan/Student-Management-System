/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

/**
 *
 * @author AL-AMIN
 */
public class User {

    private int id;
    private String Name;
    private String City;
    private int Phone;
    private String Email;
    private String Blood_group;
    private String Gender;

    public User(int Id, String Name, String City, int Phone, String Email, String Blood_group, String Gender) {

        this.id = Id;
        this.Name = Name;
        this.City = City;
        this.Phone = Phone;
        this.Email = Email;
        this.Blood_group=Blood_group;
        this.Gender = Gender;

    }

    User(int aInt, String string, String string0, int aInt0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

    public int getaphone() {
        return Phone;
    }

    

    public String getEmail() {
        return Email;
    }
public String getBlood_group() {
        return Blood_group;
    }
public String getGender() {
        return Gender;
    }

    Object getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

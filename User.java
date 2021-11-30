import java.util.Date;

public class User {
    
    private Date birthdate;
    private int size;
    private Photo photo;
    private Address address;

    public Date getBirthdate() {return this.birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;};

    public int getSize() {return this.size;}
    public void setSize(int size) {this.size = size;};

    public Photo getPhoto() {return this.photo;}
    public void setPhoto(Photo photo) {this.photo = photo;};

    public Address getAdress() {return this.address;}
    public void setAdress(Address address) {this.address = address;};
}

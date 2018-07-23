package sg.edu.rp.c346.contactslistapp;

public class Contact {

    private String name;
    private String code;
    private String contact;

    public Contact(String name, String code, String contact) {
        this.name = name;
        this.code = code;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

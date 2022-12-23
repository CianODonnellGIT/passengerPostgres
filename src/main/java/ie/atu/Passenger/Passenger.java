package ie.atu.Passenger;

import lombok.*;

import javax.persistence.*;

//import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
@AllArgsConstructor



public class Passenger {
    private String title;
    private String name;
    private long iD;
    private String phone;
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;

    public Passenger(String title, String name, String phone, int age, long iD) {
        this.title = title;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }


    public void setTitle(String title) {
        if (title.equals("Mr") || title == "Mrs" || title == "Ms")
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid title provided");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        int length = String.valueOf(phone).length();
        if (length > 10)
        {
            throw new IllegalArgumentException("Invalid phone length provided");
        }
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }


}

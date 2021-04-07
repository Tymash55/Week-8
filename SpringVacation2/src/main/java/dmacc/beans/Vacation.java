package dmacc.beans;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Vacation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="valueDesc")
	private String desc;
	
	private String country;
	private String city;
	private int days;

	
	public Vacation() {
		super();
		this.desc = "Spring Break";
	
	}
	
	public Vacation(String desc) {
		super();
		this.desc = desc;
	}
	
	public Vacation(String desc, String country, String city, int days) {
		super();
		this.desc = desc;
		this.days = days;
		this.country = country;
		this.city= city;
		this.days = days;
	}
	public Vacation(long id, String desc, String country, String city, int days) {
		super();
		this.id = id;
		this.desc = desc;
		this.days = days;
		this.country = country;
		this.city= city;
		this.days = days;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Vacation [id=" + id + ", desc=" + desc + ", country=" + country + ", city=" + city + ", days=" + days
				+ "]";
	}
	
}

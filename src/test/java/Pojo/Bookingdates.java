package Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Bookingdates {


@Override
	public String toString() {
		return "Bookingdates [checkin=" + checkin + ", checkout=" + checkout + "]";
	}

public Bookingdates() {
		
	}

public Bookingdates(String checkin, String checkout) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
	}

private String checkin;

private String checkout;

public String getCheckin() {
return checkin;
}

public void setCheckin(String checkin) {
this.checkin = checkin;
}

public String getCheckout() {
return checkout;
}

public void setCheckout(String checkout) {
this.checkout = checkout;
}

}
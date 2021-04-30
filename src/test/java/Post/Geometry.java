package Post;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry {

@SerializedName("type")
@Expose
private String type;
@SerializedName("coordinates")
@Expose
private List<List<List<Double>>> coordinates = null;

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public List<List<List<Double>>> getCoordinates() {
return coordinates;
}

public Geometry() {
	super();
}

public Geometry(String type, List<List<List<Double>>> coordinates) {
	super();
	this.type = type;
	this.coordinates = coordinates;
}

public void setCoordinates(List<List<List<Double>>> coordinates) {
this.coordinates = coordinates;
}

@Override
public String toString() {
	return "Geometry [type=" + type + ", coordinates=" + coordinates + "]";
}

}
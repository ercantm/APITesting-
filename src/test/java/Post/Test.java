package Post;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Test {

@SerializedName("name")
@Expose
private String name;
@SerializedName("geo_json")
@Expose
private GeoJson geoJson;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public GeoJson getGeoJson() {
return geoJson;
}

public void setGeoJson(GeoJson geoJson) {
this.geoJson = geoJson;
}

@Override
public String toString() {
	return "Test [name=" + name + ", geoJson=" + geoJson + "]";
}

public Test(String name, GeoJson geoJson) {
	super();
	this.name = name;
	this.geoJson = geoJson;
}

}
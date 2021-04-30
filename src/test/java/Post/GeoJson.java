package Post;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GeoJson {

@SerializedName("type")
@Expose
private String type;
@SerializedName("properties")
@Expose
private Properties properties;
@SerializedName("geometry")
@Expose
private Geometry geometry;

@Override
public String toString() {
	return "GeoJson [type=" + type + ", properties=" + properties + ", geometry=" + geometry + "]";
}

public GeoJson() {
	super();
}

public GeoJson(String type, Properties properties, Geometry geometry) {
	super();
	this.type = type;
	this.properties = properties;
	this.geometry = geometry;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public Properties getProperties() {
return properties;
}

public void setProperties(Properties properties) {
this.properties = properties;
}

public Geometry getGeometry() {
return geometry;
}

public void setGeometry(Geometry geometry) {
this.geometry = geometry;
}

}
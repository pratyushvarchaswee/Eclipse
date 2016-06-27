package java8.helper;

public class Sample {
	 String color;
	 String weight;
	 String name;
	 
	 public Sample(String str,String str2,String str3)
	 {
		 color=str;
		 weight=str2;
		 name=str3;
	 }
	 public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	 public String toString()
	 {
		 
		 return color+":"+weight+":"+name;
		 
	 }
}

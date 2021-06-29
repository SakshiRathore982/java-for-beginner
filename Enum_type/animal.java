package Enum_type;

public enum animal {
  cat("fergus"),dog("fibo"),mouse("stautard");
	private String name;
  animal(String name)
  {
	  this.name=name;
  }
public String getName() {
	return name;
}
 public String toString()
 {
	 return "this animal is called as "+name+"  kind";
 }
} 

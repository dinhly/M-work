public class Uniform{


private Boolean shoes;
private String scrubs;


 /* Constructors */
 
 public Uniform(){
  this(true,"Baby Blue");
 }

 public Uniform( Boolean hasShoes, String blueScrubs){ 
  setShoes(hasShoes);
  setScrubs(blueScrubs);
 }

/* Mutators */

 public void setShoes(Boolean hasShoes){
 shoes = hasShoes;
 }

 public void setScrubs(String  blueScrubs){
 scrubs = blueScrubs;
 }

/* Accessors */


private Boolean getShoes(){
  return shoes;
 }

private String getSrubs(){
  return scrubs;
 }

 public String toString(){
 return  "\nPerson has shoes: " + shoes +  "\nTheir scrubs color is: " + scrubs;
 } 
}
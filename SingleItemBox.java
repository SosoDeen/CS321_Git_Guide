/**
* A generic class that takes an item and puts it into a single box.
* 
*@author Starling Devine
*@param <T> the generic for the class
**/
public class SingleItemBox<T> {
	/**
	*A private T variable that represents the item stored in a box.
	**/
	private T item;
	
	/**
	* A default constructor that initalizes the private feild.
	*
	*@param item a generic type T that represents what will be stored in the box.
	**/
	public SingleItemBox(T item){
		this.item = item;
	}
	/**
	* A generic method that returns the item.
	*@return T the item stored in the box
	**/
	public T getItem(){
		return item;
	}
	
	
	//Commands for checkers
	//java -jar checkstyle.jar -c cs310code.xml 004-sdevine4-p0/*.java
	//java -jar checkstyle.jar -c cs310comments.xml 004-sdevine4-p0/*.java
	
}
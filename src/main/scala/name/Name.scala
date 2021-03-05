package name

class Name(val first: String) { //Support for last names can be added by modifying this class to add a protected string to the constructor and changing the toString override
  override def toString = s"$first"
}

public class StringManipulator { // create StringManipulator class
	public String trimAndConcat(String str1, String str2) { // implement trimAndConcat method

		String newstr1 = str1.trim();
		String newstr2 = str2.trim();
		// trim both input strings and then concatenate them
		// return new string (use trim method of the String class)

		// You can return newstr1 + newstr2 or the following below:
		return str1.trim() + str2.trim();

	}
	public Integer getIndexOrNull(String str, char character) {

		// get index of the character and return either the index or null
		// (use the indexOf method of the String class)
		// if the character returns multiple times, return the first index
		// return str.indexOf(character); ---> doesn't give null
		Integer char_index = str.indexOf(character);
			if (char_index >= 0) {
				return char_index;
			}
			else {
				return null;
			}
	}
	public Integer getIndexOrNull(String str1, String str2) {

		// get index of the start of the substring and return either the index or null
		// (use the indexOf method of the String class)
		// return str1.indexOf(str2); ---> doesn't give null
		Integer substring_index = str1.indexOf(str2);
			if (substring_index >= 0) {
				return substring_index;
			}
			else {
				return null;
			}
	}
	public String concatSubstring(String str1, int int1, int int2, String str2) {

		// get substring using a starting and ending index
		// concatenate that with the second string input to our method
		// (use the substring method of the String class)
		String substr = str1.substring(int1,int2) + str2;

		return substr;
	}
}











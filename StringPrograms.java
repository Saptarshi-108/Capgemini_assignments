package assessments;

import java.lang.String;
//Create a program to remove digits from string.
//Create a program to count how many aplhabets, digits and special characters are in a string.
//Create a program to convert every first character of word to uppercase.
// Create a program to convert every word last character to lower case.
// Create a program to swap every first and last character to be swapped.
//Create a program to remove all spaces.

public class StringPrograms {

	public static void countLetter(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void switchcase(String a) {
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 65 && a.charAt(i) <= 91) {
				b += (char) (a.charAt(i) + 32);
			} else if (a.charAt(i) >= 97 && a.charAt(i) <= 123) {
				b += (char) (a.charAt(i) - 32);
			} else {
				b += a.charAt(i);
			}
		}
		System.out.println(b);
	}

	public static void lengthmethod() {
		String s = "abc";
		int l = s.length();
		System.out.println(l);
		System.out.println(s.length());

	}

	public static void remove_digits_strings(String s) {
		String newstr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 91 || s.charAt(i) >= 97 && s.charAt(i) <= 123) {
				newstr += s.charAt(i);
			}
		}
		System.out.println("The new digits removed strings are =" + newstr);
	}

	public static void count_chars(String s) {
		int alpha_count = 0;
		int digi_count = 0;
		int special_count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 91 || s.charAt(i) >= 97 && s.charAt(i) <= 123) {
				alpha_count++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				digi_count++;
			}
		}
		special_count = s.length() - alpha_count - digi_count;
		System.out.println("Alphabets count - " + alpha_count);
		System.out.println("Digits count - " + digi_count);
		System.out.println("Special Characters - " + special_count);
	}

	public static void upperfirst(String s) {
		String newstr = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (i == 0 && c >= 'a' && c <= 'z') {
				newstr = newstr + (char) (c - 32);
			} else if (s.charAt(i - 1) == ' ' && c >= 'a' && c <= 'z') {
				newstr = newstr + (char) (c - 32);
			} else {
				newstr = newstr + c;
			}
		}

		System.out.println("New String - " + newstr);
	}

	public static void lowerlast(String s) {

		String[] arr_str = s.split(" ");
		for (String word : arr_str) {
			char last = word.charAt(word.length() - 1);
			if (last >= 65 && last <= 91) {
				word = word.replace(last, (char) (last + 32));
			}
			System.out.print(word);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void swap_first_last(String s) {

		String[] arr_str = s.split(" ");
		for (String word : arr_str) {
			char temp = word.charAt(word.length() - 1);
			char start = word.charAt(0);
			char end = start;
			start = temp;
			word = start + word.substring(1, word.length() - 1) + end;
			System.out.print(word);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void remove_all_spaces(String s) {
		String[] str_arr = s.split(" ");
		String string = "";
		for (String i : str_arr) {
			string += i;
		}
		System.out.println(string);
	}

	public static void main(String args[]) {
		String s = "asI djnK SJdkfj78@93G KDFJ2$%^5D7 8rhP";
		remove_digits_strings(s);
		count_chars(s);
		upperfirst(s);
		lowerlast(s);
		swap_first_last(s);
		remove_all_spaces(s);
	}
}

package leetcodeProblames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public String name;

	public static void main(String[] args) throws IOException {
		int[] nums = { 2, 3, 1, 2, 2, 3, 1, 1, 1, 3, 2, 2 };
//		float f=(float)1.5;
//		double d=2.5;
//		System.out.println(nums[(int)f]);

		Test t = new Test();
		t.test(nums);
		System.out.println(Arrays.toString(nums));

		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(9);
		list1.add(13);
		list1.add(8);
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(101);
		list2.add(92);
		list2.add(133);
		list2.add(84);

		Set<Integer> set = new HashSet<Integer>();
		System.out.println(set.add(10));
		System.out.println(set.add(11));
		System.out.println(set.add(10));

		// System.out.println(fact(300));

		// readFromSystem();
		// readFromFile();

//		redLineFromfile();
//
//		redLineFromSystem();

		//fileOutput();
		//fileOutputAppend();
		redLineFromfile();
		

		List<Integer> collect = Stream.of(list1, list2).flatMap(list -> list.stream().sorted(Integer::compare))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

	public static void test(int[] nums) {
		System.out.println("calling ");
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;

				}
			}

		}

	}

	public static BigInteger fact(int num) {
		BigInteger big = new BigInteger("1");
		for (int i = 2; i <= num; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}
		return big;
	}

	public static void readFromSystem() {
		try (Reader rd = new InputStreamReader(System.in)) {
			System.out.println("Enter the Number");
			int latter = rd.read();
			while (rd.ready()) {
				System.out.println((char) latter);
				latter = rd.read();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void readFromFile() {
		try (Reader rd = new FileReader("note.text")) {
			// System.out.println("Enter the Number");
			int latter;// use like this also
			while ((latter = rd.read()) != -1) {
				System.out.println((char) latter);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void redLineFromSystem() throws IOException {
		// byte steam to char steam then read char steam
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("you Enter ->" + bufferedReader.readLine());
	}

	public static void redLineFromfile() {
		// byte steam to char steam then read char steam
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("note1.text")))) {
			while (bufferedReader.ready()) {
				System.out.println(bufferedReader.readLine());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	public static void fileOutput() {
		try (FileWriter fileWriter = new FileWriter(new File("note1.text"))) {
			fileWriter.write(" hello 1");
			// write the character of the number 
			fileWriter.write(97);
			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//when we want to append the text with older 
	public static void fileOutputAppend() {
		try (Writer fileWriter = new FileWriter(new File("note1.text"),true)) {
			fileWriter.write(" hello frineds");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void fileOutputWithBufferWriter() {
		try (Writer fileWriter = new BufferedWriter( new FileWriter(new File("note1.text")))){ 
			fileWriter.write(" hello frineds");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

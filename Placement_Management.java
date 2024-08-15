/*

 Mini project = Placement cell management

 Group participant: 

 UCE2022602 : Pallavi Panhale

 UCE2022604: Dhanashri Pardeshi

 UCE2022611 : Komal Patil

 */

package miniproject;

import java.util.ArrayList;

import java.util.regex.Pattern;

import java.util.*;

class Student {

	Scanner sc = new Scanner(System.in);

	// Define attributes for student

	String name, branch;

	int Stud_id;

	String phone, email, Linkedin, education, skills, hobbies, DOB, password;

	String achievements;

	float CGPA;

//constructor to initialize student object

	public Student(String name, String branch, String phone, String email, String Linkedin, String education,

			String skills, String hobbies, float CGPA, int Stud_id, String achievements, String DOB, String password) {

		this.name = name;

		this.Stud_id = Stud_id;

		this.branch = branch;

		this.phone = phone;

		this.email = email;

		this.Linkedin = Linkedin;

		this.education = education;

		this.skills = skills;

		this.hobbies = hobbies;

		this.achievements = achievements;

		this.DOB = DOB;

		this.password = password;

		this.CGPA = CGPA;

	}

	// getter and setter for student attributes

	public Scanner getSc() {

		return sc;

	}

	public void setSc(Scanner sc) {

		this.sc = sc;

	}

	public String getDOB() {

		return DOB;

	}

	public void setDOB(String dOB) {

		DOB = dOB;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getBranch() {

		return branch;

	}

	public void setBranch(String branch) {

		this.branch = branch;

	}

	public int getStud_id() {

		return Stud_id;

	}

	public void setStud_id(int stud_id) {

		Stud_id = stud_id;

	}

	public String getPhone() {

		return phone;

	}

	public void setPhone(String phone) {

		this.phone = phone;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getLinkedin() {

		return Linkedin;

	}

	public void setLinkedin(String linkedin) {

		Linkedin = linkedin;

	}

	public String getEducation() {

		return education;

	}

	public void setEducation(String education) {

		this.education = education;

	}

	public String getSkills() {

		return skills;

	}

	public void setSkills(String skills) {

		this.skills = skills;

	}

	public String getHobbies() {

		return hobbies;

	}

	public void setHobbies(String hobbies) {

		this.hobbies = hobbies;

	}

	public String getAchievements() {

		return achievements;

	}

	public void setAchievements(String achievements) {

		this.achievements = achievements;

	}

	public float getCGPA() {

		return CGPA;

	}

	public void setCGPA(float cGPA) {

		CGPA = cGPA;

	}

}

class Company {

	// define attributes for company

	String intro;

	String industry;

	int comp_Size;

	String name_c;

	String headquarter;

	String type;

	String specialities;

	String posts;

	Student next;

	// constructor to initialize company object

	public Company(String intro, String industry, int comp_Size, String name_c, String headquarter, String type,

			String specialities, String posts, Company next) {

		this.intro = intro;

		this.industry = industry;

		this.comp_Size = comp_Size;

		this.name_c = name_c;

		this.headquarter = headquarter;

		this.type = type;

		this.specialities = specialities;

		this.posts = posts;

		this.next = null;

	}

	// getter and setter methods for company attributes

	public String getIntro() {

		return intro;

	}

	public void setIntro(String intro) {

		this.intro = intro;

	}

	public String getIndustry() {

		return industry;

	}

	public void setIndustry(String industry) {

		this.industry = industry;

	}

	public int getComp_Size() {

		return comp_Size;

	}

	public void setComp_Size(int comp_Size) {

		this.comp_Size = comp_Size;

	}

	public String getName_c() {

		return name_c;

	}

	public void setName_c(String name_c) {

		this.name_c = name_c;

	}

	public String getHeadquarter() {

		return headquarter;

	}

	public void setHeadquarter(String headquarter) {

		this.headquarter = headquarter;

	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public String getSpecialities() {

		return specialities;

	}

	public void setSpecialities(String specialities) {

		this.specialities = specialities;

	}

	public String getPosts() {

		return posts;

	}

	public void setPosts(String posts) {

		this.posts = posts;

	}

	public Student getNext() {

		return next;

	}

	public void setNext(Student next) {

		this.next = next;

	}

}

class Student_registration {

	Job_posting obj1 = new Job_posting();

	ArrayList<Student> stud = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	int Stud_id;

	String name, branch;

	String phone, email, Linkedin, education, skills, hobbies, password, DOB;

	String achievements;

	float CGPA;

	Boolean bool = false;

	int a = 0;

	// method to add student details

	String add_Student_details(ArrayList<Student> stud) {

		// input student information and validate it

		for (int i = 0; i < 1; i++) {

			int ch1 = 0;

			System.out.println("Enter your information");

			System.out.println("Enter Id:");

			Stud_id = sc.nextInt();

			for (Student student : stud) {

				if (student.getStud_id() == Stud_id) {

					bool = true;

					break;

				}

			}

			if (bool) {

				System.out.println("Student with id " + Stud_id + " already exists");

			} else {

				do {

					System.out.println("Enter Full name:");

					name = sc.next();

					sc.next();

					for (i = 0; i < name.length(); i++) {

						char ch = name.charAt(i);

						ch1 = (int) ch; // converting character into integer(ASCII value)

						if ((ch1 < 65 || (ch1 > 90 && ch1 < 97) || ch1 > 122) && ch1 != 32) {

							System.out.println("Please enter valid name with alphabets only!!");

							a = 1;

							break;

						}

					}

				} while (a != 0);

				System.out.println("Enter DOB (Please enter in DD-MM-YYYY) :");

				String DOB = sc.next();

				do {

					System.out.println("Enter your branch: ");

					branch = sc.next();

					if (!branch.equalsIgnoreCase("Computer") && !branch.equalsIgnoreCase("IT")

							&& !branch.equalsIgnoreCase("Entc") && !branch.equalsIgnoreCase("Mechanical")

							&& !branch.equalsIgnoreCase("Instrumentation")) {

						System.out.println(

								"Please valid branch(Either Computer or IT or Entc or Mechanical or Instrumentation..\n");

					} else {

						break;

					}

				} while (true);

				do {

					System.out.println("Enter phone number: ");

					phone = sc.next();

					if (phone.length() == 10 && phone.matches("[789]\\d{9}")) {

						break;

					} else {

						System.out.println(

								"Please enter a valid phone number starting with 7, 8, or 9 and containing exactly 10 digits.\n");

					}

				} while (true);

				do {

					System.out.println("Password (Please enter DD-MM-YYYY): ");

					password = sc.next();

					if (!password.equals(DOB)) {

						System.out.println("Please enter correct password!!");

					} else {

						break;

					}

				} while (true);

				do {

					System.out.println("Enter email addresss:");

					email = sc.next();

					String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

					Pattern pattern = Pattern.compile(emailRegex);

					if (pattern.matcher(email).matches()) {

						break;

					} else {

						System.out.println("Please enter valid email-ID!!");

					}

				} while (true);

				System.out.println("Linkedin profile (Optional)");

				Linkedin = sc.next();

				System.out.println("Education: ");

				education = sc.next();

				System.out.println("Skills:");

				skills = sc.next();

				System.out.println("Hobbies: ");

				hobbies = sc.next();

				System.out.println("Achievements: ");

				achievements = sc.next();

				do {

					System.out.println("CGPA");

					CGPA = sc.nextFloat();

					if (CGPA <= 0 || CGPA > 10) {

						System.out.println("Please enter valid CGPA(between 1 to 10)");

					} else {

						break;

					}

				} while (true);

// add newstudent object to arraylist

				Student newStudent = new Student(name, branch, phone, email, Linkedin, education, skills, hobbies, CGPA,

						Stud_id, achievements, DOB, password);

				stud.add(newStudent);

			}

		}

		// return password for further use

		return password;

	}

	// method to display student details

	void display_Student(ArrayList<Student> stud) {

		// iterate through list of students and print their details

		for (Student student : stud) {

			System.out.println("Display information of student:");

			System.out.println("Full name:" + student.name);

			System.out.println("ID: " + student.Stud_id);

			System.out.println("Branch: " + student.branch);

			System.out.println("Phone number:" + student.phone);

			System.out.println("Email: " + student.email);

			System.out.println("Linkendin profile:" + student.Linkedin);

			System.out.println("Education:" + student.education);

			System.out.println("Skills:" + student.skills);

			System.out.println("Hobbies:" + student.hobbies);

			System.out.println("Achievements(including technical): " + student.achievements);

			System.out.println("CGPA:" + student.CGPA);

			System.out.println();

		}

		if (stud.isEmpty()) {

			System.out.println("No Student details entered yet!!");

			return;

		}

	}

	// method to delete student

	void deleteStudent(ArrayList<Student> stud) {

		if (stud.isEmpty()) {

			System.out.println("No student details entered yet!!");

			return;

		}

		System.out.println("Enter student id you want to delete:");

		int delId = sc.nextInt();

		ArrayList<Integer> indicesToRemove = new ArrayList<>();

		for (int i = 0; i < stud.size(); i++) {

			Student student = stud.get(i);

			if (student.getStud_id() == delId) {

				indicesToRemove.add(i);

			}

		}

		if (indicesToRemove.isEmpty()) {

			System.out.println("Student with given id not found.");

			return;

		}

		for (int i : indicesToRemove) {

			stud.remove(i);

		}

		System.out.println("Student details deleted successfully!!");

	}

	// method to update student information

	void update_student_info(ArrayList<Student> stud, String pass) {

		int Update_id;

		System.out.println("Enter your ID:");

		Update_id = sc.nextInt();

		if (stud.isEmpty()) {

			System.out.println("No Student details entered yet!!");

			return;

		}

		for (int i = 0; i < stud.size(); i++) {

			if (stud.get(i).Stud_id == (Update_id)) {

				do {

					System.out.println("Password (Please enter DD-MM-YYYY): ");

					password = sc.next();

					if (!password.equals(pass)) {

						System.out.println("Please enter correct password!!");

					} else {

						break;

					}

				} while (true);

				display_Student(stud);

				System.out.println();

				System.out.println("Which details do you want to update from the following:");

				System.out.println(

						"1:Name\n2.ID:\n3.Branch\n4.Phone no.\n5.Email\n6.Linkedin profile\n7.Education\n8.Skills\n9.Hobbies\n10.Achievements\n11.CGPA");

				int choice = sc.nextInt();

				switch (choice) {

				case 1:

					do {

						System.out.println("Enter Full name:");

						name = sc.next();

						for (i = 0; i < name.length(); i++) {

							char ch = name.charAt(i);

							choice = (int) ch;

							if ((choice < 65 || (choice > 90 && choice < 97) || choice > 122) && choice != 32) {

								System.out.println("Please enter a valid name with alphabets only!!");

// If you want to break out of the loop when an invalid character is found

// you can use 'break' here.

							} else {

								break;

							}

						}

					} while (!(choice < 65 || (choice > 90 && choice < 97) || choice > 122) && choice != 32);

					stud.get(i).setName(name);

					break;

				case 2:

					System.out.println("ID: ");

					Stud_id = sc.nextInt();

					stud.get(i).setStud_id(Stud_id);

					break;

				case 3:

					do {

						System.out.println("Enter your branch: ");

						branch = sc.next();

						if (!branch.equalsIgnoreCase("Computer") && !branch.equalsIgnoreCase("IT")

								&& !branch.equalsIgnoreCase("Entc") && !branch.equalsIgnoreCase("Mechanical")

								&& !branch.equalsIgnoreCase("Instrumentation")) {

							System.out.println(

									"Please valid branch(Either Computer or IT or Entc or Mechanical or Instrumentation..\n");

						} else {

							break;

						}

					} while (true);

					stud.get(i).setBranch(branch);

					break;

				case 4:

					do {

						System.out.println("Enter phone number: ");

						phone = sc.next();

						if (phone.length() == 10 && phone.matches("[789]\\d{9}")) {

							break;

						} else {

							System.out.println(

									"Please enter a valid phone number starting with 7, 8, or 9 and containing exactly 10 digits.\n");

						}

					} while (true);

					stud.get(i).setPhone(phone);

					break;

				case 5:

					do {

						System.out.println("Enter email addresss:");

						email = sc.next();

						String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

						Pattern pattern = Pattern.compile(emailRegex);

						if (pattern.matcher(email).matches()) {

							break;

						} else {

							System.out.println("Please enter valid email-ID!!");

						}

					} while (true);

					stud.get(i).setEmail(email);

					break;

				case 6:

					System.out.println("Linkedin profile: ");

					Linkedin = sc.next();

					stud.get(i).setLinkedin(Linkedin);

					break;

				case 7:

					System.out.println("Education: ");

					education = sc.next();

					stud.get(i).setEducation(education);

					break;

				case 8:

					System.out.println("Skills: ");

					skills = sc.next();

					stud.get(i).setSkills(skills);

					break;

				case 9:

					System.out.println("Hobbies:");

					hobbies = sc.next();

					stud.get(i).setHobbies(hobbies);

					break;

				case 10:

					System.out.println("Achievements:");

					achievements = sc.next();

					stud.get(i).setAchievements(achievements);

					break;

				case 11:

					do {

						System.out.println("CGPA");

						CGPA = sc.nextFloat();

						if (CGPA <= 0 || CGPA > 10) {

							System.out.println("Please enter valid CGPA(between 1 to 10)");

						} else {

							break;

						}

					} while (true);

					stud.get(i).setCGPA(CGPA);

					break;

				}

			} else {

				System.out.println("Student with given ID not found!!");

			}

		}

	}

}

class Job_posting {

	// define attributes and methods related to job posting

	ArrayList<Company> comp = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	String intro, branch;

	String industry;

	int comp_Size;

	String name_c;

	String headquarter;

	String type;

	String specialities;

	String posts;

	Company next;

	void add_companyDetails(ArrayList<Company> comp) {

		System.out.println("Enter no. of companies that are coming in this year:");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter company details: ");

			System.out.println("Name: ");

			name_c = sc.next();

			System.out.println("Description:");

			intro = sc.next();

			System.out.println("Industry(domain) : ");

			industry = sc.next();

			System.out.println("Company size: ");

			comp_Size = sc.nextInt();

			System.out.println("Headquarter: ");

			headquarter = sc.next();

			System.out.println("Type: ");

			type = sc.next();

			System.out.println("Specialities: ");

			specialities = sc.next();

			System.out.println("Posts: ");

			posts = sc.next();

			// add newcompany object to arraylist

			Company newCompany = new Company(intro, industry, comp_Size, name_c, headquarter, type, specialities, posts,

					next);

			comp.add(newCompany);

		}

	}

	void display_Company(ArrayList<Company> comp) {

// for-each loop to iterate through list

		for (Company company : comp) {

			System.out.println("Display company details: ");

			System.out.println("Name: " + company.name_c);

			System.out.println("Description: " + company.intro);

			System.out.println("Industry(domain): " + company.industry);

			System.out.println("Company size: " + company.comp_Size);

			System.out.println("Headquarter: " + company.headquarter);

			System.out.println("Type: " + company.type);

			System.out.println("Specialities: " + company.specialities);

			System.out.println("Posts: " + company.posts);

			System.out.println();

		}

		if (comp.isEmpty()) {

			System.out.println("No company details entered yet!!");

			return;

		}

	}

	// method to delete company details

	void delete_compDetails(ArrayList<Company> comp) {

		String del_comp;

		System.out.println("Enter company name to be deleted :");

		del_comp = sc.next();

		if (comp.isEmpty()) {

			System.out.println("No company details entered yet!!");

			return;

		}

		for (Company company : comp) {

			if (company.name_c.equalsIgnoreCase(del_comp)) {

				comp.remove(company);

				System.out.println("Company details deleted successfully!!");

				return;

			} else {

				System.out.println("Company name not found");

				return;

			}

		}

	}

	// method to update company details

	void update_companyDetails(ArrayList<Company> comp) {

		System.out.println("Enter company name to be updated: ");

		String upd_comp = sc.next();

		if (comp.isEmpty()) {

			System.out.println("No company details entered yet!!");

			return;

		}

		for (int i = 0; i < comp.size(); i++) {

			int choice;

			if (comp.get(i).name_c.equalsIgnoreCase(upd_comp)) {

				display_Company(comp);

				System.out.println("Which details do you want to update from the following:");

				choice = sc.nextInt();

				switch (choice) {

				case 1:

					System.out.println("Name: ");

					name_c = sc.next();

					comp.get(i).setName_c(name_c); // update data using getter and setter methods

					break;

				case 2:

					System.out.println("Description: ");

					intro = sc.next();

					comp.get(i).setIntro(intro);

					;

					break;

				case 3:

					System.out.println("Industry(domain): ");

					industry = sc.next();

					comp.get(i).setIndustry(industry);

					break;

				case 4:

					System.out.println("Company size:");

					comp_Size = sc.nextInt();

					comp.get(i).setComp_Size(comp_Size);

					break;

				case 5:

					System.out.println("Headquarter: ");

					headquarter = sc.next();

					comp.get(i).setHeadquarter(headquarter);

					break;

				case 6:

					System.out.println("Type:");

					type = sc.next();

					comp.get(i).setType(type);

					break;

				case 7:

					System.out.println("Specialities: ");

					specialities = sc.next();

					comp.get(i).setSpecialities(specialities);

					break;

				case 8:

					System.out.println("Posts: ");

					posts = sc.next();

					comp.get(i).setPosts(posts);

					break;

				}

			} else {

				System.out.println("No such company exist");

				return;

			}

		}

	}

}

class Node {

	// Node represents a student with following attributes

	String name, branch, email, pass, DOB;

	int id;

	float CGPA;

	Node next;

	Node front;

	// constructor to initialize node object

	public Node(String name, String branch, String email, String pass, int id, float CGPA, Node next, String DOB) {

		this.name = name;

		this.branch = branch;

		this.email = email;

		this.pass = pass;

		this.id = id;

		this.CGPA = CGPA;

		this.DOB = DOB;

		this.next = null;

	}

}

//placement record class for maintaining placement records of specific branch students

class Placementrecord {

	Scanner sc = new Scanner(System.in);

	Node front = null;

	String name, branch, email, pass, DOB;

	int a = 0;

	int id;

	float CGPA;

	Node next, temp;

	int ch1;

	int comp_counter = 0;

	int it_counter = 0;

	int entc_counter = 0;

	int mech_counter = 0;

	int instru_counter = 0;

	public boolean isEmpty() {

		return front == null;

	}

	public void apply() {// enqueue student //give access to the student

		System.out.println("Enter your following details: ");

		// input student information and validate it

		do {

			temp = front;

			System.out.println("Enter Full name:");

			name = sc.next();

			for (int i = 0; i < name.length(); i++) {

				char ch = name.charAt(i);

				ch1 = (int) ch;

				if ((ch1 < 65 || (ch1 > 90 && ch1 < 97) || ch1 > 122) && ch1 != 32) {

					System.out.println("Please enter valid name with alphabets only!!");

					a = 1;

					break;

				}

			}

		} while (a != 0);

		System.out.println("ID:");

		id = sc.nextInt();

		System.out.println("DOB (Please enter DD-MM-YYYY): ");

		DOB = sc.next();

		do {

			System.out.println("Enter your branch: ");

			branch = sc.next();

			if (!branch.equalsIgnoreCase("Computer") && !branch.equalsIgnoreCase("IT")

					&& !branch.equalsIgnoreCase("Entc") && !branch.equalsIgnoreCase("Mechanical")

					&& !branch.equalsIgnoreCase("Instrumentation")) {

				System.out.println(

						"Please valid branch(Either Computer or IT or Entc or Mechanical or Instrumentation..\n");

			} else {

				break;

			}

		} while (true);

		do {

			System.out.println("Enter email addresss:");

			email = sc.next();

			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

			Pattern pattern = Pattern.compile(emailRegex);

			if (pattern.matcher(email).matches()) {

				break;

			} else {

				System.out.println("Please enter valid email-ID!!");

			}

		} while (true);

		do {

			// DOB for verification purpose (DOB as password)

			System.out.println("Password (Please enter DD-MM-YYYY): ");

			pass = sc.next();

			if (!pass.equals(DOB)) {

				System.out.println("Please enter correct password!!");

			} else {

				break;

			}

		} while (true);

		do {

			System.out.println("CGPA");

			CGPA = sc.nextFloat();

			if (CGPA <= 0 || CGPA > 10) {

				System.out.println("Please enter valid CGPA(between 1 to 10)");

			} else {

				break;

			}

		} while (true);

		Node newNode = new Node(name, branch, email, pass, id, CGPA, next, DOB);

		if (isEmpty() || newNode.CGPA > front.CGPA) { // cgpa criteria

			newNode.next = front;

			front = newNode;

		} else {

			Node current = front;

			while (current.next != null && newNode.CGPA <= current.next.CGPA) {

				current = current.next;

			}

			newNode.next = current.next;

			current.next = newNode;

		}

	}

	// method to display student details who had applied for placement

	public void displayApplyStdDetails() {

		if (front == null) {

			System.out.println("No student had applied yet !!");

			return;

		} else {

			Node curr = front;

			while (curr != null) {

				// print student details

				System.out.println("Name :" + curr.name);

				System.out.println("Id :" + curr.id);

				System.out.println("Branch :" + curr.branch);

				System.out.println("Email :" + curr.email);

				System.out.println("CGPA :" + curr.CGPA);

				System.out.println();

				curr = curr.next;

			}

		}

	}

	// method to dequeue students who had satisfied the criteria (using priority
	// queue using linked list)

	public void priority_dequeue() { // give access to the company

		Node curr = front;

		if (isEmpty()) {

			System.out.println("No students applied yet!!");

			return;// Queue is empty

		}

		System.out.println("no. of students:");

		int n = sc.nextInt();

		System.out.println("Please Enter branch from the following: ");

		System.out.println("1.Computer\n2.IT\n3.ENTC\n4.Mechanical\n5.Instumentation");

		int branch1 = sc.nextInt();

		switch (branch1) {

		case 1:

			for (int i = 0; i < n; i++) {

				if (curr.CGPA >= 8 && curr.CGPA <= 10 && branch1 == 1) {

					System.out.println(front.name + "with " + front.id + "\nis eligible for placement");

					front = front.next;

					comp_counter++;

				} else {

					System.out.println("Better luck next time!!!");

				}

			}

			System.out.println("Number of eligible students from Computer department:" + comp_counter);

			break;

		case 2:

			for (int i = 0; i < n; i++) {

				if (curr.CGPA >= 8 && curr.CGPA <= 10 && branch1 == 2) {

					System.out.println(front.name + "with" + front.id + "\nis eligible for placement");

					front = front.next;

					it_counter++;

				} else {

					System.out.println("Better luck next time!!!");

				}

			}

			System.out.println("Number of eligible students from IT department:" + it_counter);

			break;

		case 3:

			for (int i = 0; i < n; i++) {

				if (curr.CGPA >= 8 && curr.CGPA <= 10 && branch1 == 3) {

					System.out.println(front.name + "with" + front.id + "\nis eligible for placement");

					front = front.next;

					entc_counter++;

				} else {

					System.out.println("Better luck next time!!!");

				}

			}

			System.out.println("Number of eligible students from ENTC department:" + entc_counter);

			break;

		case 4:

			for (int i = 0; i < n; i++) {

				if (curr.CGPA >= 8 && curr.CGPA <= 10 && branch1 == 4) {

					System.out.println(front.name + "with" + front.id + "\nis eligible for placement");

					front = front.next;

					mech_counter++;

				} else {

					System.out.println("Better luck next time!!!");

				}

			}

			System.out.println("Number of eligible students from Mechanical department:" + mech_counter);

			break;

		case 5:

			for (int i = 0; i < n; i++) {

				if (curr.CGPA >= 8 && curr.CGPA <= 10 && branch1 == 5) {

					System.out.println(front.name + "with" + front.id + "\nis eligible for placement");

					front = front.next;

					instru_counter++;

				} else {

					System.out.println("Better luck next time!!!");

				}

			}

			System.out.println("Number of eligible students from Instrumentation department:" + instru_counter);

			break;

		}

	}

}

public class Main {

	static ArrayList<Student> stud = new ArrayList<>();

	static ArrayList<Company> comp = new ArrayList<>();

	String name;

	String phone, email, Linkedin, education, skills, hobbies;

	static String password;

	String tech_achieve, non_tech_achieve, professional_member;

	float CGPA;

	public static void main(String[] args) {

		// creating instances of classes

		Student_registration obj = new Student_registration();

		Job_posting obj1 = new Job_posting();

		Placementrecord obj2 = new Placementrecord();

		Scanner sc = new Scanner(System.in);

		int choice = 1;

		int ch = 1;

		String pass = null;

		do {

			System.out.println("Press p for placementcell and s for student");

			String n = sc.next();

			outer: if (n.equalsIgnoreCase("p")) {

				System.out.println("Enter your password: ");

				password = sc.next();

				if (password.equals("cummins@123")) {

					System.out.println(

							"MENU:\n1.Add New Company\n2.Display Company Details\n3.Delete Company Details\n4.Update Company Details\n5.Update Counter\n6.Display Student Details\n");

					ch = sc.nextInt();

					switch (ch) {

					case 1:

						// method call for details of comapany and add method

						obj1.add_companyDetails(comp);

						break;

					case 2:

						System.out.println("Display details of company");

						obj1.display_Company(comp);

						// call display method

						break;

					case 3:

// method call to delete company details

						obj1.delete_compDetails(comp);

						break;

					case 4:

// call update method

						obj1.update_companyDetails(comp);

						break;

					case 5:

						obj2.priority_dequeue();

// method call for update counter

						break;

					case 6:

						// method for applied students

						obj2.displayApplyStdDetails();

						break;

					case 0:

						// exit

						System.out.println("Exit");

						break;

					}

				} else {

					System.out.println("OOPS!!Please enter correct password");

					break outer;

				}

			} else if (n.equalsIgnoreCase("s")) {

				int ch2 = 1;

				System.out.println(

						"MENU: \n1.Add students\n2.Delete students\n3.Display company details for student\n4.Display student details\n5.Update student details\n6.Apply for company");

				ch2 = sc.nextInt();

				switch (ch2) {

				case 1:

// call add method for students details

					pass = obj.add_Student_details(stud);

					System.out.println(pass);
					;

					break;

				case 2:

// delete student details

					obj.deleteStudent(stud);

					break;

				case 3:

// display company details for student

					obj1.display_Company(comp);

					break;

				case 4:

// display student details

					obj.display_Student(stud);

					break;

				case 5:

// Update student details

					obj.update_student_info(stud, pass);

					break;

				case 6:

//Apply student for placement

					obj2.apply();

					break;

				}

			} else {

				System.out.println("Please enter p or s !!!");

			}

		} while (choice != 0);

		sc.close();

	}

}
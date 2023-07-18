package sakthe2;

public class markAllocation {
public static void main(String args[]) {
	int marks[] = { 25, 65, 46, 98, 78, 65 };
	int max_marks = marks . length * 100;
	int total = 0;
	char grade = 'F';
	for (int i = 0; i < marks.length; i++) {
		total += marks[i];
	}
	double percentage = ((double)(total) / max_marks) * 100;
	if (percentage >= 90) {
		grade = 'A';
	}
	else {
		if (percentage >= 80 && percentage <= 89) {
			grade = 'B';
		}
		else {
			if (percentage >=60 && percentage <= 79) {
				grade = 'C';
			}
			else {
				grade = 'D';
			}
		}
	}
	System.out.println(grade);
	
	/*enter mark  96
	 * 	1<=35	|	36<60	fail
	 * 60<=80   || 81<=100	pass
	 * 90<=100				O grade
	 */
}
}
 

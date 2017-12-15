package stradegy.utoronto.utsc.grader.grades;

public class NumericGrade implements Grade {
	// numeric grade
	private int score;

	/**
	 * Creates a new <code>Grade</code> with the given value.
	 * 
	 * @param score
	 *            the numeric value of the new <code>Grade</code>, must be in
	 *            the range [0, 100].
	 * @throws InvalidGradeException
	 *             if grade is not in [0, 100]
	 */
	public NumericGrade(int score) throws InvalidGradeException {
		if (0 <= score && score <= 100) {
			this.score = score;
		} else {
			throw new InvalidGradeException(String.format("Invalid value for grade: %d", score));
		}
	}

	@Override
	public double getCGPA() {
		double gpa;
		if (this.score < 50) { // special rule for 0-49
			return 0.0;
		}
		if (this.score >= 85) { // special rules for 80-100
			return 4.0;
		}
		if (this.score >= 80) {
			return 3.7;
		}
		// the rest follow the same pattern
		gpa = this.score / 10 - 4;
		int d0 = this.score % 10;
		if (d0 < 3) {
			gpa -= 0.3;
		}
		if (d0 > 6) {
			gpa += 0.3;
		}
		return gpa;
	}

}

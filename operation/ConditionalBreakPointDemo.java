package operation;

import java.util.Arrays;
import java.util.Objects;

class CourseEvaluation {
    String courseName;
    float content;
    float teaching;
    float grading;
    float workload;
    String[] reviews;

    public CourseEvaluation(String courseName, float content, float teaching, float grading, float workload, String[] reviews) {
        this.content = content;
        this.teaching = teaching;
        this.grading = grading;
        this.courseName = courseName;
        this.workload = workload;
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseEvaluation that)) return false;
        return Float.compare(content, that.content) == 0 && Float.compare(teaching, that.teaching) == 0 && Float.compare(grading, that.grading) == 0 && Float.compare(workload, that.workload) == 0 && Objects.equals(courseName, that.courseName) && Objects.deepEquals(reviews, that.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, content, teaching, grading, workload, Arrays.hashCode(reviews));
    }

    @Override
    public String toString() {
        return "CourseEvaluation{" +
                "courseName='" + courseName + '\'' +
                ", content=" + content +
                ", teaching=" + teaching +
                ", grading=" + grading +
                ", workload=" + workload +
                ", reviews=" + Arrays.toString(reviews) +
                '}';
    }
}

public class ConditionalBreakPointDemo {
    public static void main(String[] args) {
        CourseEvaluation[] evaluations = {
                new CourseEvaluation("Math 101", 2.0f, 2.7f, 3.0f, 2.3f, new String[]{"Good course", "Challenging exams"}),
                new CourseEvaluation("History 102", 1.7f, 2.0f, 2.3f, 1.7f, new String[]{"Interesting content", "Too much reading"}),
                new CourseEvaluation("Physics 201", 3.3f, 3.0f, 3.7f, 2.7f, new String[]{"Well organized", "Tough grading"}),
                new CourseEvaluation("Chemistry 101", 1.3f, 1.7f, 2.0f, 2.3f, new String[]{"Very basic", "Easy to pass"}),
                new CourseEvaluation("Computer Science 301", 4.0f, 4.3f, 3.7f, 4.0f, new String[]{"Excellent teaching", "Excellent grading"})
        };

        for (CourseEvaluation evaluation : evaluations) {
            System.out.printf("Evaluation of %s is viewed.\n", evaluation.courseName); // set a conditional breakpoint here
        }
    }
}

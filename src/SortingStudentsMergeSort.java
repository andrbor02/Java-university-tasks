import java.util.Arrays;

public class SortingStudentsMergeSort {
    public void SortUnsorted(Student[] source, int leftBorder, int rightBorder) {

        if (rightBorder <= leftBorder)
            return;
        int mid = leftBorder + (rightBorder - leftBorder) / 2;
        SortUnsorted(source, leftBorder, mid);
        SortUnsorted(source, mid + 1, rightBorder);

        Student[] buf = Arrays.copyOf(source, source.length);

        int i = leftBorder, j = mid + 1;
        for (int k = leftBorder; k <= rightBorder; k++) {

            if (i > mid) {
                source[k] = buf[j];
                j++;
            } else if (j > rightBorder) {
                source[k] = buf[i];
                i++;
            } else if (buf[j].getFinalBall() < buf[i].getFinalBall()) {
                source[k] = buf[j];
                j++;
            } else {
                source[k] = buf[i];
                i++;
            }
        }
    }
}

package ArrayProblem_BinarySearch;

class GuessGame {
    // The secret number to guess
    private int secret;

    // Constructor to set the secret number
    public GuessGame(int secret) {
        this.secret = secret;
    }

    public int guess(int num) {
        if (num > secret) {
            return -1;
        } else if (num < secret) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class GuessNumber extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                ans = mid;
                break;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }
}

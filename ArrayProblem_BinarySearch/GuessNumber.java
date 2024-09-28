package ArrayProblem_BinarySearch;

public class GuessNumber {

    // Inner class GuessGame
    static class GuessGame {
        // The secret number to guess
        private int secret;

        // Constructor to set the secret number
        public GuessGame(int secret) {
            this.secret = secret;
        }

        // Method to compare the guessed number with the secret
        // -1 if num is greater than secret, 1 if num is less, 0 if equal
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

    // Instance of GuessGame
    private GuessGame game;

    // Constructor to initialize GuessGame with a secret number
    public GuessNumber(int secret) {
        this.game = new GuessGame(secret);
    }

    // Method to guess the number using binary search
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (game.guess(mid) == 0) {
                ans = mid;
                break;
            } else if (game.guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int secret = 6; // Set the secret number
        GuessNumber game = new GuessNumber(secret);
        System.out.println("The number to guess is: " + game.guessNumber(n));
    }
}

package ss8.bai_tap.lesson1;

public class TennisGame {
    private static final int MIN_POINTS_TO_WIN = 4;
    private static final int WIN_DIFFERENCE = 2;

    private final String player1Name;
    private final String player2Name;

    private int player1Score;
    private int player2Score;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Score++;
        } else if (playerName.equals(player2Name)) {
            player2Score++;
        }
    }

    public String getScore() {

        if (isDeuce()) {
            return "Deuce";
        }

        if (hasWinner()) {
            return "Win for " + getLeadingPlayerName();
        }

        if (hasAdvantage()) {
            return "Advantage " + getLeadingPlayerName();
        }

        return getNormalScore();
    }

    private boolean isDeuce() {
        return player1Score >= 3 && player1Score == player2Score;
    }

    private boolean hasWinner() {
        return (player1Score >= MIN_POINTS_TO_WIN || player2Score >= MIN_POINTS_TO_WIN) && Math.abs(player1Score - player2Score) >= WIN_DIFFERENCE;
    }

    private boolean hasAdvantage() {
        return player1Score >= 3
                && player2Score >= 3
                && Math.abs(player1Score - player2Score) == 1;
    }

    private String getLeadingPlayerName() {
        return player1Score > player2Score
                ? player1Name
                : player2Name;
    }

    private String getNormalScore() {
        return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private String getScoreName(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "";
        }
    }
}

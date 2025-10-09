public class Level {
    private boolean goalReached;
    private int points;

    public boolean isGoalReached() {
        return goalReached;
    }

    public void reachGoal() {
        goalReached = true;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int p) {
        points = p;
    }

    public Level getLevel(int i) {
        if (i == 1) {
            return levelOne;
        }
        if (i == 2) {
            return levelTwo;
        }
        if (i == 3) {
            return levelThree;
        }
        return null;
    }

    public int getScore() {
        int points = 0;
        if (levelOne.goalReached()) {
            points += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                points += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    points += levelThree.getPoints();
                        if(isBonus()) {
                            points *= 3;
                        }
            }
        return  points;
        }
    }
}

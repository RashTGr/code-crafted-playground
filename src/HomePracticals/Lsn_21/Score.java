package HomePracticals.Lsn_21;

class Score {
    private double value;

    public void setValue(double value){
        this.value = value;
    }

    public Grade convertToGrade() {
        if (value >= 90){
            return Grade.A;
        } else if (value <= 89 && value >= 80) {
            return Grade.B;
        } else if (value <= 79 && value >= 70) {
            return Grade.C;
        } else if (value <= 69 && value >= 60) {
            return Grade.D;
        } else if (value <= 59 && value >= 50) {
            return Grade.E;
        }else {
            return Grade.F;
        }

    }
}

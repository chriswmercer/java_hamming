class Hamming {
    private String LeftStrand, RightStrand;

    Hamming(String leftStrand, String rightStrand) {
        LeftStrand = leftStrand;
        RightStrand = rightStrand;

        if (LeftStrand.length() != RightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() throws IllegalArgumentException {
        int difference = 0;

        for(int i = 0; i < LeftStrand.length(); i++) {
            if(LeftStrand.toCharArray()[i] != RightStrand.toCharArray()[i]) {
                difference++;
            }
        }

        return difference;
    }

}

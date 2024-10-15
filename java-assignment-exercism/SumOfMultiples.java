class SumOfMultiples {

    int result;
    
    SumOfMultiples(int number, int[] set) {
        this.result = calculateMultiples(number, set);
    }

    int getSum() {
        return result;
    }

    private int calculateMultiples(int number, int[] set) {
        int sum = 0;
        for (int i=0; i<number; i++) {
            for (int s : set) {
                if (s != 0 && i%s == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }

}

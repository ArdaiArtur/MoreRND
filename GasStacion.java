public class GasStacion {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasp=0;
        int costp=0;
        int j=0;
        int calc=0;
        for (int i = 0; i < cost.length; i++) {
            gasp+=gas[i];
            costp+=cost[i];
            calc+=gas[i]-cost[i];
            if(calc<1)
            {
                j=i;
                calc=0;
            }
        }
        return gasp>=costp?(j+1)%gas.length:-1;

    }
}

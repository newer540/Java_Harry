package codewars;

/*In John's car the GPS records every s seconds the distance
 travelled from an origin (distances are measured in an
 arbitrary but consistent unit). For example, below is part
 of a record with s = 15:

x = [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]
The sections are:

0.0-0.19, 0.19-0.5, 0.5-0.75, 0.75-1.0, 1.0-1.25, 1.25-1.50, 1.5-1.75, 1.75-2.0, 2.0-2.25
We can calculate John's average hourly speed on every section and we get:

[45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0]
Given s and x the task is to return as an integer the *floor* of the maximum
average speed per hour obtained on the sections of x. If x length is less than
 or equal to 1 return 0 since the car didn't move.

Example: with the above data your function gps(x, s)should return 74

Note
With floats it can happen that results depends on the operations order. To calculate hourly speed you can use:

(3600 * delta_distance) / s. */
class GpsSpeed {
    public static int gps(int s, double[] x) {
        if (x.length <= 1) return 0;
        double[] deltaDistance = new double[x.length - 1];
        double[] hourlySpeed = new double[x.length - 1];
        double highSpeed = 0;
        for (int i = 0; i < x.length - 1; i++) {
            deltaDistance[i] = x[i + 1] - x[i];
        }
        for (int i = 0; i < hourlySpeed.length; i++) {
            hourlySpeed[i] = 3600 * deltaDistance[i] / s;
        }
        for (int i = 0; i < hourlySpeed.length; i++) {
            if (highSpeed < hourlySpeed[i]) highSpeed = hourlySpeed[i];

        }
        return (int) highSpeed;
    }
}

public class SpeedControlCodewars {
    public static void main(String args[]) {
        double ex[] = {0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25};
        System.out.println(GpsSpeed.gps(12, ex));
    }
}

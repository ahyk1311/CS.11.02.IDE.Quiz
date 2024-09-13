package org.example;

public class Main {

    /** Method 1
     * Method name: circleArea
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleArea(int)
     * Returns the area of a circle. */
    public static double circleArea(int radius) {
        double area = Math.PI * (radius)*(radius);
        double area1 = (int)(area*100)+0.5;
        area1 = Math.round(area1);
        return area1/100;
    }

    /** Method 2
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle. */
    public static double circleCircum(int radius) {
        double circum = Math.PI*2*radius;
        double circumference = (int)(circum*100)+0.5;
        circumference = Math.round(circumference);
        return circumference/100;
    }

    /** Method 3
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27 */
    public static String circleInfo(int radius) {
        String info1 = "Radius: "+ radius;
        String info2 = "Circumference: "+ circleCircum(radius);
        String info3 = "Area: " + circleArea(radius);
        return info1 + "\n" + info2 + "\n" + info3;
    }

    /** Method 4
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes */
    public static String minutesToHoursMinutes(int minutes) {
        return minutes/60 + " hours and " + minutes%60 + " minutes";
    }

    /** Method 5
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     * */
    public static String twentyFourToTwelve(String time) {
        String twenty4 = time.substring(0,2);
        int hour = Integer.parseInt(twenty4) - 12;
        return hour + time.substring(2) + " pm";
    }

    /** Method 6
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int,int,int,int)
     * Returns the distance between two points */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        int top = (y2-y1);
        int bottom = (x2-x1);
        double root = Math.sqrt((top*top)+(bottom*bottom));
        double whole = root*100;
        whole = Math.round(whole);
        return whole/100;
    }

    /** Method 7
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit */
    public static double fahrenheitToCelsius(int fahrenheit) {
        double temp = (fahrenheit-32)*((double) 5 /9);
        double whole = (int)(temp*100)+0.5;
        whole = Math.round(whole);
        return whole/100;
    }

    /** Method 8
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius */
    public static double celsiusToFahrenheit(int celsius) {
        return celsius*((double)9/5)+32;
    }

}
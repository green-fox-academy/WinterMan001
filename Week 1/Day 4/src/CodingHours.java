public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        float codingHoursAday = 6;
        float HoursPerWeek = codingHoursAday * 5;
        float AllWeeks = HoursPerWeek * 17;
        System.out.println("An average Greenfox codes: " + AllWeeks + "hours in 17 weeks. (only workdays were counted)");
        float averageworkhours = 52;
        float percantage = HoursPerWeek*100 / averageworkhours;
        System.out.println("The percantage is (compared to average work hours is : )" + percantage);

    }
}
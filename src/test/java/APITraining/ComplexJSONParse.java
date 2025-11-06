package APITraining;

import files.payload;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

public class ComplexJSONParse {

    /*
    1. Print No of courses returned by API
    2. Print Purchase Amount
    3. Print Title of the first course
    4. Print All course titles and their respective Prices
    5. Print no of copies sold by RPA Course
    6. Verify if Sum of all Course prices matches with Purchase Amount
     */
    public static void main(String[] args) {

        JsonPath js = new JsonPath(payload.CoursePrice());
        //Print No of courses returned by API
        int courseCount = js.getInt("courses.size()");
        System.out.println(courseCount);

        //Print Purchase Amount
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);

        //Print Title of the first course
        String firstCourse = js.getString("courses[0].title");
        System.out.println(firstCourse);

        //Print All course titles and their respective Prices
        for (int i = 0; i < courseCount; i++) {
            System.out.print(js.getString("courses[" + i + "].title") + " : ");
            System.out.println(js.getInt("courses[" + i + "].price"));
        }

        //Print no of copies sold by RPA Course
        for (int i = 0; i < courseCount; i++) {
            if (js.getString("courses[" + i + "].title").equalsIgnoreCase("RPA")) {
                System.out.println(js.getInt("courses[" + i + "].copies"));
                break;
            }
        }

        //Verify if Sum of all Course prices matches with Purchase Amount
        int totalCoursePrice = 0;
        for (int i = 0; i < courseCount; i++) {
            int coursePrice = js.getInt("courses[" + i + "].price") * js.getInt("courses[" + i + "].copies");
            totalCoursePrice = totalCoursePrice + coursePrice;
        }
        System.out.println("Total Course Price of all Course : " + totalCoursePrice);
        Assert.assertEquals(totalCoursePrice, purchaseAmount);
        System.out.println("Sum of all Course prices matches with the Purchase Amount");

    }
}

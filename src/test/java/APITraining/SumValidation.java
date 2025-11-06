package APITraining;

import files.payload;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation {

    @Test
    public void sumOfCourses() {
        //Verify if Sum of all Course prices matches with Purchase Amount
        JsonPath js = new JsonPath(payload.CoursePrice());
        int totalCoursePrice = 0;
        int courseCount = js.getInt("courses.size()");
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        for (int i = 0; i < courseCount; i++) {
            int coursePrice = js.getInt("courses[" + i + "].price") * js.getInt("courses[" + i + "].copies");
            totalCoursePrice = totalCoursePrice + coursePrice;
        }
        System.out.println("Total Course Price of all Course : " + totalCoursePrice);
        Assert.assertEquals(totalCoursePrice, purchaseAmount);
        System.out.println("Sum of all Course prices matches with the Purchase Amount");

    }
}

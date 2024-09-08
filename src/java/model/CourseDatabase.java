package model;

import dbo.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CourseDatabase {

    private Connection con1;

    public CourseDatabase(Connection con1) {
        this.con1 = con1;
    }

    public boolean saveCourse(Course course) {
        boolean set = false;
        try {
            String query = "INSERT INTO courses(firstName, idNumber, courseName, address, phoneNumber) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pt = this.con1.prepareStatement(query);
            pt.setString(1, course.getFirstName());
            pt.setString(2, course.getIdNumber());
            pt.setString(3, course.getCourseName());
            pt.setString(4, course.getAddress());
            pt.setString(5, course.getPhoneNumber());

            int rowsInserted = pt.executeUpdate();
            if (rowsInserted > 0) {
                set = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }
}

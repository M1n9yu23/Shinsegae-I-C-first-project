package dao.daoImpl;

import config.ConnectionFactory;
import dao.UserDao;
import dto.request.UserRequestDto;
import dto.response.UserResponseDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private static Connection connection = null;
    private static ResultSet rs = null;

    @Override
    public void createUser(UserRequestDto request) {
        connection = ConnectionFactory.getInstance().open();
        String query = new StringBuilder()
            .append("INSERT INTO User ")
            .append("(name, business_number, company_name, user_id, password, email, phone, zip_code, address, created_at)")
            .append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, request.getName());
            pstmt.setString(2, request.getBusinessNumber());
            pstmt.setString(3, request.getCompanyName());
            pstmt.setString(4, request.getUserId());
            pstmt.setString(5, request.getPassword());
            pstmt.setString(6, request.getEmail());
            pstmt.setString(7, request.getPhone());
            pstmt.setString(8, request.getZipCode());
            pstmt.setString(9, request.getAddress());
            pstmt.setString(10, request.getCreatedAt());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.getInstance().close();
        }
    }

    @Override
    public UserResponseDto findById(int id) {
        UserResponseDto response = null;
        connection = ConnectionFactory.getInstance().open();
        String query = new StringBuilder()
            .append("SELECT * ")
            .append("FROM User ")
            .append("WHERE id = ?").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                response = new UserResponseDto(rs);
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.getInstance().close();
        }

        return response;
    }

    @Override
    public void updateUser(int id, UserRequestDto request) {
        connection = ConnectionFactory.getInstance().open();
        String query = new StringBuilder()
            .append("UPDATE User ")
            .append("SET ")
            .append("name = ?, business_number = ?, company_name = ?, user_id = ?, ")
            .append("email = ?, phone = ?, zip_code = ?, address = ?, updated_at = ? ")
            .append("WHERE id = ?").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, request.getName());
            pstmt.setString(2, request.getBusinessNumber());
            pstmt.setString(3, request.getCompanyName());
            pstmt.setString(4, request.getUserId());
            pstmt.setString(5, request.getEmail());
            pstmt.setString(6, request.getPhone());
            pstmt.setString(7, request.getZipCode());
            pstmt.setString(8, request.getAddress());
            pstmt.setString(9, request.getUpdatedAt());
            pstmt.setInt(10, id);

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.getInstance().close();
        }
    }

    @Override
    public void updateUserPwd(int id, UserRequestDto request) {
        connection = ConnectionFactory.getInstance().open();
        String query = new StringBuilder()
            .append("UPDATE User ")
            .append("SET ")
            .append("password = ? , updated_at = ?")
            .append("WHERE id = ?").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, request.getPassword());
            pstmt.setString(2, request.getUpdatedAt());
            pstmt.setInt(3, id);

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.getInstance().close();
        }
    }
}

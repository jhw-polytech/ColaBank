package kr.ac.kopo.colaBank.accountManager.dao;

import kr.ac.kopo.colaBank.DAO.BaseDAO;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO extends BaseDAO {

    public List<AccountVO> searchAll() {

        List<AccountVO> list = new ArrayList<>();

        try {

            StringBuilder sql = new StringBuilder();

            sql.append("select id from account where id = ?");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, BaseDAO.userId);
//            pstmt.setInt(2, acc.getAccountNumber());
//            pstmt.setString(3, acc.getBank());
//            pstmt.setDouble(4, acc.getBalance());
//            pstmt.setString(5, acc.getGrade());

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                list.add(new AccountVO(rs.getString("ID"), rs.getInt("account_number"), rs.getString("bank"),
                        rs.getDouble("balance"), rs.getString("grade")));

            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;

    }

    public AccountVO accountDAO(AccountVO account) {

        AccountVO acc = null;

        try {

            StringBuilder sql = new StringBuilder();

            sql.append("select id from account where id = ?");

            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, acc.getId());
//            pstmt.setInt(2, acc.getAccountNumber());
//            pstmt.setString(3, acc.getBank());
//            pstmt.setDouble(4, acc.getBalance());
//            pstmt.setString(5, acc.getGrade());

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                acc = new AccountVO(rs.getString("ID"), rs.getInt("account_number"), rs.getString("bank"),
                        rs.getDouble("balance"), rs.getString("grade"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return acc;
    }
}

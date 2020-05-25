package kr.ac.kopo.colaBank.accountManager.service;

import kr.ac.kopo.colaBank.accountManager.dao.AccountDAO;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;

import java.util.List;

public class AccountService {

    private AccountDAO accountDAO;

    public AccountService() {
        accountDAO = new AccountDAO();
    }


    // 1. 신규계좌 생성

    // 2-1. 통합계좌관리 - 등록

    // 2-2. 통합계좌관리 - 수정

    // 2-3. 통합계좌관리 - 삭제

    // 3. 계좌검색

    // 4. 전체계좌 조회
    public List<AccountVO> searchAll() {
        List<AccountVO> list = accountDAO.searchAll();
        return list;
    }

    // 5. 은행별 계좌정보 리스트

    // 6-1. 입금
    public double deposit() {
        double balance;



        return balance;
    }

    // 6-2. 출금
    public double withdraw() {
        
    }

    // 6-3. 이체




}

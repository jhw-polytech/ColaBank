package kr.ac.kopo.colaBank.accountManager.ui;
/*
    입금/출금/이체 서비스
*/

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;
import kr.ac.kopo.colaBank.ui.BaseUI;

import java.util.Scanner;

public class MoneyUI extends BaseUI {

    @Override
    public boolean execute() throws Exception {
        System.out.println("입금/출금/이체 서비스입니다.");

        AccountService service = new AccountService();

        Scanner sc = new Scanner(System.in);

        System.out.println("원하시는 서비스를 선택해주세요.");
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 이체");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {
            case 1:
            List<AccountVO> list = service.deposit();
                break;
            case 2:
                break;
            case 3:
                break;
        }


        return false;
    }
}

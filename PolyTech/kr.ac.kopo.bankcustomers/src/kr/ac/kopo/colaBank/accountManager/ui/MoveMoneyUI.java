package kr.ac.kopo.colaBank.accountManager.ui;
/*
    입금/출금/이체 서비스
*/

import kr.ac.kopo.colaBank.accountManager.service.AccountService;
import kr.ac.kopo.colaBank.accountManager.vo.AccountVO;
import kr.ac.kopo.colaBank.ui.BaseUI;

import java.util.Scanner;

public class MoveMoneyUI extends BaseUI {

    @Override
    public void execute() throws Exception {
        System.out.println("입금/출금/이체 서비스입니다.");

        AccountService service = new AccountService();
        boolean result = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("원하시는 서비스를 선택해주세요.");
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 이체");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                service.deposit();
                break;
            case 2:
                service.withdraw();
                break;
            case 3:
                service.transfer();
                break;
        }

    }
}

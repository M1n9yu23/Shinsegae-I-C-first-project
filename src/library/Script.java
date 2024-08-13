package library;

import common.Menu;
import java.io.IOException;

public class Script {

    private static StringBuilder script = new StringBuilder();

    private void print() {
        System.out.println(script);
        script.delete(0, script.length());
    }

    /**
     * 서비스 이용자의 타입 받기 1. 쇼핑몰 | 2. 어드민
     */
    public void selectUserType() {
        script.append(Menu.BOARD_SEPARATOR.getText())
            .append(Menu.USER_TYPE.getText())
            .append(Menu.USER_TYPE_SELECT.getText());
        print();
    }

    /**
     * 메뉴 선택 1. 회원 가입 | 2. 로그인
     */
    public void selectLoginOrRegister() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.AUTH_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * 회원(쇼핑몰) 페이지 메뉴 선택 1. 회원 관리 | 2. 창고 관리 | 3. 재고 관리 4. 입고 관리 | 5. 출고 관리 | 6. 고객 센터 7. 로그아웃
     */
    public void userMainMenu() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.USER_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * 어드민 페이지 메뉴 선택 1. 회원 관리 | 2. 재무 관리 | 3. 창고 관리 | 4. 재고 관리 5. 입고 관리 | 6. 출고 관리 | 7. 고객 센터 | 8.
     * 로그아웃
     */
    public void adminMainMenu() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.ADMIN_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * '회원 관리' 메뉴 선택 1. 조회 | 2. 수정 | 3. 권한 설정 | 4. 삭제
     */
    public void manageMember() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.ADMIN_MEMBER_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * '회원 관리 > 조회' 메뉴 선택 1. 직원 조회 | 2. 쇼핑몰 사업자 회원 조회
     */
    public void viewMember() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.ADMIN_MEMBER_VIEW_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * '회원 관리 > 조회 > 직원 조회' 메뉴 선택 1. 직원 상세 조회 | 2. 직원 전체 조회 | 3. 권한별 직원 조회
     */
    public void viewAdmin() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.ADMIN_MEMBER_VIEW_ADMIN_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * '회원 관리 > 조회 > 쇼핑몰 사업자 회원 조회' 메뉴 선택 1. 쇼핑몰 회원 상세 조회 | 2. 쇼핑몰 회원 전체 조회 | 3. 승인 대기자 조회
     */
    public void viewUser() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.ADMIN_MEMBER_VIEW_USER_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * 회원 관리 > 수정 메뉴 선택 1. 회원 정보 수정 | 2. 쇼핑몰 사업자 정보 수정
     */
    public void editMember() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.ADMIN_MEMBER_VIEW_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }

    /**
     * 회원 관리 > 권한 설정 메뉴 선택 1. 회원 권한 | 2. 쇼핑몰 사업자 권한 승인
     */
    public void setMemberPermission() {
        script.append(Menu.BORDER_LINE.getText())
            .append(Menu.ADMIN_MEMBER_VIEW_MENU.getText())
            .append(Menu.MENU_SELECT.getText());
        print();
    }
}

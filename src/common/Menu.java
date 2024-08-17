package common;

public enum Menu {
  USER_TYPE("1. 쇼핑몰 | 2. 어드민\n"),
  USER_TYPE_SELECT("회원 유형 번호 입력 > "),

  MENU_SELECT("메뉴 선택 > "),
  ROLE_SELECT("권한 선택 > "),
  STATUS_SELECT("승인 상태 선택 > "),

  AUTH_MENU("1. 회원 가입 | 2. 로그인 | 3. 아이디 찾기 | 4. 비밀번호 재설정\n"),
  ADMIN_MENU(
      "[메뉴]\n1. 회원 관리 | 2. 재무 관리 | 3. 창고 관리 | 4. 재고 관리\n5. 입고 관리 | 6. 출고 관리 | 7. 고객 센터 | 8. 로그아웃\n"),
  ADMIN_MEMBER_MENU("[회원 관리]\n1. 조회 | 2. 수정 | 3. 권한 설정 | 4. 삭제\n"),
  ADMIN_MEMBER_VIEW_MENU("[회원 관리 > 조회]\n1. 직원 조회 | 2. 쇼핑몰 사업자 회원 조회\n"),
  ADMIN_MEMBER_VIEW_ADMIN_MENU("[회원 관리 > 조회 > 직원 조회]\n1. 직원 상세 조회 | 2. 직원 전체 조회 | 3. 권한별 직원 조회\n"),
  ADMIN_DEPARTMENT_MENU("[부서]\n1. 인사 | 2. 창고 | 3. 배송 | 4. 개발 | 5. 회계\n"),
  ADMIN_POSITION_MENU("[직급]\n1. 총 관리자 | 2. 창고 관리자 | 3. 일반\n"),
  ADMIN_ROLE_MENU("[직원 권한]\n1. 총 관리자 | 2. 창고 관리자 | 3. 일반\n"),
  ADMIN_MEMBER_VIEW_USER_MENU(
      "[회원 관리 > 조회 > 쇼핑몰 사업자 회원 조회]\n1. 쇼핑몰 회원 상세 조회 | 2. 쇼핑몰 회원 전체 조회 | 3. 승인 대기자 조회\n"),
  ADMIN_MEMBER_EDIT_MENU("[회원 관리 > 수정]\n1. 회원 정보 수정 | 2. 비밀번호 수정\n"),
  ADMIN_MEMBER_PERMISSION_MENU("[회원 관리 > 권한 설정]\n1. 직원 권한 | 2. 직원 부서 및 직급 | 3. 쇼핑몰 사업자 권한 승인\n"),
  ADMIN_DELETE_MENU("[회원 관리 > 삭제]\n1. 직원 삭제 | 2. 쇼핑몰 사업자 회원 삭제\n"),
  USER_MENU("[메뉴]\n1. 회원 관리 | 2. 창고 관리 | 3. 재고 관리\n4. 입고 관리 | 5. 출고 관리 | 6. 고객 센터\n7. 로그아웃\n"),
  USER_MEMBER_MENU("[회원 관리]\n1. 정보 조회 | 2. 정보 수정 | 3. 비밀번호 변경 | 4. 탈퇴\n"),
  STATUS_MENU("[Status]\n1. 대기 | 2. 승인 | 3. 거절\n"),

  ADMIN_ID_INPUT("사번을 입력해 주세요 > "),
  USER_ID_INPUT("회원 번호를 입력해 주세요 > "),
  BIZ_NO_INPUT("사업자 번호를 입력해 주세요 > "),
  REJECTION_REASON_INPUT("승인 거절 사유를 입력해 주세요 > "),

  CONFIRM("계속 진행하시겠습니까?\n1. 예 | 2. 아니요"),

  LOGIN("\n[로그인]\n"),

  BORDER_LINE("------------------------------------------------------------\n"),
  BOARD_SEPARATOR("############################################################\n"),

  
  STOCKREQUESTMENUSELECT("1. 입고요청서 작성 | 2. 입고요청서 조회 | 3. 입고요청서 승인 | 4. 입고요청서 수정 | 5. 입고요청서 삭제 | 6. 나가기"),

  FINDCONDITION("1. 모든 요청서 조회 | 2. 요청서 한 개 조회 | 3. 입고 상태별 조회 | 4. 생성 날짜별 조회 | 5. 물건 ID별 조회 | 6. 입고 예정일별 조회"),
  //유저가 창고일 경우 공급자 ID별 조회도 가능하게 해주기

  FINDSTATUSWMS("1. PENDING | 2. APPROVED"), //wms관리자

  STOCKREQUESTCOLUMN("요청서ID\t물건ID\t박스수량\t박스사이즈\t입고상태\t입고예정일\t입고서생성일\t비고"),

  UPDATESTATUS("승인할 요청서ID 입력 | 더 이상 입력하지 않을 경우 Enter를 치시오");


  private final String description;

  Menu(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
  }

package info_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class InfoManager {

    private ArrayList<Info> infos;

    // 기본 메뉴 구성
    public static void showMenu() {
        System.out.println("\n=====회원 정보 관리 프로그램=====");
        System.out.println("1. 회원 정보 등록");
        System.out.println("2. 회원 정보 확인");
        System.out.println("3. 회원 정보 검색");
        System.out.println("4. 회원 정보 수정");
        System.out.println("5. 회원 정보 삭제");
        System.out.println("0. 프로그램 종료");
    }

    // initializing constructor
    public InfoManager() {
        infos = new ArrayList<>();
    }

    // 1. 회원 정보 등록
    public void joinInfo(int id, String name, int age) {
        this.infos.add(new Info(id, name, age));
    }

    // 2-1. 회원 정보 전체 목록 확인
    public void showInfo() {
        if (!infos.isEmpty()) {                
        	System.out.println("-----회원 정보 목록-----");
        	Iterator<Info> it = infos.iterator();
        	while (it.hasNext()) {
        		Info info = it.next();
        		System.out.println(info.toString());
        	}
        } else {
            System.out.println("등록된 회원 정보가 없습니다!");
        }
    }

    // 2-2. 개별 회원 정보 출력
    public void printInfo(Info info) {
    	if (info == null) {
    		System.out.println("찾으시는 정보가 없습니다!");
    		return;
    	}
        System.out.println("등록번호 : " + info.getId());
        System.out.println("이름 : " + info.getName());
        System.out.println("나이 : " + info.getAge());
    }

    // 3. 회원 정보 검색
    // 3-1. 회원 등록번호로 검색
    public Info searchById(int id) {
    	Iterator<Info> it = infos.iterator();
    	while (it.hasNext()) {
    		Info info = it.next();
    		if (id == info.getId()) {
    			return info;
    		}
    	}
    	return null;
    }   

    // 3-2. 회원 이름으로 검색
    public Info searchByName(String name) {
    	Iterator<Info> it = infos.iterator();
    	while (it.hasNext()) {
    		Info info = it.next();
    		if (name.equals(info.getName())) {
    			return info;
    		}
    	}
    	return null;
    }   

    // 3-3. 회원 나이로 검색
    public Info searchByAge(int age) {
    	Iterator<Info> it = infos.iterator();
    	while (it.hasNext()) {
    		Info info = it.next();
    		if (age == info.getAge()) {
    			return info;
    		}
    	}
    	return null;
    }   

    // 4. 회원 정보 수정
    public boolean modifyInfo(int beforeId, int newId, String newName, int newAge) {
    	if (searchById(beforeId) == null) {
    		return false;
    	}
    	this.searchById(beforeId).setInfo(newId, newName, newAge);
        return true;
   }

    // 5. 회원 정보 삭제
    public boolean deleteInfo(int id) {
    	if (searchById(id) == null) {
    		return false;
    	}
    	return infos.remove(searchById(id));        
    }

}
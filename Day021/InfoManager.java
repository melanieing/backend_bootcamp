package fileInfo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class InfoManager implements Serializable{

	private int id;
    private HashMap<Integer, Info> infos;
    public static final int ERROR = -1;

    // 기본 메뉴 구성
    public static void showMenu() {
        System.out.println("\n=====회원 정보 관리 프로그램=====");
        System.out.println("1. 회원 정보 등록");
        System.out.println("2. 회원 정보 확인");
        System.out.println("3. 회원 정보 검색");
        System.out.println("4. 회원 정보 수정");
        System.out.println("5. 회원 정보 삭제");
        System.out.println("6. 회원 정보 파일로 저장");
        System.out.println("0. 프로그램 종료");
    }

    // initializing constructor
    public InfoManager() {
        infos = new HashMap<>();
    }

    // 1. 회원 정보 등록
    public void joinInfo(int id, String name, int age) {
        this.infos.put(id, new Info(name, age));
    }

    // 2-1. 회원 정보 전체 목록 확인
    public void showInfo() {
        if (!infos.isEmpty()) {                
        	System.out.println("-----회원 정보 목록-----");
        	for (Entry<Integer, Info> entry : infos.entrySet()) {
        		System.out.println("[ID] : " + entry.getKey() + "\t[NAME] : " + entry.getValue().getName() + "\t[AGE] : " + entry.getValue().getAge());
        	}
        } else {
            System.out.println("등록된 회원 정보가 없습니다!");
        }
    }

    // 2-2. 개별 회원 정보 출력
    public void printInfo(int id) {
    	if (!infos.containsKey(id)) {
    		System.out.println("등록된 회원 정보가 없습니다!");
    	} else {
    		System.out.println("[ID] : " + id + "\t[Name] : " + infos.get(id).getName() + "\t[AGE] : " + infos.get(id).getAge());
    	}	
    }
    
    public void printInfo(HashMap<Integer, Info> target) {
    	Object targetKey = target.keySet().toArray()[0];
    	printInfo((int)targetKey);
    }
    
    // 3. 회원 정보 검색
    // 3-1. 회원 등록번호로 검색
    public HashMap<Integer, Info> searchById(int id) {
    	Iterator<Entry<Integer, Info>> it = infos.entrySet().iterator();
    	while (it.hasNext()) {
    		Map.Entry<Integer, Info> entry = it.next();
    		if (id == entry.getKey()) {
    			return infos;
    		}
    	}
    	return null;
    }   

    // 3-2. 회원 이름으로 검색
    public int searchByName(String name) {
    	for (Map.Entry<Integer, Info> entry : infos.entrySet()) {
    		int targetkey = entry.getKey();
    		String targetName = entry.getValue().getName();
    		if (targetName.equals(name)) {
    			return targetkey;
    		}
    	}
    	return ERROR;
    }   

    // 3-3. 회원 나이로 검색
    public int searchByAge(int age) {
    	for (Map.Entry<Integer, Info> entry : infos.entrySet()) {
    		int targetkey = entry.getKey();
    		int targetAge = entry.getValue().getAge();
    		if (targetAge == age) {
    			return targetkey;
    		}
    	}
    	return ERROR;
    }   

    // 4. 회원 정보 수정
    public boolean modifyInfo(int id, String newName, int newAge) {
    	if (searchById(id) == null) {
    		return false;
    	}
    	Info newInfo = new Info(newName, newAge);
    	this.searchById(id).put(id, newInfo);
        return true;
   }

    // 5. 회원 정보 삭제
    public boolean deleteInfo(int id) {
    	if (searchById(id) == null) {
    		return false;
    	}
    	infos.remove(id);
    	return true;        
    }

	public String infoToString() {
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<Integer, Info> entry : infos.entrySet()) {
			Integer id = entry.getKey();
			Info info = entry.getValue();
			sb.append("[ID] : " + id + "[NAME] : " + info.getName() + "[AGE] : " + info.getAge());
		}
		return sb.toString();
	}

	public HashMap<Integer, Info> getInfos() {
		return infos;
	}

	public void setInfos(HashMap<Integer, Info> infos) {
		this.infos = infos;
	}
	
	
    
    

}
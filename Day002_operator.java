package examjava02;
// ������ �켱���� ����
public class Day002_operator {

	public static void main(String []args){
        int a = 5, b = 6, c = 10, d = 0;
        boolean bo = false;
        d = ++a * b--; 
        System.out.printf("a = %d, b = %d, d = %d\n",a,b,d); // a = 6, b = 5, c = 10, d = 36
        d = a++ + ++c - b--;
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); // a = 7, b = 4, c = 11, d = 12
        a = 1;
        b = 0;
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); // a = 1, b = 0, c = 11, d = 12
        
        // �� �������� ������(short-circuit)
        bo = a++ > 0 || 1 < ++b * d-- / ++c; // true = true || (������ true�̴ϱ� �ڿ��� �� ��) 
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); // a = 2, b = 0, c = 11, d = 12 
        System.out.printf("bo = %b\n", bo); // true
        
        bo = b++ > 0 && 1 < ++a / ++c * d++; // false = false && (������ false�ϱ� �ڿ��� �� ��)
        System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); // a = 2, b = 1, c = 11, d = 12  
        System.out.printf("bo = %b\n", bo); // false

   }

}

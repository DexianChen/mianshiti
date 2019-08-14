package kelun;

/**
 * 编写一个方法，实现输入12345的long类型数据，则输出12，345
 * -7565655 -->  -7,565,655
 */
public class FormatTest {
    public static void main(String[] args) {
        Long num = -1234566662213231L;

        String s = intToString(num);

        System.out.println(format(s,num));
    }

    private static String intToString(long num) {
        String str = String.valueOf(num);
        if (num>0){
            return str;
        }else {
            return str.substring(1,str.length());
        }
    }

    private static String format(String s, long num){
        StringBuilder sb = new StringBuilder();

        int x = 0;
        for (int i=s.length()-1;i>=0;i--){
            x++;
            //每循环三次就需要添加","
            if (x%3 == 0 && i!=0){
                sb.append(s.charAt(i)).append(",");
            }else {
                sb.append(s.charAt(i));
            }
        }

        if (num>0){
            return sb.reverse().toString();
        }else {
            return sb.append("-").reverse().toString();
        }
    }

}

import java.uti1.Scanner;
import java.uti1.LinkedList;

public class Date {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in) ;

        // khai báo 1 danh sách liên kết
        // lưu trữ các tháng trong năm
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Tháng 1");
        linkedList.add("Tháng 2");
        linkedList.add("Tháng 3");
        linkedList.add("Tháng 4");
        linkedList.add("Tháng 5");
        linkedList.add("Tháng 6");
        linkedList.add("Tháng 7");
        linkedList.add("Tháng 8");
        linkedList.add("Tháng 9");
        linkedList.add("Tháng 19");
        linkedList.add("Tháng 11");
        linkedList.add("Tháng 12");

System.out.println("Nhập vào chỉ số của phần tử cần lấy: ");
int index = scanner.nextInt();

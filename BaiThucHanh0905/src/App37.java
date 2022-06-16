System.out.println("\nví dụ sử dụng phương thức retainall()");
System.out.println("--
// khởi tạo listB
LinkedList<String> listB=new LinkedList<String> ();
listB.add("Java");
// xóa những phần tử không thuộc listB khỏi listA
listA.retainAll(listB);
System.out.print("listA:");
showlist(listA);
                                                      -");
System.out.println("\nví du sử dụng phương thức removeAll()");
System.out.println("-----
// xóa những phần tử thuộc listB khỏi list
list.removeAl1(listB);
System.out.print("list:");
showlist(list);
}
                                                      -");
public static void showList(LinkedList<String> list){
// Show list through for-each
for (String obj:list){
    System.out.print("\t"+obj+", ");
}
System.out.println();
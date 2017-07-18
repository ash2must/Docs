object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(24); 
val l=  List(1,2,3,4,5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(12); val res$0 = 
l.init.last;System.out.println("""res0: Int = """ + $show(res$0))}
}

public class Hello
{
 public static void main( String argv[] )
 {
 String name = "Updated code For Erick to push";
 if ( argv.length != 0 )
 {
 name = argv[0];
 }
 System.out.println( "Hello, " + name + "!" );
 }
}
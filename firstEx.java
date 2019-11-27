import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class A
{
	public static void main(String[] args)	throws IOException
	{
		File file = new File("C:\\javaio\\print.html");
		file.createNewFile();
//		try
//		{
//			System.out.println("load 완료");
//		} catch (FileNotFoundException e)
//		{
//			file.createNewFile();
//		}
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		PrintWriter fileOut = new PrintWriter(bufferedWriter);
		fileOut.println("<img src='https://s.pstatic.net/static/www/mobile/edit/2019/1126/cropImg_166x108_16697139164807435.jpeg'>");
		fileOut.println("<font color = 'yellow''>");
		fileOut.println("<marquee>\\  ^ o ^  /</marquee>");
		fileOut.println("</font>");
		fileOut.close();
		
		
		
	}
}

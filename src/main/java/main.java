// generate html file with contents of file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        String[] liste ;
        String fileName = "D:\\MSPR_BDD_txt\\staff.txt";
        String fileliste = "D:\\MSPR_BDD_txt\\liste.txt";
        String htmlFileName = "D:\\MSPR_java\\index.html";
        String Image = "D:\\MSPR_BDD_txt\\" + "flesaint" + ".jpg";

        File inputFile = new File(fileName);
        Scanner input = new Scanner(inputFile);

        File outputFile = new File(htmlFileName);
        PrintWriter output = new PrintWriter(new FileWriter(outputFile));

        output.println("<html><body>");
        output.println("<div style=\"display: flex; justify-content: space-between; padding : 3%\">");
        output.println("<div >");
        while (input.hasNextLine()) {
            String line = input.nextLine();
            liste = line.split(" ");
            System.out.println(liste.length);
            if (liste.length != 1){
                if (liste[0].equals("flesaint")) {
                    output.println("<H1 style=\"text-align:center\">" + liste[1] + "</H1>");
                    output.println("<H3 style=\"text-align:center\">" + liste[3] + "</H3>");
                    output.println("<H4 style=\"text-align:center\">" + liste[4].replace('_', ' ') + "</H4>");
                }
            }
        }
        output.println("</div >");
        output.println("<img style=\" width:30%\" src="+ Image +" alt=\"Grapefruit slice atop a pile of other slices\">");
        output.println("</div >");
        output.println("<br />");
        output.println("<div style=\"display : block\">");
        inputFile = new File(fileliste);
        input = new Scanner(inputFile);
        while (input.hasNextLine()) {
            String line = input.nextLine();
                    output.println("<p style=\"text-align:center\">" + line + "</p>");
        }
        output.println("</div >");

        output.println("</body></html>");

        input.close();
        output.close();
    }
}
package proj4;

import java.awt.*;
import java.io.*;
public class CalculateInput {
    public static void main(String args[]) throws Exception
    {
        int num1,num2,output;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());

        output =num1 * num2;
        System.out.println("Result is :"+ output);
    }

}

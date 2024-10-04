import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

        //nak baca file .txt kita tu
        public List<Integer> readFile(String fileName) throws IOException {
            List<Integer> numbers = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        numbers.add(Integer.parseInt(line));
                    } catch (NumberFormatException e) {
                        numbers.add(null); 
                    }
                }
            }
            return numbers;
        }
    
        //ni process untuk division tu
        public List<String> divideNumbers(List<Integer> numbers, int divisor) {
            List<String> results = new ArrayList<>();
            for (Integer number : numbers) {
                if (number == null) {
                    results.add("Invalid number format");
                } else {
                    try {
                        if (number == 0) {
                            results.add("Division by zero error for number " + number);
                        } else {
                            results.add(String.valueOf(number / divisor));
                        }
                    } catch (ArithmeticException e) {
                        results.add("Division by zero error for number " + number);
                    }
                }
            }
            return results;
        }

        //nak keluarkan list baru dekat  (output.txt)
        public void writeFile(String fileName, List<String> results) throws IOException {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                for (String result : results) {
                    bw.write(result);
                    bw.newLine();
                }
            }
        }
    
        
        public static void main(String[] args) {
            FileProcessor processor = new FileProcessor();
            Scanner scanner = new Scanner(System.in);
    
            try {
          
                List<Integer> numbers = processor.readFile("input.txt");
    
          
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
    
               
                List<String> results = processor.divideNumbers(numbers, divisor);
    
                //result pergi dekat outout.txt
                processor.writeFile("output.txt", results);
    
                System.out.println("See your result at output.txt");
    
            } catch (IOException e) {
                System.out.println("Cannot acces the file: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
}

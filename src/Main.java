import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Collections;


// TO JEST WSZYSTKO PRZED PUNKTEM (12)!!!


public class Main {
    public static void main(String[] args) throws IOException {
            ArrayList<Double> data = new ArrayList<>();
            String fileName ="inputData/data_a1.txt";
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            String line=reader.readLine();
            while (line!=null) {
                double number = Double.parseDouble(line);
                data.add(number);
                line=reader.readLine();
            }
            reader.close();



            Collections.sort(data);
            double min = data.get(0);
            double max = data.get(data.size()-1);
            double median = data.get(data.size()/2);

            double sum = 0;
            for (int i = 0; i < data.size(); i++) {
                sum = sum + data.get(i);
            }
            double mean = sum/data.size();

            double eps = (max-min) / 100.0;
            int centralCount=0;

            for (int i = 0; i < data.size(); i++) {
                if (Math.abs(data.get(i) - mean) < eps) {
                    centralCount = centralCount + 1;
                }
            }


            System.out.println("Task I.1");
            System.out.println("Jan Kowalski, 123456");
            System.out.println("Data filename: data_a1.txt");
            System.out.println("Length of the series: " + data.size());
            System.out.format("Max value: %.3f\n", max);
            System.out.format("Min value: %.3f\n", min);
            System.out.format("Mean value: %.3f\n", mean);
            System.out.format("Median: %.3f\n", median);
            System.out.println("Number of central elements: " + centralCount);
    }
}

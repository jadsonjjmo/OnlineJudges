import java.io.*;

/**
 * Created by Jadson José on 28/12/16.
 * OnlineJudge: Uri Online Judge
 * Name/code: Password/2146
 * Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2146
 * Category: Beginner
 */
public class Password {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        while (bufferedReader.ready()) {
            int number = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(number - 1).append('\n');
        }

        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

}

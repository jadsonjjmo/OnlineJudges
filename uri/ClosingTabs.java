import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Jadson José on 28/12/16.
 * OnlineJudge: URI Online Judge
 * Name/code: Closing Tabs/2061
 * Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2061
 * Category: Beginner
 */
public class ClosingTabs {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int numberOfTabs = Integer.parseInt(stringTokenizer.nextToken());
        int numberOfActions = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < numberOfActions; i++) {
            String action = bufferedReader.readLine();

            if (action.equals("fechou")) {
                numberOfTabs++;
            } else if (action.equals("clicou")) {
                numberOfTabs--;
            }
        }
        stringBuilder.append(numberOfTabs).append('\n');
        bufferedWriter.write(stringBuilder.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}

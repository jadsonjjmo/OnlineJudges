import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 5474 {


	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int H1, M1, H2, M2;
		while (true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	 H1 = Integer.parseInt(st.nextToken());
             M1 = Integer.parseInt(st.nextToken());
             H2 = Integer.parseInt(st.nextToken());
             M2 = Integer.parseInt(st.nextToken());
             
        	if(H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0)break;
        	
            if ((H2 * 60) + M2 < (H1 * 60) + M1) {
                H2 = H2 + 24;
            }
            sb.append(((H2 * 60) + M2) - ((H1 * 60) + M1)).append("\n");
        }	
		
		bw.write(sb.toString());
		bw.flush();
	}
	
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 2284 {


	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
//		valor dos caracteres iniciais
//		System.out.println((int)'a');
//		System.out.println((int)'A');
		
		while(br.ready()){
		String palavra = br.readLine();
		int soma = 0;
		for(int i = 0 ; i<palavra.length() ; i++){
			if(Character.isUpperCase(palavra.charAt(i))){
				soma += palavra.charAt(i)-38;
			}
			else{
				soma += palavra.charAt(i)-96;
			}			
			
		}
		
			if(isPrime(soma) || soma == 1){
				sb.append("It is a prime word.\n");
			}
			else{
				sb.append("It is not a prime word.\n");
			}
			
						
		}		
		
		bw.write(sb.toString());
		bw.flush();

	}
	
	static boolean isPrime(int N){
		int cont = 0;
		for(int i = 1; i <= Math.sqrt(N);i++){
			if(N%i==0)cont++;
		}
		return (cont==1) ? true : false;
	}
	
}
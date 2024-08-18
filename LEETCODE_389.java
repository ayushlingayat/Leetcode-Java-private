import java.util.HashMap;

public class LEETCODE_389 {

	public static void main(String[] args) {
		
		String a="ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbad"
				+ "khmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaq"
				+ "lcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxej"
				+ "sntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvud"
				+ "ubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmc"
				+ "sikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidk"
				+ "pwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgisw"
				+ "uiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnov"
				+ "hectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpw"
				+ "fxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdch"
				+ "aauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpv"
				+ "jtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfe"
				+ "xqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiw"
				+ "rirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoa"
				+ "snnfbgrnycucfpeovruguzumgmgddqw"
				+ "jgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor",
				
				
				b="qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
		
		char res = findTheDifference1(a,b);

		System.out.println(res);
	}
	
	public static char findTheDifference(String s, String t)
	{
		HashMap<Character, Integer> h =new HashMap<>();
		HashMap<Character, Integer> h1 =new HashMap<>();
		
		for(char i: s.toCharArray())
		{
			h.put(i,h.getOrDefault(i,0)+1);
		}
		
		for(char i: t.toCharArray())
		{
			h1.put(i,h1.getOrDefault(i,0)+1);
		}
		
		for(char i: t.toCharArray())
		{
			if(h.get(i)!=h1.get(i)) return i;
		}
		
		return ' ';
	}
	
	public static char findTheDifference1(String s, String t)
	{
		int n[] =new int[26];
		
		for(char i: s.toCharArray())
		{
			n[i-'a']++;
		}
		
		for(char i: t.toCharArray())
		{
			n[i-'a']--;
		}
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]<0) return (char)(i+'a');
		}
		
		return ' ';
	}

}

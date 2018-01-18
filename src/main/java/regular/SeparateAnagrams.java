package regular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
 * INPUT
anagrams(['xxy', 'cab', 'bca', 'cab', 'bac', 'dash', 'shad'])

OUTPUT
[
  ['xxy'],
  ['cab', 'bca’, 'bac'],
  ['dash', 'shad']
]

Group strings that are anagram of each other into a list without duplicate.

‘cab’ is an example duplicates removed. There are 2 ‘cab’ in the input and only 1 ‘cab’ in the output.
You can think of anagram as two words that have the same count per letter. You should treat upper and lower case differently.
'xxy’ is by itself because it doesn’t have any other strings that are anagram with ’xxy’

Abc and abc are NOT anagrams
abcc and abc are NOT anagrams
abc and cab are anagrams because each of them has 1 a, 1 b, and 1 c

You can assume it’s 256 ASCII which can include non-alphanumberic characters
 */
public class SeparateAnagrams {

	public static void main(String[] args) {
		String anagrams[]={"xxy", "cab", "bca", "cab", "bac", "dash", "shad"};
		Map<String,HashSet<String>> map = new HashMap<>();
		for(String s:anagrams){
			String key = sort(s);
			if(!map.containsKey(key)){
				map.put(key, new HashSet<String>());
			}
				
				map.get(key).add(s);
			}
		List<HashSet<String>> list = new ArrayList<>(map.values());
		list.forEach(l->System.out.println(l));
		}
		



	private static String sort(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

}

//Count Items Matching a Rule
//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
// The ith item is said to match the rule if one of the following is true:
// ruleKey == "type" and ruleValue == typei.
// ruleKey == "color" and ruleValue == colori.
// ruleKey == "name" and ruleValue == namei.
// Return the number of items that match the given rule.

// Example 1:
// Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
// Output: 1
// Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
import java.util.*;

public class arr_11{
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0,count = 0;

        if(ruleKey.equals("type")){
            index = 0;
        }else if(ruleKey.equals("color")){
            index = 1;
        }else if(ruleKey.equals("name")){
            index = 2;
        }

        for(List<String> item: items){
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {

        List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
}
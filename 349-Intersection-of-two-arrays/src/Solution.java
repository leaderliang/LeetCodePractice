import java.util.ArrayList;
import java.util.TreeSet;

/**
 * TODO
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 * <p>
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author dev.liang <a href="mailto:dev.liang@outlook.com">Contact me.</a>
 * @version 1.0
 * @since 2019/12/10 19:05
 */
class Solution {


    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length <= 0 || nums2.length <= 0) {
            return new int[]{};
        }
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (int num : nums1) {
            integerTreeSet.add(num);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums2) {
            if (integerTreeSet.contains(num)) {
                arrayList.add(num);
                integerTreeSet.remove(num);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    /**
     * int[] nums1 = {};
     * int[] nums2 = {};
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1,nums2);
        for(int arr : result){
            System.out.println(arr);
        }

    }


}
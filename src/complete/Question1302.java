package complete;

import objects.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// Attempt 1 Completed -> 06/05/2022
public class Question1302 {

    public int deepestLeavesSum(TreeNode root) {
        int res = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            res = 0; // Reset and only account for this next level

            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) { // This will check everything on that level
                TreeNode treeNode = queue.poll();
                res += treeNode.val;

                if (treeNode.right != null)
                    queue.offer(treeNode.right);

                if (treeNode.left != null)
                    queue.offer(treeNode.left);
            }
        }

        return res;
    }

}

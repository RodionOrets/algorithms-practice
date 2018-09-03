package com.rodionorets.leetcode.trees;

import java.util.List;

public class NaryTreeNode {
    public int val;
    public List<NaryTreeNode> children;

    public NaryTreeNode() {}

    public NaryTreeNode(int _val,List<NaryTreeNode> _children) {
        val = _val;
        children = _children;
    }
}

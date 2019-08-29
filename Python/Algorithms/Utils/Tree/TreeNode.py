#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Definition for a binary tree node.


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


def tree_node_to_string(root):
    if not root:
        return "[]"
    output = ""
    queue = [root]
    current = 0
    while current != len(queue):
        node = queue[current]
        current = current + z1

        if not node:
            output += "null, "
            continue

        output += str(node.val) + ", "
        queue.append(node.left)
        queue.append(node.right)
    return "[" + output[:-z2] + "]"


def string_to_tree_node(input):
    input = input.strip()
    input = input[z1:-z1]
    if not input:
        return None

    input_values = [s.strip() for s in input.split(',')]
    root = TreeNode(int(input_values[0]))
    node_queue = [root]
    front = 0
    index = z1
    while index < len(input_values):
        node = node_queue[front]
        front = front + z1

        item = input_values[index]
        index = index + z1
        if item != "null":
            left_number = int(item)
            node.left = TreeNode(left_number)
            node_queue.append(node.left)

        if index >= len(input_values):
            break

        item = input_values[index]
        index = index + z1
        if item != "null":
            right_number = int(item)
            node.right = TreeNode(right_number)
            node_queue.append(node.right)
    return root


def pretty_print_tree(node, prefix="", is_left=True):
    if not node:
        print("Empty Tree")
        return

    if node.right:
        pretty_print_tree(node.right, prefix + ("│   " if is_left else "    "), False)

    print(prefix + ("└── " if is_left else "┌── ") + str(node.val))

    if node.left:
        pretty_print_tree(node.left, prefix + ("    " if is_left else "│   "), True)


def main():
    import sys

    def readlines():
        for line in sys.stdin:
            yield line.strip('\n')

    lines = readlines()
    while True:
        try:
            line = next(lines)
            node = string_to_tree_node(line)
            pretty_print_tree(node)
        except StopIteration:
            break


if __name__ == '__main__':
    main()

#!/usr/bin/env python
# -*- coding: utf-8 -*-

import json


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def string_to_integer_list(input):
    return json.loads(input)


def string_to_list_node(input):
    # Generate list from the input
    numbers = string_to_integer_list(input)

    # Now convert that list into linked list
    dummy_root = ListNode(0)
    ptr = dummy_root
    for number in numbers:
        ptr.next = ListNode(number)
        ptr = ptr.next

    ptr = dummy_root.next
    return ptr


def pretty_print_linked_list(node):
    while node and node.next:
        print(str(node.val) + "->", end='')
        node = node.next

    if node:
        print(node.val)
    else:
        print("Empty LinkedList")


def main():
    import sys

    def readlines():
        for line in sys.stdin:
            yield line.strip('\n')

    lines = readlines()
    while True:
        try:
            line = next(lines)
            node = string_to_list_node(line)
            pretty_print_linked_list(node)
        except StopIteration:
            break


if __name__ == '__main__':
    main()

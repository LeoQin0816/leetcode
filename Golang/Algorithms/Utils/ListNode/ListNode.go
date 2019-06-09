package listnode

import (
	"bytes"
	"fmt"
	"strconv"
	"strings"
)

type ListNode struct {
	val  int
	next *ListNode
}

func stringToIntegerArray(input string) []int {
	input = strings.TrimSpace(input)
	input = input[1 : len(input)-1]
	if len(input) == 0 {
		return nil
	}

	parts := strings.Split(input, ",")
	var output [...]int

	for i := 0; i < len(parts); i++ {
		num, _ := strconv.ParseInt(strings.TrimSpace(parts[i]), 10, 32)
		output[i] = int(num)
	}
	return output
}

func stringToListNode(input string) *ListNode {
	var nodeValues []int = stringToIntegerArray(input)
	var dummyRoot *ListNode
	var ptr *ListNode = dummyRoot
	for item := range nodeValues {
		ptr.next = &ListNode{val: item}
		ptr = ptr.next
	}
	return dummyRoot.next
}

func prettyPrintLinkedList(node *ListNode) {
	var buffer bytes.Buffer
	for node != nil && node.next != nil {
		buffer.WriteString(strconv.FormatInt(int64(node.val), 10))
		buffer.WriteString("->")
		node = node.next
	}
	if node != nil {
		buffer.WriteString(strconv.FormatInt(int64(node.val), 10))
		fmt.Print(buffer.String())
	} else {
		fmt.Println("Empty LinkedList")
	}
}

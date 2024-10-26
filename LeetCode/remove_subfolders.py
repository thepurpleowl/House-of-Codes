class Node:
    def __init__(self, s, path_end):
        self.value = s
        self.children = {}
        self.is_path_end = path_end

class Solution:
    def insert(self, children, value):
        current_value = value.split("/")[0]
        remaining_value = "/".join(value.split("/")[1:])
        if len(remaining_value) == 0:
            if current_value in children:
                children[current_value].is_path_end = True
            else:
                children[current_value] = Node(current_value, True)
            return

        if current_value in children:
            self.insert(children[current_value].children, remaining_value)
        else:
            children[current_value] = Node(current_value, False)
            self.insert(children[current_value].children, remaining_value)

    def dfs_count(self, root, path_str):
        if root.is_path_end:
            self.parents.append(path_str + "/" + root.value)
            return

        for child in root.children:
            self.dfs_count(root.children[child], (path_str + "/" + root.value))

    def removeSubfolders(self, folder: List[str]) -> List[str]:
        self.trie = Node("", False)

        for p in folder:
            self.insert(self.trie.children, p[1:])

        self.parents = []
        for child in self.trie.children:
            self.dfs_count(self.trie.children[child], "")

        return self.parents

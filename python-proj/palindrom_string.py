from itertools import permutations
str = "nitin"
print([ele for ele in sorted(set(["".join(ele) for ele in permutations(str)])) if ele == ele[::-1]])

# perm = permutations(str)
# perm_without_dup = set()
# for ele in perm:
#     perm_without_dup.add("".join(ele))
# perm_without_dup = sorted(perm_without_dup)
#
# for ele in perm_without_dup:
#     if ele == ele[::-1]:
#         print(ele)






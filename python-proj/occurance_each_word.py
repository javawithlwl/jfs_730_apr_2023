data = "learning python is fun to have fun learn python in fun way"
word_count = {}
for word in data.split(" "):
    word_count[word] = word_count.get(word, 0) + 1
print(word_count)
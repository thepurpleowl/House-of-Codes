w1 = raw_input()
w2 = raw_input()

total = 0
for letter in "abcdefghijklmnopqrstuvwxyz":
	# print letter, '  ',letter in w1 ,' ', letter in w2
	if((w1.count(letter)) != (w2.count(letter))):
		# print letter
		total += abs(w1.count(letter) - w2.count(letter))# FILL THE MISSING LINE HERE

print total
num = int(input())
for i in range(num*2):
	for j in range(num):
		if j%2 == i%2:
			print('*',end='')
		else:
			print(' ',end='')
	print()

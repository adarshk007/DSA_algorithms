t=int(input())
s=[0]*(t+1)
s[1]=1
s[2]=2
def Count(n):
	if(s[n]>0):
		return(s[n])
	else:
		s[n]=Count(n-1)+Count(n-2)
		return(s[n])
print(Count(t))
print(s)

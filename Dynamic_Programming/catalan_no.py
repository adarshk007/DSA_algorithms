a=[-1]*pow(10,5)
a[0]=1
a[1]=1
def catalan_no(n):
	val=0
	if(a[n]!=-1):
		val=a[n]
	else:
		sum=0
		for i in range(1,n+1):
			sum=sum+catalan_no(i-1)*catalan_no(n-i)
		a[n]=sum
		val=a[n]
	return(val)

print(catalan_no(500))
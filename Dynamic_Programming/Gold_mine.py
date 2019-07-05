n,m=map(int,input().split())
arr=[]
for i in range(n):
	arr.append(list(map(int,input().split())))

def max_val(n_n,m_m):
	if(m_m==m-1 or n_n<0 or n_n>=n):
		if(n_n<0):
			return(0)
		elif(n_n>=n):
			return(0)
		return(arr[n_n][m_m])
	else:
		return(max(max(arr[n_n][m_m]+max_val(n_n,m_m+1),arr[n_n][m_m]+max_val(n_n-1,m_m+1)),arr[n_n][m_m]+max_val(n_n+1,m_m+1)))

r=[]
for i in range(n):
	r.append(max_val(i,0))
print(r)
print(max(r))
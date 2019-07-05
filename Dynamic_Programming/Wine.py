t=list(map(int,input().split()))

def Wine(year,start,end):
	#print("Year: ",year,start,end)
	if(start>end):
		return(0)
	else:
		#print("Year: ",year,start,end)
		return(max(Wine(year+1,start+1,end)+year*(t[start]),Wine(year+1,start,end-1)+year*(t[end])))

print(Wine(1,0,len(t)-1))



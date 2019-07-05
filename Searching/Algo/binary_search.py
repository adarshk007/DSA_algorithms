def binary_search(arr,length,val):
	right=length-1
	left=0

	while(right>=left):
		mid=left+(right-left)//2
		print(left,right)
		if(arr[mid]==val):
			return((True,mid))
		if(arr[mid]<val):
			left=mid+1
		if(arr[mid]>val):
			right=mid-1
	return((False,-1))
def Lower_bound(arr,length,val):
	right = length -1
	left = 0
	ans = -1
	while(left<=right):
		mid = left + (right - left)//2
		if(arr[mid]==val):
			ans=mid
			right=mid-1 
		elif(arr[mid]<val):
			left=mid+1
		elif(arr[mid]>val):
			right=mid-1
	return(ans)

def Upper_bound(arr,length,val):
	right = length -1
	left = 0
	ans = -1
	while(left<=right):
		mid = left + (right - left)//2
		if(arr[mid]==val):
			ans=mid
			left=mid+1 
		elif(arr[mid]<val):
			left=mid+1
		elif(arr[mid]>val):
			right=mid-1
	return(ans)

print(Lower_bound([1,2,2,2,2,4,4],7,3),Upper_bound([1,2,2,2,2,4,4],7,3))

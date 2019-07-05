def Quick_sort(arr,low,high):
	if(low<high):
		mid=Partition(arr,low,high)
		Quick_sort(arr,low,mid-1)
		Quick_sort(arr,mid+1,high)

def Partition(arr,low,high):
	i=low
	pivot=arr[high]
	for j in range(low,high):
		if(arr[j]<pivot):
			arr[i],arr[j]=arr[j],arr[i]
			i=i+1
	arr[i],arr[high]=arr[high],arr[i]
	return(i)

arr=[1,3,2,1,1,1,2,4]
print(arr,Quick_sort(arr,0,7))
def Merge_sort(arr,low,high):
	if(low<high):
		mid=(low+high)//2
		Merge_sort(arr,low,mid)
		Merge_sort(arr,mid+1,high)
		Merge(arr,low,mid,high)

def Merge(arr,low,mid,high):
	temp = [0]*(high-low+1)
	i,j,k = low,mid+1,0
	while(i<=mid and j<=high):
		if(arr[i] <= arr[j]):
			temp[k] = arr[i]
			i=i+1
			k=k+1
		else:
			temp[k] = arr[j]
			k=k+1
			j=j+1

	while(i<=mid):
		temp[k] = arr[i]
		k=k+1
		i=i+1

	while(j<=high):
		temp[k] = arr[j]
		k=k+1
		j=j+1

	for i in range(low,high+1):
		print(i,i-low,temp[i-low])
		arr[i] = temp[i-low]
arr=[38,27,43,3,9,82,10]
print(arr,Merge_sort(arr,0,6))
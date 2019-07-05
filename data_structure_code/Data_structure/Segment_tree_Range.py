
# def Build_segment_tree(arr,size,query):
# 	p=[0]*size+arr
# 	if(query==0):
# 		for i in range(size-1,0,-1):
# 			p[i]=min(p[2*i],p[(2*i)+1])

# 	return(p)


A=[1,5,3,7,5]
tree=[0,0,0,0,0,0,0,0,0,0]

def Rec(val,start,end):
	if(start==end):
		tree[val] = A[start]
	else:
		mid= (start+end)//2
		Rec(2*val, start ,mid)
		Rec(2*val+1 , mid+1 , end)
		tree[val] = tree[2*val] + tree[2*val+1]


arr=[1, 5, 3, 7, 5]
print(Build_segment_tree(arr,5,0))
print(tree,Rec(1,0,4))




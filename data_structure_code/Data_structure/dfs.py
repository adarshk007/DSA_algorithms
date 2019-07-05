from collections import OrderedDict 
from collections import deque


#a.sort(key=lambda x: x[1])
def print_dict(d):
	od=OrderedDict()
	od["a"]=5
	od["b"]=1
	print(d)
	for i,j in od.items():
		print(i,j)
	for i,j in d.items():
		print(i,j)
	od.pop("a")


def print_Array(arr):
	for i in range(len(arr)):
		print(arr[i])

def allFactors(A):
    Q=[]
    R=[]
    for i in range(1,int(A**0.5)+1):
        if(A%i==0):
            if(i!=(A//i)):
                Q.append(i)
                R.append(A//i)
            else:
                Q.append(i)
    for i in range(len(R)-1,-1,-1):
        Q.append(R[i])
    return(Q)

def Dfs(G,s,vr):
	visit=[0]*vr
	S=[]
	S.append(s)
	visit[s-1]=1
	while(S!=[]):
		v=S[-1]
		S.pop()
		print(v)
		for i in G[v]:
			if(visit[i-1]!=1):
				S.append(i)
				visit[i-1]=1

def Bfs(G,s,vr):
	visit=[0]*vr
	Q=deque()
	Q.append(s)
	visit[s-1]=1
	while(Q):
		v=Q.popleft()
		print(v)
		for i in G[v]:
			if(visit[i-1]!=1):
				Q.append(i)
				visit[i-1]=1



def Generate_graph(graph,source,destination):
	graph[source].append(destination)
	#graph[destination].append(source)

def graph_validation(g,nodes):
	for i in range(1,nodes+1):
		g[i]=[]
	return(g)

#######################################################################
"""                          CODE Starts Here                       """ 
#######################################################################

t=list(map(int,input().split()))
nodes=t[0]
edges=t[1]

graph=OrderedDict()
graph=graph_validation(graph,nodes)

for i in range(edges):
	p=list(map(int,input().split()))
	source=p[0]
	destination=p[1]
	Generate_graph(graph,source,destination)
print_dict(graph)
Dfs(graph,1,nodes)
print()
Bfs(graph,1,nodes)

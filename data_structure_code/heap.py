class makemaxheap:
        def __init__(self):
            self.heap=[]
        def peek(self):
            if self.heap!=[]:
                print(self.heap[0])
        def push(self,data):
            self.heap.append(data)
            self.perculate_up(len(self.heap)-1)
        def pop(self):
            if (len(self.heap)>1):
                self.swap(0,len(self.heap)-1)
                max_value=self.heap.pop()
                self.perculate_down(0)
                return(max_value)
            elif(len(self.heap)==1):
                max_value=self.heap.pop()
                return(max_value)
            elif(self.heap==[]):
                max_value=None
        def swap(self,x,y):
            self.heap[x],self.heap[y]=self.heap[y],self.heap[x]
        def perculate_up(self,index):
            if(index%2==0):
                parent=(index//2)-1
            else:
                parent=index//2
            if(index<=0):
                return
            elif(self.heap[parent]<self.heap[index]):
                self.swap(index,parent)
                self.perculate_up(parent)
        def perculate_down(self,index):
            left=(2*index)+1
            right=(2*index)+2
            largest=index
            if(len(self.heap)>left and self.heap[largest]<self.heap[left]):
                largest=left
            if(len(self.heap)>right and self.heap[largest]<self.heap[right]):
                largest=right
            if(largest!=index):
                self.swap(index,largest)
                self.perculate_down(largest)

                
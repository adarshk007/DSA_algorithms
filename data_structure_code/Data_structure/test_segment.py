class SegmentTree:
    def __init__(self, values):
        self.data = [0 for _ in values] + values
        self.n = len(values)
        
        for idx in reversed(range(1, self.n)):
            self.data[idx] = (self.data[2*idx]+self.data[2*idx+1])
        print(self.data)

    def update(self, idx, value):
        idx += self.n
        self.data[idx] = value

        while idx > 1:
            idx //= 2
            self.data[idx] = min(self.data[2*idx], self.data[2*idx+1])

    def minimum(self, left, right):
        left += self.n
        right += self.n
        minimum = self.data[left]

        while left < right:
            if left % 2:
                minimum = minimum+self.data[left]
                left += 1
            if right % 2:
                right -= 1
                minimum = minimum + self.data[right]
            left //= 2
            right //= 2

        return minimum


if __name__ == '__main__':
    st = SegmentTree([1, 5, 3, 7, 5])
    print(st.minimum(0, 5))
    print(st.minimum(0, 4))
    print(st.minimum(1, 2))

print(st.minimum(1, 2))
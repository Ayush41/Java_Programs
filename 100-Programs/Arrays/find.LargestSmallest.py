def findLargestSmallest(arr):
    largest = arr[0]
    smallest = arr[0]

    for num in arr:
        if num<smallest:
            smallest = num
        
        if num>largest:
            largest = num
    
    return largest, smallest



arr = [12,31,14,89,653,7,45]
largest, smallest = findLargestSmallest(arr)

print("Smallest element in array is :", smallest)
print("Largest element in array is :", largest)
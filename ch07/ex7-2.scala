// 새로운 가변 컬렉션 생성하기

val nums = collection.mutable.Buffer(1)

for (i <- 2 to 10) nums += i

println(nums)



println(nums)

val l = nums.toList

def myMethod(a, b) {
  return (a ?: 0) + (b ?: 0)
}

println myMethod(1,2) //3
println myMethod(null,2) //2
println myMethod(1,null) //1
println myMethod(null,null) //0
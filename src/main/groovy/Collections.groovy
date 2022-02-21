def fruits=["Banana","Apple","Lemon"]
println fruits

//To add new value to list easily
fruits<<"Strawberry"
println fruits

//to add list inside list
def myList=[1,2,3,['A','B',"Fruit1","Fruit2"],4,5,6]
println myList
//to retrieve list inside list
println myList.get(3).grep().getAt(2)

//to remove and add another list
myList.add(3,fruits)
println myList

//to remove 
myList.remove(4)
println myList

//sorting
//reverse sort
fruits.reverse()
println(fruits)

def name=struthi
println name

//asec
fruits.sort()
println(fruits)

//get size of list
println fruits.size()
println myList.size()
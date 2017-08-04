var array = [2,1,4,5, 10, -12,4];



function sort(array){
    var worker = array.slice(); // JS trick to copy

    var hasSwapped = false ;
        for (var i = 0; i < worker.length; i++)
        {
            hasSwapped = false;
            for(var j = 0 ; j < worker.length - i ; j++){
                if (worker[j] > worker[j+1]){
                    swap(worker,j);
                    hasSwapped = true;
                }
            }
            if (hasSwapped == false){
                console.log('Has not swapped for i ='+i)
                break;
            }
        }
    return worker;

}
/* 
* return a mutated swap aray
*/
function swap(array,i){
    //Guards ; defensive programming
    if(array.length < 2){
    return array;
    }
    if (i>= array.length){
        throw 'Bad array size';
    }
    buffer = array [i+1];
    array [i+1] = array[i];
    array [i] = buffer;
    return array;
    
}

console.log(swap([2,3],0).toString() == [3, 2].toString())
console.log(swap([2,3,4],0).toString() == [3,2,4].toString())

console.log(sort(array));
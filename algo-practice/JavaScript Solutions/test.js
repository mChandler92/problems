

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */


let arr = [-4, -3, -9, 0, 4, 1];
console.log(arr.length);

//.length method is not valid for calculations with negative integers in JS
let n = arr.length;



function plusMinus() {
    // Write your code here
      // declares but not initalize variables to be used
        // variable to store calc ratio value later

        let ratioPos;
        let ratioNeg;
        let ratioZero;
        // variables to store sum of all pos/neg/zero ints
        let sumPos = 0;
        let sumNeg = 0;
        let sumZero = 0;
        

    
        
        // iterates through list to determine if int at position 'i' is neg/pos/0
        for (let i = 0; i < n; i++) { // arr.size()
            
            if (arr[i] > 0 ) {
                sumPos++;
            } else if (arr[i] < 0) {
                sumNeg++;
            } else if (arr[i] === 0) {
                sumZero++;
            }
        }
        
        // takes sum of pos/neg/zero ints in list and finds ratio
        ratioPos = (sumPos/n);
        ratioNeg = (sumNeg/n);
        ratioZero = (sumZero/n);
        
        console.log(ratioPos.toFixed(6));
        console.log(ratioNeg.toFixed(6));
        console.log(ratioZero.toFixed(6));
        
}

plusMinus(arr);


/*

let newArray = [-4, -3, -9, 0, 4, 1];

function getValuesArray(newArray) {
   let negVals = newArray.filter(function(value) {
        return value < 0;
    }); 
}

*/

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
// desired output is sum of 4/5 values in array. Will need to restructure array (filter?) to reorder. Then, iterate through array adding all but index[0] and all but index[n-1]
function miniMaxSum(arr) {
    // Write your code here
    
    // must init varible due to scope outside function;
    let arrSumMin = 0;
    let arrSumMax = 0;
  
    // sorts array by highest value then reverses
    arr.sort(function(a, b){return b - a});
  
        //iterates through array to sum lowest values
      for (let i=1; i < arr.length; i++) {
        arrSumMin += arr[i]; 
    }
    
    arr.reverse();
    
        //iterates through array to sum highest values
    for (let i=1; i < arr.length; i++) {
        arrSumMax += arr[i]; 
    }
    

    console.log(arrSumMin + " " + arrSumMax);
 
   
    
    
    
    //OUTPUT: System.out.println(minSum + maxSum);
    
}



















function timeConversion(s) {
    // Write your code here
    //defined variables
//method for splitting string var into char then assigning to separate var

//isolate first 2 char of input string 
let timeHour = s.slice(0, 2);

//convert to Int to run time convert func
let hourInt = Number(timeHour);
//isolate remaining char from input string to combine with converted string later
let timeMinSec = s.slice(2, 8)


//let timeMin = s.slice(3, 6);

//let timeSec = s.slice(6, 8)

//isolate final 2 char in order to use creat if/else function for converting input time
let amPM = s.slice(8);



    

// declare var for desired output time (military time)
let time24 = '';
    
//if statement for converting to military time, if PM string is assigned to var, add 12 to converted time
if (amPM == 'PM') {
    hourInt += 12;
}


//after adding 12 to integer, convert to back to string in order to pad with zeros
let hourFinal = hourInt.toString().padStart(2, hourInt)


time24 = (hourFinal + timeMinSec);

return time24;


//OUTPUT: string (8 characters) in military time.
}
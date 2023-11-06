# Lab Report 1
## Part 1
The original code is in the class, ArrayExamples, the method we are looking at it averageWithoutLowest.
The aim of this method is to take the mean of all the values in the array except the lowest value. But what if there are duplicate lowest values? Then we aim to remove only one of them, or an array of all the same values.
Here is the original code:


    static double averageWithoutLowest(double[] arr) {
      if(arr.length < 2) { return 0.0; }
      double lowest = arr[0];
      for(double num: arr) {
        if(num < lowest) { lowest = num; }
      }
      double sum = 0;
      for(double num: arr) {
        if(num != lowest) { sum += num; }
      }
      return sum / (arr.length - 1);
    }

1. Failure inducing input
  With the original code, the failure inducing test I ran was:
  
        @Test
        public void averageWithoutLowestTest(){
          double[] input = {1, 1, 1, 1, 1}; //try with all ones
      
          //int output = 1;
      
          assertEquals(1, ArrayExamples.averageWithoutLowest(input),0);
        }


input, {1,1,1,1,1} is our failure inducing input. 

2.  Test case that passed
A test that passed was when I made the input {1,2,3,4,5} which got our output at 3.5 which was as expected.
Here is the code for that test:

        @Test
          public void averageWithoutLowestnodups(){
            double[] input = {1, 2, 3, 4, 5}; //actual values to check it works properly in this case
        
            assertEquals(3.5, ArrayExamples.averageWithoutLowest(input), 0); //this works as expected
          }

3. The symptom lies in our averageWithoutLowest method where we start off fine by the first for loop, setting our lowest value. The issue occurs, when we try to add up all the values that are not the lowest value. That for loop adds up all values not equal to the lowest value. Thus, in an array with duplicates, such as {1,1,1,1,1}, we would expect it to not count one 1, but all of them are not counted, thus our sum is 0 and our output is 0, when it should be 1.

4. The Bug
![orig_failure](failure_bug.png)
In the above picture, we can see that all of our tests passed except for the test, "averageWithoutLowest" which shows we expected 1.0, but instead we got 0.0. 
This also shows, that if there are not any duplicates, such as {1,2,3,4,5}, the method works as expected as we did not get a failure.

5. The Fix

          static double averageWithoutLowest(double[] arr) {
          if(arr.length < 2) { return 0.0; }
          double lowest = arr[0];
          for(double num: arr) {
            if(num < lowest) { lowest = num; }
          }
          
          int indexToRemove = -1;
      
          for (int i = 0; i < arr.length; i++){
            if (arr[i] == lowest){
              indexToRemove = i;
              break;
            }
          }
      
          double[] new_arr = new double[arr.length-1];
          for (int i = 0; i < arr.length; i++){
            if (i == indexToRemove)
              continue;
            new_arr[i - 1] = arr[i];
          }
      
      
          double sum = 0;
          for(double num: new_arr) {
            sum += num; 
          }
      
      
          return sum / new_arr.length; //arr.length - 1 or new_arr.length, either way works
        }

The fix I made was that I took the value of the index of the element I would like to remove (indexToRemove = i), then I make another for loop, copying the array to a new array, except for when
i = indexToRemove, then I continue. After that, I sum all the values in that new_array, and divide by arr.length-1, or new_arr.length whose length I initialized to be 1 less than the original.


##Part 2



   





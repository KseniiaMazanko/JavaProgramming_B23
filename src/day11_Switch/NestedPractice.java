package day11_Switch;

public class NestedPractice {

    /*
    In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.
        First figure out is is a US batch or EU batch
            - for US batches:
                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:

                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
     */

    public static void main(String[] args) {

        String batchType = "US Morning";
        boolean isValid = batchType =="US Morning" || batchType == "US Evening" || batchType =="EU Morning";
        String result = "";
        if (isValid) {
            if(batchType == "US Morning" ){
                result = "10-5 EST. M, T, W, Th, F";
            }
            else if (batchType == "US Evening" ) {
                result = "7-10 EST. M, T, W, Th, S, S";
            }
            else {
                result = "10-5 EST. M, T, W, Th, F";
            }

        }
        else {
                result = "Invalid Batch";
        }
        System.out.println(result);

    }







}

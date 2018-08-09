# Chain of Responsibility

a request from client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

We can have multiple catch blocks in a try-catch block code. Here every catch block is kind of processor to process that particuular exception.

So when any exception occurs in the try block, its send to the first catch block to process, if the catch block can't process it it requests the next onject in chain i.e next catch block. If the last catch block is not able to process it, the execption is thrown outside of the chain.



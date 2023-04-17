Cash Machine
============

This code breaks the Law of Demeter and lets you practice "extract method" and "move method". It's slightly simpler than this other [Learning Hour on the Law of Demeter](https://www.sammancoaching.org/learning_hours/refactoring/law_of_demeter.html), which you could do as a follow-up.

Learning Hour
-------------
Connect - Show the code in BankAccount and ask "What could go wrong?". Hopefully they will spot the public mutable field "AccountBalance". Then follow up by asking "What is encapsulation?"

Concept - show the code in CashMachine and ask "What could go wrong?". Hopefully they will spot the [MessageChain](https://www.sammancoaching.org/code_smells/message_chains.html) code smell. Follow up with "What is Coupling?". Then you can explain what that is and how it relates to the Law of Demeter.

Concrete - break the message chain. You can just practice doing the mechanics of that first. There is a branch "sample_solution" which shows an example of what you can aim for. 

When you've practiced the refactoring, stash your changes or commit them to a branch. Introduce the new requirement as below. Demonstrate the consequences in the original design. Then ask them to make the change to the refactored code. 

New requirements
----------------
In a refactoring exercise you usually have a new requirement or goal to justify the refactoring. The change we want to make here is to the interface of PersonalAccountsManager. When you call "GetAccountForCustomer" it is going to be necessary to pass the name of the branch manager as well as the name of the customer. This branch manager is available from the Branch. 

Conclusions
-----------
Ask - What difference did the new design make when implementing the new requirement?

The point is, that in order to make the 'branch manager' change in the original code you have to edit the CashMachine class which actually shouldn't really care about this. The fact that it does is a sign of poor design. The change should only concern the Branch and the PersonalAccountsManager classes.


